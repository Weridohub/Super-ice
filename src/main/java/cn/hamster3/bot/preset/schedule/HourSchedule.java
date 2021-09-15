package cn.hamster3.bot.preset.schedule;

import cn.hamster3.bot.core.BotCore;
import cn.hamster3.bot.core.WeBotCore;
import cn.hamster3.bot.utils.MessageUtils;
import cn.hamster3.bot.utils.WeMessageUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HourSchedule {
    public static void hourSchedule() throws URISyntaxException, IOException {
        BotCore core = new BotCore("36.138.40.84", 6542, 3321530540L);
        WeBotCore weCore = new WeBotCore("36.138.40.84", 8090);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0); // 控制时
        calendar.set(Calendar.MINUTE, 0);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","午夜零点整啦，还在忙吗？闭上眼睛让身心休息，静静的迎接下一个清晨吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","凌晨一点啦，此刻的你正在为谁难以入眠？别多想了，一切都会更好，多于苦挪出黎。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","快睡吧，凌晨两点啦，为了更好的一天，不要太累。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","凌晨三点啦，现在的你是在梦乡之中，还是在为梦想四处奔波，可别忘了休息哦。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","凌晨四点，正在加班的，你还好吗？朋友辛苦了。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","凌晨五点啦，天开始微亮，你的梦是不是也开始发光发热了？闹心，累的向那里申请。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","清晨六点该起床啦，伸个懒腰为新的一天，做做准备吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","明天早上七点啦，你是在上班的途中，还是在品味着美味的早餐呢。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","八点了，开始工作学习了吗？来为自己加把油吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","现在是上午九点，打起精神，认真工作，别打瞌睡了。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","上午十点，正在忙碌的，你来和我一起喝杯早茶吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","上午11点了，半天的工作时间就快结束了，记得让牙齿晒晒太阳。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","现在是中午12点，别想着减肥，快去吃饭吧，好吃的都在等着你哦。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","下午一点整了，放下手中的工作，午休一下吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","起床啦，起床啦，下午两点整了，小心迟到哦。"));
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
                    //现在是下午三点整，下午茶时间到了，你还在等什么呢？
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","现在是下午三点整，下午茶时间到了，你还在等什么呢？"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","叮叮咚，下午四点整了，今天的计划完成多少了呢呢？"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","下午五点啦，回家的你一路平安。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","下午六点啦，美味的晚餐，正等着你哦。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","傍晚七点呢，忙碌了一天，是时候看看电视，休息一下了啦。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","晚上八点啦，和家人朋友聊聊天，诉说一下心事吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","嘟嘟嘟嘟每日晚九点准时提醒，打个哈欠清醒一下，大脑空气啊请。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","晚上十点整啦，已经忙完了，你敷上面膜，快快休息吧。"));
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
                    weCore.sendWeMessage(WeMessageUtils.sendWeText("20319911178@chatroom","晚上11点啦，在忙碌中我们结束了充实的一天，期待着在梦里等你的那个人孤独。"));
                    core.sendVoice(MessageUtils.sendVoiceToGroup(646212330,"./voice/23_00.silk"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time23, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行




    }

}
