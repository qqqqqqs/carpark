package com.carpark.service;

import com.carpark.mapper.AdminTableMapper;
import com.carpark.pojo.AdminTable;
import com.carpark.pojo.AdminTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    AdminTableMapper mapper;


    //登录判断
    public AdminTable loginCheck(AdminTable admin) {
        AdminTableExample example = new AdminTableExample();
        example.createCriteria()
                .andAdminIdEqualTo(admin.getAdminId())
                .andAdminPwdEqualTo(admin.getAdminPwd());
        List<AdminTable> list=mapper.selectByExample(example);
        System.out.println(list);
        if (list==null||list.size()==0){
            return null;
        }else {

          return  list.get(0);
        }
    }
}
