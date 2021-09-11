package cn.hamster3.bot.utils;

import com.google.gson.JsonObject;

@SuppressWarnings("unused")
public class WeMessageUtils {

    public static JsonObject sendWeText(String to_wxid, String msg) {
        return sendWeText(to_wxid, msg,"");
    }

    public static JsonObject sendWeText(String to_wxid, String msg,String group_wxid) {
        JsonObject object = new JsonObject();
        object.addProperty("event", "SendTextMsg");
        object.addProperty("to_wxid", to_wxid);
        object.addProperty("msg", msg);
        object.addProperty("robot_wxid", "wxid_to0pzqv49glc22");
        object.addProperty("group_wxid", group_wxid);
        object.addProperty("member_wxid", "");
        System.out.println(object);
        return object;
    }
}
