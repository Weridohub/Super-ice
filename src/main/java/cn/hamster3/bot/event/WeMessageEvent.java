package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.data.WeMessageType;
import com.google.gson.JsonObject;

import java.io.IOException;

public abstract class WeMessageEvent extends  WeEvent {
    // 发送者ID
    protected long final_from_wxid;
    // 消息内容
    protected String msg;
    // 消息类型
    protected WeMessageType type;

    public WeMessageEvent(WeBotCore webotCore, JsonObject params) {
        super(webotCore, params);
    }
    public abstract JsonObject reply(String content) throws IOException;

    public abstract JsonObject reply(String content, String image) throws IOException;

    public JsonObject replyIgnoreException(String msg) {
        try {
            return reply(msg);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JsonObject replyIgnoreException(String msg, String image) {
        try {
            return reply(msg, image);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public long getSender() {
        return final_from_wxid ;
    }

    public String getMessage() {
        return msg;
    }

    public WeMessageType getMessageType() {
        return type;
    }

    @Override
    public String toString() {
        return "WeMessageEvent{" +
                "final_from_wxid=" + final_from_wxid  +
                ", msg='" + msg + '\'' +
                ", type=" + type +
                '}';
    }
}
