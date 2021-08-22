package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.core.DevConfig;
import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FamilyListener implements Listener {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/qarobot_da?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="20181208";
    SimpleDateFormat df = new SimpleDateFormat("MM/dd HH:mm:ss");//yyyy-MM-ddHH:mm:ss设置日期格式


    private static Logger logger = Logger.getLogger("家庭");
    //查询
    @EventHandler
    public void conSume(MessageEvent event) throws Exception {
        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().equalsIgnoreCase("查询所有消费")) {
            return;
        }
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        List consunmeList=new ArrayList(); //user表集合
        ResultSet rs = stmt.executeQuery("SELECT * FROM consunme  WHERE name ='Ashley'");//选择import java.sql.ResultSet;
        System.out.println(rs);
        while(rs.next()){//如果对象中有数据，就会循环打印出来
            consunmeList.add("1");
            // df.format(new Date())为获取当前系统时间
          event.replyIgnoreException("当前查询时间："+df.format(new Date())+"\n"+"|"
                      +rs.getString("id") +"|"
                      + rs.getString("dt")+"|"
                      + rs.getString("name")+"|"
                      + rs.getString("purpose")+"|"
                      + rs.getDouble("money")+"|"
                      + rs.getString("remarks")+"|"
                      + rs.getDate("spenddt")+"|"
                      + rs.getTime("recorddt")+"|"
            );
        }
        stmt.close();


    }

}
