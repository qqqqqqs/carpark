package com.carpark.service;

import com.carpark.mapper.IndexviewMapper;
import com.carpark.pojo.Indexview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    @Autowired
    IndexviewMapper mapper;
        //查询所有停车记录
    public List<Indexview> findall(){
        return mapper.selectByExample(null);
    }




}
