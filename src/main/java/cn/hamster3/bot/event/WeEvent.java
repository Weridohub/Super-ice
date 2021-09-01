package cn.hamster3.bot.event;

import cn.hamster3.bot.core.WeBotCore;
import com.google.gson.JsonObject;

public class WeEvent {
    private WeBotCore weBotCore;
    private JsonObject params;
    private boolean cancelled;

    public WeEvent(WeBotCore webotCore, JsonObject params) {
        this.weBotCore = webotCore;
        this.params = params;
        cancelled = false;
    }

    public WeBotCore getweBotCore() {
        return weBotCore;
    }

    public JsonObject getParams() {
        return params;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
