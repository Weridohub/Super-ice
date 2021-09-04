package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.data.Picture;
import cn.hamster3.bot.data.WeMessageType;
import cn.hamster3.bot.utils.MessageUtils;
import cn.hamster3.bot.utils.WeMessageUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

public class WeGroupMessageEvent  extends WeMessageEvent {
    // 群号(所有消息类型均有)
    private String from_wxid;
    // 群名称(所有消息类型均有)
    private String from_name;
    // 发送者群名片(所有消息类型均有)
    private String final_from_name;
    // 消息顺序号(所有消息类型均有)
    private long msgid;
    // 消息发送时间(所有消息类型均有)
    private long timestamp;

    public WeGroupMessageEvent(WeBotCore webotCore, JsonObject params) {
        super(webotCore, params);
        JsonObject currentPacket = params.getAsJsonObject("CurrentPacket");
        JsonObject data = currentPacket.getAsJsonObject("Data");
        System.out.println("群消息data:"+data);
        try {
            type = WeMessageType.valueOf(data.get("type").getAsString());
            System.out.println("type!!!!!"+type);
        } catch (IllegalArgumentException e) {
            type = WeMessageType.UnknownMsg;
            msg = "[此消息类型暂不支持解析]";
        }

        from_name = data.get("from_name").getAsString();
        final_from_name = data.get("final_from_name").getAsString();
        msgid = data.get("msgid").getAsLong();
        timestamp = data.get("timestamp").getAsLong();


        switch (type) {
            case WeTextMessge: {
                msg = data.get("msg").getAsString();
                break;
            }

        }
    }


    @Override
    public JsonObject reply(String msg) throws IOException {
        return getweBotCore().sendWeMessage(
                        WeMessageUtils.sendWeText(from_wxid,msg)
        );
    }

    @Override
    public JsonObject reply(String msg, String image) throws IOException {
        return getweBotCore().sendWeMessage(
                WeMessageUtils.sendWeText(from_wxid, msg, image)
        );
    }
}
