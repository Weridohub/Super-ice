package cn.hamster3.bot.core;

import cn.hamster3.bot.event.*;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.socket.client.Ack;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public class WeBotCore {
    private static Logger logger = Logger.getLogger("WeBOT");

    private String host;
    private int port;
    private Socket socket;

    private ArrayList<Listener> listeners;

    public WeBotCore(String host, int port) throws URISyntaxException {
        listeners = new ArrayList<>();
        this.host = host;
        this.port = port;

        IO.Options options = new IO.Options();
        options.transports = new String[]{"websocket"};
        socket = IO.socket("http://" + host + ":" + port, options);

        socket.on("connect", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JsonObject object = new JsonObject();
                logger.info("AQBot链接成功: " + object);
                System.out.println("AQBot链接成功: " + object);
                callEvent(new WeSocketConnectedEvent(WeBotCore.this, object));

                socket.emit("GetWebConn",  (Ack) args1 -> {
                    logger.info("AQBot注册完成, 服务器返回: " + args1[0]);
                    callEvent(new WeSocketRegisteredEvent(WeBotCore.this,null));
                });
                socket.off("connect", this);
            }
        });
//        socket.on("OnGroupMsgs", args -> {
//            System.out.println(Arrays.toString(args));
//            callEvent(new GroupMessageEvent(this, JsonParser.parseString(args[0].toString()).getAsJsonObject()));
//        });

    }

    public void start() {
        socket.connect();
        logger.info("正在连接至AQBot...");
    }

    /**
     * 发送一条消息
     *
     * @param data 消息内容，一般情况下请使用@{MessageUtils}
     * @return 发送后返回的信息（是否发送成功之类的
     * @throws IOException 消息发送失败时的异常
     */
    public JsonObject sendWeMessage(JsonObject data) throws IOException {
        URL url = new URL("http://" + host + ":" + port);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setUseCaches(false);

        connection.setDoOutput(true);
        connection.getOutputStream().write(data.toString().getBytes(StandardCharsets.UTF_8));
        return JsonParser.parseReader(new InputStreamReader(connection.getInputStream())).getAsJsonObject();
    }
    public JsonObject sendVoice(JsonObject data) throws IOException {
        URL url = new URL("http://" + host + ":" + port);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setUseCaches(false);

        connection.setDoOutput(true);
        connection.getOutputStream().write(data.toString().getBytes(StandardCharsets.UTF_8));
        return JsonParser.parseReader(new InputStreamReader(connection.getInputStream())).getAsJsonObject();
    }

    /**
     * 发送一条消息，忽略异常抛出
     *
     * @param data 要发送的数据
     * @return 发送后返回的信息（是否发送成功之类的
     */
    public JsonObject sendWeMessageIgnoreException(JsonObject data) {
        try {
            return sendWeMessage(data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 刷新Keys。
     *
     *
     * @return IOT返回信息
     */
    public JsonObject refreshKeys( ) throws IOException {
        URL url = new URL("http://" + host + ":" + port);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setUseCaches(false);

        return JsonParser.parseReader(new InputStreamReader(connection.getInputStream())).getAsJsonObject();
    }

//    public JsonObject mute(long groupID, long userID, long time) throws IOException {
//        URL url = new URL("http://" + host + ":" + port + "/v1/LuaApiCaller?qq=" + qq + "&funcname=SendMsg&timeout=10");
//
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("POST");
//        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
//        connection.setRequestProperty("Charset", "UTF-8");
//        connection.setRequestProperty("Connection", "Keep-Alive");
//        connection.setUseCaches(false);
//
//        connection.setDoOutput(true);
//
//        JsonObject data = new JsonObject();
//
//        connection.getOutputStream().write(data.toString().getBytes(StandardCharsets.UTF_8));
//        return JsonParser.parseReader(new InputStreamReader(connection.getInputStream())).getAsJsonObject();
//    }

    public boolean addListener(Listener listener) {
        return listeners.add(listener);
    }

    public boolean removeListener(Listener listener) {
        return listeners.remove(listener);
    }

    public void callEvent(WeEvent weEvent) {
        ArrayList<InvokeObject> invokeObjects = new ArrayList<>();
        for (Listener listener : listeners) {
            for (Method method : listener.getClass().getMethods()) {
                if (method.getParameterCount() != 1) {
                    continue;
                }
                EventHandler eventHandler = method.getAnnotation(EventHandler.class);
                if (eventHandler == null) {
                    continue;
                }
                if (!method.getParameterTypes()[0].isInstance(weEvent)) {
                    continue;
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    continue;
                }
                invokeObjects.add(new InvokeObject(listener, method));
            }
        }
        invokeObjects.sort(Comparator.comparingInt(InvokeObject::getPriority));

        for (InvokeObject object : invokeObjects) {
            if (weEvent.isCancelled() && object.isIgnoreCancelled()) {
                continue;
            }
            object.invoke(weEvent);
        }
    }
}
