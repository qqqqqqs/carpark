package com.carpark.controller;

import com.carpark.pojo.AdminTable;
import com.carpark.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

;

@Controller
public class CarController {
    private  int stat=0;
    @Autowired
    CarService service;
    //管理员登录
    @RequestMapping("sign_in")
    public String login() {
        return "sign_in";
    }
    @RequestMapping("userlogin")
    public String userlogin(){
        return "userlogin";
    }
    @RequestMapping("active")
    public String active(){
        return "active";
    }
    @RequestMapping("sign_up")
    public String sign_up(){
        return "sign_up";
    }
    @RequestMapping("userindex")
    public String userindex(){
        return "userindex";
    }
    @RequestMapping("usersell")
    public String usersell(){
        return "usersell";
    }

//    // 关闭停车场雏形
//    @RequestMapping("state")
//    public String state(){
//        stat++;
//        if (stat==1){
//            return "error";
//        }else{
//            return "index";
//        }
//    }
//
//    //开启停车场
//    @RequestMapping("sta")
//    public String sta(){
//        stat--;
//        if (stat==0){
//            return "error";
//        }else{
//            return "error";
//        }
//    }


    @RequestMapping("indexfind")
    public String indexfind(){
        return "indexfind";
    }
    @RequestMapping("indexAddPort")
    public String indexAddPort(){
        return "indexAddPort";
    }
    @RequestMapping("index")
    public String index(){
        return "index";
    }

            //退出登录后的主页
    @RequestMapping("sign_ln")
    public String sign_in1(HttpSession session){
        session.removeAttribute("admin");
        return "sign_ln";
    }

    @RequestMapping("indexNotice")
    public String indexNotice(){
        return "indexNotice";
    }

        // 管理员登录
    @RequestMapping("loginCheck")
    public String loginCheck(AdminTable admin, Model model,HttpSession session) {
        admin = service.loginCheck(admin);
        if (admin == null) {
            model.addAttribute("msg", "账号或密码错误");
            return "sign_in";
        }else {
            session.setAttribute("admin",admin);
            return "index";
        }
    }
        //用户登录
    @RequestMapping("login")
    public String login(AdminTable user,Model model,HttpSession session){
        user = service.loginCheck(user);
        if(stat==0){
            if (user == null) {
                model.addAttribute("msg", "账号或密码错误");
                return "userlogin";
            }else {
                session.setAttribute("user" ,user);
                return "userindex";
        }

        }else {
            return "error";
        }

    }










}
