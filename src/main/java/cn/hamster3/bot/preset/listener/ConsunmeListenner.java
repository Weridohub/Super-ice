package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class ConsunmeListenner implements Listener {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/qarobot_da?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="20181208";
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-ddHH:mm:ss设置日期格式
    SimpleDateFormat rq = new SimpleDateFormat("yyyy-MM-dd");//yyyy-MM-ddHH:mm:ss设置日期格式


    private static Logger logger = Logger.getLogger("家庭");
    private String money;
    private String message;
    private String date;
    private String riqi;
    private Long account;

    @EventHandler
    public void insetConsume(MessageEvent event) throws Exception{
        if (event.getMessageType() != MessageType.TextMsg) {
            return;
        }
        if (!event.getMessage().matches("(.*)用去(.*)")) {
            return;
        }
         money=event.getMessage().replaceAll("[\u2E80-\u9FFF]","");
         message= event.getMessage();
         account=event.getSender();
         date = df.format(new Date());
         riqi = rq.format(new Date());

        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        String purpose =message.replaceAll("用去.*", "");
        System.out.println(purpose);
        String sql="INSERT INTO consunme(name,purpose,money,remarks,dt,spenddt,recorddt) " +
                "VALUES ('"+account+"', '"+purpose+"', "+money+", NULL, '"+riqi+"', NULL, '"+date+"')";
        stmt.executeUpdate(sql);//选择import java.sql.ResultSet;
        event.replyIgnoreException("成功消费："+purpose+money+"元");
        stmt.close();

        //借钱
        if (!event.getMessage().matches("(.*)借(.*)")) {
            return;
        }
        System.out.println("什么人借多少钱");
    }
}
