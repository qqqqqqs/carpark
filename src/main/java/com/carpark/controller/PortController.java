package com.carpark.controller;

import com.carpark.pojo.PortTable;
import com.carpark.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class PortController {
    @Autowired
    PortService service;

    @RequestMapping("findPort")
    public String findPort(Model model) throws SQLException {
        int num=service.find();
        model.addAttribute("num",num);
        return "index";
    }


    @RequestMapping("findNull")
    public String findNull(Model model)throws  SQLException{
        int num2=service.find2();
        model.addAttribute("num2",num2);
        return "index";
    }

    @RequestMapping("addPort")
    public String addPort(PortTable port){
        service.insertPort(port);
        return "redirect:/findall";
    }

    @RequestMapping("findall")
    public String findalll(Model model){
        int num3=service.findall();
        model.addAttribute("num3",num3);
        return "index";
    }

    @RequestMapping("findinfo")
    public String findinfo(Model model){
        List<PortTable> list=service.findinfo();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("reserv")
    public String reserv(Model model){
        List<PortTable> table=service.findBy();
        model.addAttribute("table",table);
        return "index";
    }
    @RequestMapping("findreser")
    public String findreser(Model model) throws SQLException {
        int num4=service.find3();
        model.addAttribute("num4",num4);
        return "index";
    }

    @RequestMapping("deleteBy")
    public String deletebyid(int id){
        service.deleteById(id);
        return "redirect:/findall";
    }

}
