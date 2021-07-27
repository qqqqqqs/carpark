package com.carpark.controller;

import com.carpark.pojo.NoticeTable;
import com.carpark.service.NoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    NoticeService service;

    @RequestMapping("addNO")
    public String addNO(NoticeTable notice, Model model){
        service.insert(notice);
        List<NoticeTable> notic=service.search();
        model.addAttribute("notic",notic);
        return "index";
    }

    @RequestMapping("delete")
    public String delete(int id){
        service.delete(id);
        return "redirect:/search";
    }


    @RequestMapping("search")
    public String search(Model model,HttpSession session){
        PageHelper.startPage(1,3);

        List<NoticeTable> notic=service.search();
        PageInfo<NoticeTable> page = new PageInfo<NoticeTable>(notic);
        System.out.println(page);

        model.addAttribute("notic", notic);
        session.setAttribute("notic", notic);

        return "index";
    }

}
