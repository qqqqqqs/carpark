package com.carpark.service;

import com.carpark.mapper.UseTableMapper;
import com.carpark.pojo.UseTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseService {
    @Autowired
    UseTableMapper mapper;

    public int insert(UseTable use){
        return mapper.insertSelective(use);
    }

    public List<UseTable> select(){
        return mapper.selectByExample(null);
    }

}
