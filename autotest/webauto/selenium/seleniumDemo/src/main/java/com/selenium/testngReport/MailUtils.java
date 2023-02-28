package com.selenium.testngReport;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class MailUtils {

    private static String host;
    private static String username;
    private static String password;
    private static String from;
    private static String nick;
    static {
        try {
            // Test Data
            host = "smtp.163.com";
            username = "18636657014@163.com";
            password = "***********";
            from = "18636657014@163.com";
            nick = "admin";
            // nick + from 组成邮箱的发件人信息
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean sendMail(String to, String subject, String body,
                                   List<String> filePath) throws UnsupportedEncodingException,
            AddressException, MessagingException {
        //
        if (body == null) {
            body = "";
        }
        if (subject == null) {
            subject = "";
        }
        // 创建properties 对象
        Properties props = System.getProperties();
        // 创建信件服务器
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", true);// 通过验证
        // 得到默认的对话对象
        Session session = Session.getDefaultInstance(props, null);
        // 创建一个消息， 并初始化该消息的各项元素
        MimeMessage msg = new MimeMessage(session);
        nick = MimeUtility.encodeText(nick);
        msg.setFrom(new InternetAddress(nick + "<" + from + ">"));
        // 创建收件人列表
        if (to != null && to.trim().length() > 0) {
            String[] arr = to.split(",");
            int receiverCount = arr.length;
            if (receiverCount > 0) {
                InternetAddress[] address = new InternetAddress[receiverCount];
                for (int i = 0; i < receiverCount; i++) {
                    address[i] = new InternetAddress(arr[i]);

                }
                msg.addRecipients(Message.RecipientType.TO, address);
                msg.setSubject(subject);
                // 后面的bodypart 将加入到此处创建的multipart 中
                Multipart mp = new MimeMultipart();
                // 附件操作
                if (filePath != null && filePath.size() > 0) {
                    for (String fileName : filePath) {
                        MimeBodyPart mbp = new MimeBodyPart();
                        // 得到数据源
                        FileDataSource fds = new FileDataSource(fileName);
                        // 得到附件本身
                        mbp.setDataHandler(new DataHandler(fds));
                        mp.addBodyPart(mbp);
                    }
                    MimeBodyPart mbp = new MimeBodyPart();
                    mbp.setText(body, "UTF-8");
                    mp.addBodyPart(mbp);
                    // 移走集合中的所有元素
                    filePath.clear();
                    msg.setContent(mp);
                } else {
                    msg.setText(body);

                }
                // 设置邮件头的发送信息
                msg.setSentDate(new Date());
                msg.saveChanges();
                // 发送邮件
                Transport transport = session.getTransport("smtp");
                transport.connect(host, username, password);
                transport.sendMessage(msg,
                        msg.getRecipients(Message.RecipientType.TO));
                transport.close();
                return true;
            } else {
                System.out.println("None receiver!");
                return false;
            }
        } else {
            return false;

        }
    }

    public static void send() throws AddressException,
            UnsupportedEncodingException, MessagingException {
        System.out.println("dddd");
        List<String> filepath = new ArrayList<String>();
        filepath.add("/Users/anjie/dev/Intellij Idea/Auto-Selenium/seleniumDemo/test-output/emailable-custom-report.html");
        sendMail("1257772358@qq.com,18636657014@163.com",
                "邮箱测试", "测试发送多人，多附件", filepath);
    }

}