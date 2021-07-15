package com.carpark.service;

import com.carpark.mapper.PortTableMapper;
import com.carpark.pojo.PortTable;
import com.carpark.pojo.PortTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;


@Service
public class PortService {
    @Autowired
    PortTableMapper mapper;

    public int find() throws SQLException {
        PortTableExample example=new PortTableExample();
        example.createCriteria()
                .andPortStateEqualTo("空闲");
        List<PortTable> list=mapper.selectByExample(example);
        int result=list.size();
        return result;
    }


    public int find2() throws SQLException {
        PortTableExample example=new PortTableExample();
        example.createCriteria()
                .andPortStateEqualTo("占用");
        List<PortTable> list=mapper.selectByExample(example);
        int result=list.size();
        return result;
    }
    public int find3() throws SQLException {
        PortTableExample example=new PortTableExample();
        example.createCriteria()
                .andPortStateEqualTo("预约");
        List<PortTable> list=mapper.selectByExample(example);
        int result=list.size();
        return result;
    }

    public int insertPort(PortTable port){
        return mapper.insertSelective(port);
    }

    public int findall(){
      List<PortTable> list=mapper.selectByExample(null);
      int result=list.size();
      return result;
    }

    public List<PortTable> findinfo(){
        List<PortTable> list=mapper.selectByExample(null);
        return list;
    }

    public List<PortTable> findBy(){
        PortTableExample example=new PortTableExample();
        example.createCriteria()
                .andPortStateEqualTo("预约");
        return mapper.selectByExample(example);
    }

    public int deleteById(int id){
        return mapper.deleteByPrimaryKey(id);
    }








}
