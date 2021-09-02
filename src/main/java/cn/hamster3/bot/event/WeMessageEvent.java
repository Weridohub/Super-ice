package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import com.google.gson.JsonObject;

public abstract class WeMessageEvent extends  WeEvent {
    public WeMessageEvent(WeBotCore webotCore, JsonObject params) {
        super(webotCore, params);
    }
}
