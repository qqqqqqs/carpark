package com.carpark.controller;

import com.carpark.pojo.UseTable;
import com.carpark.service.MailService;
import com.carpark.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class UseControlller {
    @Autowired
    UseService service;

    @Resource
    MailService mailService;
    @RequestMapping("insert")
    public String  insert(UseTable use){
        int result=service.insert(use);
        if (result==0){

        }else {
            mailService.sendSimpleMailMessage(use.getUseMail(),"网页激活登录页面",
                    "http://localhost:8080/sign_in 恭喜你，注册成功请点击登录" );
        }
        return "active";
    }


   public String getemail(UseTable use){
        return use.getUseMail();
   }

   @RequestMapping("selecthuiyuan")
    public String select(Model model){
        List<UseTable> hui=service.select();
        model.addAttribute("hui",hui);
        return "index";
    }



}
