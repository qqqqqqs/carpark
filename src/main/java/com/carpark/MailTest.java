package com.carpark;

import com.carpark.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest implements Runnable{

    String email;

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    @Resource
    MailService mailService;


    @Override
    public void run() {
        mailService.sendSimpleMailMessage(getMail(), "网页激活登录页面",
                "http://localhost:8080/sign_in 恭喜你，注册成功请点击登录");
    }

    @Test
    public void sendSimpleMailMessageTest(){
        mailService.sendSimpleMailMessage("2830872479@qq.com","网页激活登录页面",
                "http://localhost:8080/sign_in 恭喜你，注册成功请点击登录");
    }


    public void sendSimpleMessageTest01(String email) {
        mailService.sendSimpleMailMessage(email,"网页激活登录页面",
                "http://localhost:8080/sign_in 恭喜你，注册成功请点击登录" );
    };





}
