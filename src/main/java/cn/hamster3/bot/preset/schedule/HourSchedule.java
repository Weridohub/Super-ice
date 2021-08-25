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
        calendar.set(Calendar.HOUR_OF_DAY, 0); // 控制时
        calendar.set(Calendar.MINUTE, 0);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/00_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY, 1); // 控制时
        calendar1.set(Calendar.MINUTE, 0);       // 控制分
        calendar1.set(Calendar.SECOND, 0);       // 控制秒

        Date time1 = calendar1.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/01_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time1, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 2); // 控制时
        calendar2.set(Calendar.MINUTE, 0);       // 控制分
        calendar2.set(Calendar.SECOND, 0);       // 控制秒

        Date time2 = calendar2.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer2 = new Timer();
        timer2.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/02_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time2, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY, 3); // 控制时
        calendar3.set(Calendar.MINUTE, 0);       // 控制分
        calendar3.set(Calendar.SECOND, 0);       // 控制秒

        Date time3 = calendar3.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer3 = new Timer();
        timer3.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/03_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time3, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(Calendar.HOUR_OF_DAY, 4); // 控制时
        calendar4.set(Calendar.MINUTE, 0);       // 控制分
        calendar4.set(Calendar.SECOND, 0);       // 控制秒

        Date time4 = calendar4.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer4 = new Timer();
        timer4.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/04_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time4, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(Calendar.HOUR_OF_DAY, 5); // 控制时
        calendar5.set(Calendar.MINUTE, 0);       // 控制分
        calendar5.set(Calendar.SECOND, 0);       // 控制秒

        Date time5 = calendar5.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer5 = new Timer();
        timer5.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/05_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time5, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(Calendar.HOUR_OF_DAY, 6); // 控制时
        calendar6.set(Calendar.MINUTE, 0);       // 控制分
        calendar6.set(Calendar.SECOND, 0);       // 控制秒

        Date time6 = calendar6.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer6 = new Timer();
        timer6.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/06_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time6, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(Calendar.HOUR_OF_DAY, 7); // 控制时
        calendar7.set(Calendar.MINUTE, 0);       // 控制分
        calendar7.set(Calendar.SECOND, 0);       // 控制秒

        Date time7 = calendar7.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer7 = new Timer();
        timer7.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/07_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time7, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(Calendar.HOUR_OF_DAY, 8); // 控制时
        calendar8.set(Calendar.MINUTE, 0);       // 控制分
        calendar8.set(Calendar.SECOND, 0);       // 控制秒

        Date time8 = calendar8.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer8 = new Timer();
        timer8.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/08_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time8, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(Calendar.HOUR_OF_DAY, 9); // 控制时
        calendar9.set(Calendar.MINUTE, 0);       // 控制分
        calendar9.set(Calendar.SECOND, 0);       // 控制秒

        Date time9 = calendar9.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer9= new Timer();
        timer9.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/09_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time9, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar10 = Calendar.getInstance();
        calendar10.set(Calendar.HOUR_OF_DAY, 10); // 控制时
        calendar10.set(Calendar.MINUTE, 0);       // 控制分
        calendar10.set(Calendar.SECOND, 0);       // 控制秒

        Date time10 = calendar10.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer10 = new Timer();
        timer10.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/10_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time10, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar11 = Calendar.getInstance();
        calendar11.set(Calendar.HOUR_OF_DAY, 11); // 控制时
        calendar11.set(Calendar.MINUTE, 0);       // 控制分
        calendar11.set(Calendar.SECOND, 0);       // 控制秒

        Date time11 = calendar11.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer11 = new Timer();
        timer11.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/11_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time11, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar12 = Calendar.getInstance();
        calendar12.set(Calendar.HOUR_OF_DAY, 12); // 控制时
        calendar12.set(Calendar.MINUTE, 0);       // 控制分
        calendar12.set(Calendar.SECOND, 0);       // 控制秒

        Date time12 = calendar12.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer12 = new Timer();
        timer12.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/12_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time12, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar13 = Calendar.getInstance();
        calendar13.set(Calendar.HOUR_OF_DAY, 13); // 控制时
        calendar13.set(Calendar.MINUTE, 0);       // 控制分
        calendar13.set(Calendar.SECOND, 0);       // 控制秒

        Date time13 = calendar13.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer13 = new Timer();
        timer13.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/13_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time13, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar14= Calendar.getInstance();
        calendar14.set(Calendar.HOUR_OF_DAY, 14); // 控制时
        calendar14.set(Calendar.MINUTE, 0);       // 控制分
        calendar14.set(Calendar.SECOND, 0);       // 控制秒

        Date time14 = calendar14.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer14 = new Timer();
        timer14.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/14_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time14, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar15 = Calendar.getInstance();
        calendar15.set(Calendar.HOUR_OF_DAY, 15); // 控制时
        calendar15.set(Calendar.MINUTE, 0);       // 控制分
        calendar15.set(Calendar.SECOND, 0);       // 控制秒

        Date time15 = calendar15.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer15 = new Timer();
        timer15.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/15_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time15, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar16 = Calendar.getInstance();
        calendar16.set(Calendar.HOUR_OF_DAY, 16); // 控制时
        calendar16.set(Calendar.MINUTE, 0);       // 控制分
        calendar16.set(Calendar.SECOND, 0);       // 控制秒

        Date time16 = calendar16.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer16 = new Timer();
        timer16.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/16_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time16, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar17 = Calendar.getInstance();
        calendar17.set(Calendar.HOUR_OF_DAY, 17); // 控制时
        calendar17.set(Calendar.MINUTE, 0);       // 控制分
        calendar17.set(Calendar.SECOND, 0);       // 控制秒

        Date time17 = calendar17.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer17 = new Timer();
        timer17.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/17_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time17, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar18 = Calendar.getInstance();
        calendar18.set(Calendar.HOUR_OF_DAY, 18); // 控制时
        calendar18.set(Calendar.MINUTE, 0);       // 控制分
        calendar18.set(Calendar.SECOND, 0);       // 控制秒

        Date time18 = calendar18.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer18 = new Timer();
        timer18.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/18_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time18, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar19 = Calendar.getInstance();
        calendar19.set(Calendar.HOUR_OF_DAY, 19); // 控制时
        calendar19.set(Calendar.MINUTE, 0);       // 控制分
        calendar19.set(Calendar.SECOND, 0);       // 控制秒

        Date time19 = calendar19.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer19 = new Timer();
        timer19.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/19_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time19, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar20 = Calendar.getInstance();
        calendar20.set(Calendar.HOUR_OF_DAY, 20); // 控制时
        calendar20.set(Calendar.MINUTE, 0);       // 控制分
        calendar20.set(Calendar.SECOND, 0);       // 控制秒

        Date time20 = calendar20.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer20 = new Timer();
        timer20.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/20_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time20, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar21 = Calendar.getInstance();
        calendar21.set(Calendar.HOUR_OF_DAY, 21); // 控制时
        calendar21.set(Calendar.MINUTE, 0);       // 控制分
        calendar21.set(Calendar.SECOND, 0);       // 控制秒

        Date time21 = calendar21.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer21 = new Timer();
        timer21.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/21_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time21, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar22 = Calendar.getInstance();
        calendar22.set(Calendar.HOUR_OF_DAY, 22); // 控制时
        calendar22.set(Calendar.MINUTE, 0);       // 控制分
        calendar22.set(Calendar.SECOND, 0);       // 控制秒

        Date time22 = calendar22.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer22 = new Timer();
        timer22.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/22_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time22, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行

        Calendar calendar23 = Calendar.getInstance();
        calendar23.set(Calendar.HOUR_OF_DAY, 23); // 控制时
        calendar23.set(Calendar.MINUTE, 0);       // 控制分
        calendar23.set(Calendar.SECOND, 0);       // 控制秒

        Date time23 = calendar23.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer23 = new Timer();
        timer23.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/23_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time23, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行




    }

}
