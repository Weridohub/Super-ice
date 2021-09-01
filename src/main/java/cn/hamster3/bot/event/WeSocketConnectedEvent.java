package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import com.google.gson.JsonObject;

public class WeSocketConnectedEvent extends WeEvent {
    public WeSocketConnectedEvent(WeBotCore webotCore, JsonObject params) {
        super(webotCore, params);
    }
}
