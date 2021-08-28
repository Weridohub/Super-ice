package cn.hamster3.bot.preset;

import cn.hamster3.bot.core.BotCore;
import cn.hamster3.bot.core.DevConfig;
import cn.hamster3.bot.listener.Listener;
import cn.hamster3.bot.preset.listener.*;
import cn.hamster3.bot.preset.schedule.ConsunmeSchedule;
import cn.hamster3.bot.preset.schedule.HourSchedule;
import cn.hamster3.bot.utils.MessageUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws URISyntaxException, InterruptedException, IOException {
        BotCore core = new BotCore("127.0.0.1", 6542, 3321530540L);
        HourSchedule schedule = new HourSchedule();
        schedule.hourSchedule();
        ConsunmeSchedule consunmeSchedule=new ConsunmeSchedule();
        consunmeSchedule.consunmeSchedule();

//测试
        System.out.println("添加菜单组件: " + core.addListener(new MenuListener()));
        System.out.println("添加日志组件: " + core.addListener(new LogListener()));
        System.out.println("添加屏幕截图组件: " + core.addListener(new ScreenListener()));
  //      System.out.println("添加JS执行器组件: " + core.addListener(new JavaScriptListener()));
        System.out.println("添加关机执行组件: " + core.addListener(new ShutdownListener()));
        System.out.println("添加测试执行组件: " + core.addListener(new TestListener()));
        System.out.println("添加天气组件: " + core.addListener(new WeatherListener()));
        System.out.println("添加家庭财富组件: " + core.addListener(new FamilyListener()));
        System.out.println("添加开发进度日志组件: " + core.addListener(new PlanListener()));
        System.out.println("添加开发进度日志组件: " + core.addListener(new ConsunmeListenner()));
        System.out.println("添加聊天记录组件: " + core.addListener(new MessageListenner()));
        System.out.println("添加撤回监控组件: " + core.addListener(new WithdrawListenner()));
        System.out.println("添加借还系统: " + core.addListener(new WithdrawListenner()));


        core.start();
        try {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//yyyy-MM-ddHH:mm:ss设置日期格式
            String date = df.format(new Date());
            core.sendMessage(MessageUtils.sendTextToGroup(646212330, "北京时间："+date+"\n "+"超级冰Bot启动成功!"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("启动消息发送失败, Bot已关闭...");
            Thread.sleep(3000);
            System.exit(0);
        }

    }
}
