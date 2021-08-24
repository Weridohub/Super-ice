package cn.hamster3.bot.preset.schedule;

import cn.hamster3.bot.core.BotCore;
import cn.hamster3.bot.utils.MessageUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HourSchedule {
    public static void hourSchedule() throws URISyntaxException, IOException {
        BotCore core = new BotCore("127.0.0.1", 6542, 3321530540L);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18); // 控制时
        calendar.set(Calendar.MINUTE, 46);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------");
                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/00_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }
}
