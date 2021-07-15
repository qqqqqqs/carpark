package com.carpark.service;

import com.carpark.mapper.NoticeTableMapper;
import com.carpark.pojo.NoticeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeTableMapper mapper;
        //插入公告
    public int insert(NoticeTable notice){
        return mapper.insertSelective(notice);
    }


    //查询公告
    public List<NoticeTable> search(){
        return mapper.selectByExample(null);
    }

    //删除公告
    public int delete(int id){
        return mapper.deleteByPrimaryKey(id);
    }




}
