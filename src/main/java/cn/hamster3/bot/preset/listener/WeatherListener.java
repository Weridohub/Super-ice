package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;
import net.sf.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WeatherListener implements Listener {

    private static Logger logger = Logger.getLogger("天气");
    // 天气情况查询接口地址
    public static String API_URL = "http://apis.juhe.cn/simpleWeather/query";
    // 接口请求Key
    public static String API_KEY = "34416980ce96e7498764e91d4943ac05";
    @EventHandler
    public void todayWeather(MessageEvent event){
        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().matches("(.*)天气")) {
            return;
        }

        String cityName =event.getMessage().replace("天气","");

        System.out.println(cityName);


        Map<String, Object> params = new HashMap<>();//组合参数
        params.put("city", cityName);
        params.put("key", API_KEY);
        String queryParams = urlencode(params);

        String response = doGet(API_URL, queryParams);
        try {
            JSONObject jsonObject = JSONObject.fromObject(response);
            int error_code = jsonObject.getInt("error_code");
            if (error_code == 0) {
                System.out.println("调用接口成功");
                JSONObject result = jsonObject.getJSONObject("result");
                JSONObject realtime = result.getJSONObject("realtime");

                System.out.printf("城市：%s%n", result.getString("city"));
                event.replyIgnoreException(
                        "城市："+result.getString("city")+"\n"+
                        "天气："+realtime.getString("info")+"\n"+
                        "温度："+realtime.getString("temperature")+"\n"+
                        "风向："+ realtime.getString("direct")+"\n"+
                        "风力："+realtime.getString("power")+"\n"+
                        "空气质量："+ realtime.getString("aqi")
                );
/*               System.out.printf("天气：%s%n", realtime.getString("info"));
                System.out.printf("温度：%s%n", realtime.getString("temperature"));
                System.out.printf("湿度：%s%n", realtime.getString("humidity"));
                System.out.printf("风向：%s%n", realtime.getString("direct"));
                System.out.printf("风力：%s%n", realtime.getString("power"));
                System.out.printf("空气质量：%s%n", realtime.getString("aqi"));*/
            } else {
                event.replyIgnoreException("调用接口失败：" + jsonObject.getString("reason"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    /**
     * 根据城市名查询天气情况
     *
     * @param cityName
     */

    /**
     * get方式的http请求
     *
     * @param httpUrl 请求地址
     * @return 返回结果
     */
    public static String doGet(String httpUrl, String queryParams) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String result = null;// 返回结果字符串
        try {
            // 创建远程url连接对象
            URL url = new URL(new StringBuffer(httpUrl).append("?").append(queryParams).toString());
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接方式：get
            connection.setRequestMethod("GET");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(5000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(6000);
            // 发送请求
            connection.connect();
            // 通过connection连接，获取输入流
            if (connection.getResponseCode() == 200) {
                inputStream = connection.getInputStream();
                // 封装输入流，并指定字符集
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                // 存放数据
                StringBuilder sbf = new StringBuilder();
                String temp;
                while ((temp = bufferedReader.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append(System.getProperty("line.separator"));
                }
                result = sbf.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connection.disconnect();// 关闭远程连接
            }
        }
        return result;
    }

    /**
     * 将map型转为请求参数型
     *
     * @param data
     * @return
     */
    public static String urlencode(Map<String, ?> data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ?> i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String result = sb.toString();
        result = result.substring(0, result.lastIndexOf("&"));
        return result;
    }


}
