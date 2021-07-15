package com.carpark.mapper;

import com.carpark.pojo.PortTable;
import com.carpark.pojo.PortTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PortTableMapper {
    int countByExample(PortTableExample example);

    int deleteByExample(PortTableExample example);

    int deleteByPrimaryKey(Integer portId);

    int insert(PortTable record);

    int insertSelective(PortTable record);

    List<PortTable> selectByExample(PortTableExample example);

    PortTable selectByPrimaryKey(Integer portId);

    int updateByExampleSelective(@Param("record") PortTable record, @Param("example") PortTableExample example);

    int updateByExample(@Param("record") PortTable record, @Param("example") PortTableExample example);

    int updateByPrimaryKeySelective(PortTable record);

    int updateByPrimaryKey(PortTable record);
}