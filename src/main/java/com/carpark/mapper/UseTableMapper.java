package com.carpark.mapper;

import com.carpark.pojo.UseTable;
import com.carpark.pojo.UseTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseTableMapper {
    int countByExample(UseTableExample example);

    int deleteByExample(UseTableExample example);

    int deleteByPrimaryKey(Integer useId);

    int insert(UseTable record);

    int insertSelective(UseTable record);

    List<UseTable> selectByExample(UseTableExample example);

    UseTable selectByPrimaryKey(Integer useId);

    int updateByExampleSelective(@Param("record") UseTable record, @Param("example") UseTableExample example);

    int updateByExample(@Param("record") UseTable record, @Param("example") UseTableExample example);

    int updateByPrimaryKeySelective(UseTable record);

    int updateByPrimaryKey(UseTable record);
}