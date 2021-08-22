package cn.hamster3.bot.event;

import cn.hamster3.bot.core.BotCore;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.utils.MessageUtils;
import com.google.gson.JsonObject;

import java.io.IOException;

public class OtherEvent extends Event {
    //撤回消息
    private String recall;
    // 事件类型
    protected String message;
    protected MessageType eventType;


    public OtherEvent(BotCore botCore, JsonObject object) {
        super(botCore, object);
        JsonObject currentPacket = object.getAsJsonObject("CurrentPacket");
        JsonObject eventMsg = currentPacket.getAsJsonObject("Data");
        JsonObject data =  eventMsg.getAsJsonObject("EventMsg");
        System.out.println("撤回data" + data.get("MsgType").getAsString());
//        try {
//            eventType = eventType.valueOf();
//        } catch (IllegalArgumentException e) {
//            eventType = eventType.UnknownMsg;
//            recall = "[此消息类型暂不支持解析]";
//        }

    }

    public MessageType getEventType() {
        return eventType;
    }
}