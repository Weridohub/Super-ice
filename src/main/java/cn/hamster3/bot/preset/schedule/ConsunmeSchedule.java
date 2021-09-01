package cn.hamster3.bot.preset.schedule;

import cn.hamster3.bot.core.BotCore;
import cn.hamster3.bot.utils.MessageUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class ConsunmeSchedule {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/qarobot_da?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="20181208";
    private static final SimpleDateFormat rq = new SimpleDateFormat("yyyy-MM-dd");//yyyy-MM-ddHH:mm:ss设置日期格式
    private static String riqi;


    public static void consunmeSchedule() throws URISyntaxException, IOException {

        BotCore core = new BotCore("127.0.0.1", 6542, 3321530540L);

        riqi= rq.format(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23); // 控制时
        calendar.set(Calendar.MINUTE, 1);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {   try {
                //1.加载驱动程序
                Class.forName("com.mysql.cj.jdbc.Driver");
                //2.获得数据库的连接
                Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
                //3.通过数据库的连接操作数据库，实现增删改查
                Statement stmt = conn.createStatement();


                ResultSet rs = stmt.executeQuery("SELECT SUM(money) FROM consunme  WHERE dt=\""+riqi+"\"");//选择import java.sql.ResultSet;
                //    System.out.println(rs.getString("SUM(money)"));
            while(rs.next()){//如果对象中有数据，就会循环打印出来

                 // df.format(new Date())为获取当前系统时间
                 core.sendMessage(MessageUtils.sendTextToGroup(646212330, "[ATALL()]"+"\n "+"今日消费统计："+"\n "+"共"+rs.getString("SUM(money)")+"元"));
            }
                stmt.close();

                } catch (SQLException | ClassNotFoundException | IOException e) {
                    e.printStackTrace();
                }

            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行//

    }
}
