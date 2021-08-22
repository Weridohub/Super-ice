package cn.hamster3.bot.preset.listener;

import cn.hamster3.bot.data.MessageType;
import cn.hamster3.bot.event.GroupMessageEvent;
import cn.hamster3.bot.event.MessageEvent;
import cn.hamster3.bot.listener.EventHandler;
import cn.hamster3.bot.listener.Listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class MessageListenner implements Listener {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/qarobot_da?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="20181208";
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-ddHH:mm:ss设置日期格式


    private static Logger logger = Logger.getLogger("聊天记录");

    @EventHandler
    public void insetMessage (GroupMessageEvent event) throws Exception{

        String content=event.getMessage();
        String message= event.getMessage();
        Long name=event.getSender();
        String date = df.format(new Date());
        Long account=event.getSender();
        Long seq=event.getMessageSequence();

        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        String purpose =message.replaceAll("用去.*", "");
        System.out.println(purpose);
        String sql="INSERT INTO message(account,content,send_time,seq) VALUES ('"+account+"','"+message+"','"+date+"','"+seq+"')";
        stmt.executeUpdate(sql);//选择import java.sql.ResultSet;
        System.out.println("成功插入一条聊天记录："+"\n"+account+":"+message);
        stmt.close();

    }
}
