package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

import java.util.logging.Logger;

public class TestListener implements Listener {
    private static Logger logger = Logger.getLogger("测试");

    @EventHandler
    public void onTest(MessageEvent event) {
        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().equalsIgnoreCase("测试")) {
            return;
        }
        if (event.getSender() != 1228777917) {
            event.replyIgnoreException("你没有这个权限!");
            return;
        }
        event.replyIgnoreException("测试成功");

    }
}
