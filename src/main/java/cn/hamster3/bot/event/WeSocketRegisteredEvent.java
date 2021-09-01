package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import com.google.gson.JsonObject;

public class WeSocketRegisteredEvent extends WeEvent{
    public WeSocketRegisteredEvent(WeBotCore webotCore, JsonObject params) {
        super(webotCore, params);
    }
}
