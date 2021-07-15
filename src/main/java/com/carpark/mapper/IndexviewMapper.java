package com.carpark.mapper;

import com.carpark.pojo.Indexview;
import com.carpark.pojo.IndexviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexviewMapper {
    int countByExample(IndexviewExample example);

    int deleteByExample(IndexviewExample example);

    int insert(Indexview record);

    int insertSelective(Indexview record);

    List<Indexview> selectByExample(IndexviewExample example);

    int updateByExampleSelective(@Param("record") Indexview record, @Param("example") IndexviewExample example);

    int updateByExample(@Param("record") Indexview record, @Param("example") IndexviewExample example);
}