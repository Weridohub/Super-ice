package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

public class MenuListener implements Listener {
    @EventHandler
    public void menu(MessageEvent event) {
        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().equalsIgnoreCase("菜单")) {
            return;
        }
        if (event.getSender() != 1228777917) {
            event.replyIgnoreException("你没有这个权限!");
            return;
        }
        event.replyIgnoreException("菜单功能如下："+"\n"
                +"屏幕截图（输入命令：截图）"+"\n"
                +"JS执行器（暂时没用)"+"\n"
                +"关机执行（输入命令：/关机)"+"\n"
                +"测试（输入命令：测试)"+"\n"
                +"天气查询（输入命令：城市天气，例如杭州天气)"+"\n"
                +"@覃肖霖，该给钱了"+"\n"
                +"更多功能开发中.."
        );

    }

}
