package com.carpark.controller;

import com.carpark.pojo.Indexview;
import com.carpark.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    IndexService service;

    //查询所有停车记录
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Indexview> lis=service.findall();
        model.addAttribute("lis",lis);
        return "index";
    }



}
