package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.core.BotCore;
import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.event.OtherEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;
import com.google.gson.JsonObject;

public class WithdrawListenner implements Listener {
    @EventHandler
    public void withdraw(MessageEvent event, OtherEvent eventType) {

        System.out.println("输出事件"+eventType.getEventType());
        event.replyIgnoreException("");

    }
}
