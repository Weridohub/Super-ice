package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

public class PlanListener implements Listener {
    @EventHandler
    public void planSelect(MessageEvent event) {

        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().equalsIgnoreCase("日记")) {
            return;
        }
        if (event.getSender() != 1228777917) {
            event.replyIgnoreException("你没有这个权限!");
            return;
        }
        event.replyIgnoreException(
                "2021年8月12日14:15:33"+"\n"
                        +"  • 在公司新建了MessageListen"+"\n" +
                "2021年8月12日09:22:56"+"\n"
                        +"  • 在家里新建了ConsunmeListen"+"\n" +
                "2021年8月9日21:33:11"+"\n"
                        +"  • 在家里搭建开发环境"+"\n" +
                "2021年8月7日00:08:31"+"\n"
                        +"  • 恢复了qq群"+"\n" +
                "2021年7月04日13:46:31"+"\n"
                        +"  • 数据库消费consunme表更新"+"\n"
                        +"  • 待解决所有数据打印"+"\n"+
                "2021年6月21日17:14:41"+"\n"
                        +"  • 建立家庭消费数据库"+"\n"
                        +"  • 项目加入了mysql，成功查询到表"+"\n"+
                "2021年6月20日16:57:41"+"\n"
                        +"  • 添加当天天气查询"+"\n"+
                        "  • 家庭记钱（开发中..）"
        );

    }
}
