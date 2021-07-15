package com.carpark.mapper;

import com.carpark.pojo.SysTable;
import com.carpark.pojo.SysTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysTableMapper {
    int countByExample(SysTableExample example);

    int deleteByExample(SysTableExample example);

    int deleteByPrimaryKey(Integer sysId);

    int insert(SysTable record);

    int insertSelective(SysTable record);

    List<SysTable> selectByExample(SysTableExample example);

    SysTable selectByPrimaryKey(Integer sysId);

    int updateByExampleSelective(@Param("record") SysTable record, @Param("example") SysTableExample example);

    int updateByExample(@Param("record") SysTable record, @Param("example") SysTableExample example);

    int updateByPrimaryKeySelective(SysTable record);

    int updateByPrimaryKey(SysTable record);
}