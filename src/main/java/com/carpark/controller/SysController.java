package com.carpark.controller;

import com.carpark.pojo.SysTable;
import com.carpark.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SysController {
    @Autowired
    SysService service;

    @RequestMapping("indexSys")
    public String indexSys(){
        return "indexSys";
    }

    @RequestMapping("findal")
    public String  findal (Model model){
        List<SysTable> tables= (List<SysTable>) service.findy();
        model.addAttribute("tables",tables);
        return "indexSys";
    }

    //月卡查询信息
    @RequestMapping("/indexSysmon")
    public String findmon(Model model){
        SysTable sy=service.findcou();
        model.addAttribute("sy",sy);
        System.out.println(sy);
        return "userindex";

    }

    //年卡查询信息
    @RequestMapping("/indexSysy")
    public String findyear(Model model){
        SysTable sys=service.findy();
        model.addAttribute("sys",sys);
        System.out.println(sys);
        return "userindex";
    }
    //季卡查询信息
    @RequestMapping("/indexSysji")
    public String findji(Model model){
        SysTable s= service.findji();
        model.addAttribute("s",s);
        System.out.println(s);
        return "userindex";
    }




    @RequestMapping("updateState")
    public String updateState(SysTable sys){
        service.findState(sys);
        if (sys.getSysState()==1){
            return "userindex";
        }else {
            return "indexlogin";
        }

    }


}
