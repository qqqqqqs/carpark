package com.carpark.controller;

import com.carpark.baidu.api.LicensePlate;
import com.carpark.pojo.UserTable;
import com.carpark.service.IndexService;
import com.carpark.service.PortService;
import com.carpark.service.UserService;
import com.carpark.utils.DateUtils;
import com.carpark.utils.SysUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    UserService service;
    @Autowired
    PortService portService;
    @Autowired
    IndexService indexService;
        //停车
    @RequestMapping(value = "addCar",method = RequestMethod.POST)
    //上传的feil参数    传到这里
    public String addCar(@RequestParam(value = "file",required = false)MultipartFile file) throws IOException {
        //图片上传成功后，将图片的地址写到数据库
        String filePath="D:\\image";
        //获得原始图片的拓展名
        String originalFileName=file.getOriginalFilename();
        //新的文件名字
        String newfileName= UUID.randomUUID()+originalFileName;
        //封装上传文件位置的全路径
        File targetFile=new File(filePath,newfileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        //把得到车牌号的截取类实例化出来
        LicensePlate licensePlate=new LicensePlate();
        //当前add 就是得到过来的车牌
        String add=licensePlate.licensePlate(targetFile.getAbsolutePath());
        UserTable userTable=new UserTable();
        //设置车牌号为add
        userTable.setCarName(add);
       userTable.setCarStarttime(SysUtils.d2s(new Date()));
       service.insert(userTable);
        return "userindex";
    }

//    @RequestMapping(value = "/file/{id}", method = RequestMethod.POST)
//    public String upload(@PathVariable("id") int id , @RequestParam("file") CommonsMultipartFile file, HttpServletRequest request, ModelMap model, RedirectAttributes redirectAttributes) throws Exception {
//        OCRTestAction action=new OCRTestAction();
//
//        return "userindex";
//    }




    // 通过车牌查询取车
    @RequestMapping(value = "findByName" ,method = RequestMethod.POST)
    public String findByName(@RequestParam(value = "file",required = false)MultipartFile file,UserTable user, Model model) throws Exception {
        //图片上传成功后，将图片的地址写到数据库
        String filePath="D:\\image";
        //获得原始图片的拓展名
        String originalFileName=file.getOriginalFilename();
        //新的文件名字
        String newfileName= UUID.randomUUID()+originalFileName;
        //封装上传文件位置的全路径
        File targetFile=new File(filePath,newfileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        //把得到车牌号的截取类实例化出来
        LicensePlate licensePlate=new LicensePlate();
        //当前add 就是得到过来的车牌
        String add=licensePlate.licensePlate(targetFile.getAbsolutePath());
        System.out.println(
                add
        );
        UserTable tabel=service.select(add);
        if (tabel==null){

        }else {
            service.search(tabel);
            tabel.setCarState("已取车");
            tabel.setCarEndtime(SysUtils.d2s(new Date()));
            long hour=DateUtils.dateDiff(tabel.getCarStarttime(), tabel.getCarEndtime(), "yyyy-MM-dd HH:mm:ss");
            if (tabel.getCarType()=="普通车辆"){
                if (hour>1){
                    tabel.setCarMoney((hour-1)*100);
                    service.updateById(tabel);
                    service.info(tabel);
                }else {
                    return "userindex";

                }



            }else{
                if (hour>1){
                    tabel.setCarMoney((hour-1)*80);
                    service.updateById(tabel);
                    service.info(tabel);
                }else {
                    return "userindex";

                }

            }

        }
        UserTable use=service.sell(add);
        model.addAttribute("use",use);
        return "usersell";

    }

    @RequestMapping("/sum")
    public String sum(Model model){
        indexService.findall();
        int result=service.selectSum();
        model.addAttribute("result",result);
        return "index";
    }






}
