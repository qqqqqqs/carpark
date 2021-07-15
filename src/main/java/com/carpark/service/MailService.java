package com.carpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    //发送者
    @Value("${spring.mail.username}")
    private String sender;

    //发送邮件工具类
    @Autowired
    JavaMailSender javaMailSender;

    //发送简单邮件
    public void sendSimpleMailMessage(String to,String subject,String content){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setFrom(sender);
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
    }
}
