package com.carpark.service;

import com.carpark.mapper.SysTableMapper;
import com.carpark.pojo.SysTable;
import com.carpark.pojo.SysTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysService {
    @Autowired
    SysTableMapper mapper;

    public List<SysTable> find(){
       List<SysTable> list= mapper.selectByExample(null);
       return list;
    }

    public List<SysTable> findState(SysTable sys){
        SysTableExample example=new SysTableExample();
        example.createCriteria()
                .andSysStateEqualTo(sys.getSysState());
               return mapper.selectByExample(example);
    }



    public SysTable findbyId(SysTable sys){
        return mapper.selectByPrimaryKey(sys.getSysId());
    }


    //月卡查询方法
    public SysTable findcou(){
        SysTableExample example=new SysTableExample();
        example.createCriteria().andSysMonthEqualTo(498L);
        return (SysTable) mapper.selectByExample(example);
    }

    //年卡查询方法
    public SysTable findy(){
        SysTableExample example=new SysTableExample();
        example.createCriteria().andSysMonthEqualTo(998L);
        return (SysTable) mapper.selectByExample(example);
    }
    //季卡查询方法
    public SysTable findji(){
        SysTableExample example=new SysTableExample();
        example.createCriteria().andSysMonthEqualTo(798L);
        return (SysTable) mapper.selectByExample(example);
    }

}
