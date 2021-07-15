package com.carpark.service;

import com.carpark.mapper.PortTableMapper;
import com.carpark.mapper.UserTableMapper;
import com.carpark.pojo.UserTable;
import com.carpark.pojo.UserTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    @Autowired
    UserTableMapper mapper;
    @Autowired
    PortTableMapper ptmapper;

    public int insert(UserTable user){
        return mapper.insertSelective(user);
    }

    public UserTable select(String name){
        UserTableExample example=new UserTableExample();
        example.createCriteria()
                .andCarNameEqualTo(name);
        List<UserTable> list=mapper.selectByExample(example);
        return  list.get(0);
    }

    public UserTable search(UserTable user){
        return mapper.selectByPrimaryKey(user.getUserId());
    }

    public int updateById(UserTable user){
        return mapper.updateByPrimaryKeySelective(user);
    }

    public int info(UserTable user){
        return mapper.updateByPrimaryKey(user);
    }

    public UserTable sell(String name){
        UserTableExample example=new UserTableExample();
        example.createCriteria()
                .andCarNameEqualTo(name);
        List<UserTable> list=mapper.selectByExample(example);
        return  list.get(0);
    }

    public int selectSum(){
        return mapper.selectMoney();
    }

}
