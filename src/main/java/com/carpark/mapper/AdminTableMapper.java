package com.carpark.mapper;

import com.carpark.pojo.AdminTable;
import com.carpark.pojo.AdminTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminTableMapper {
    int countByExample(AdminTableExample example);

    int deleteByExample(AdminTableExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminTable record);

    int insertSelective(AdminTable record);

    List<AdminTable> selectByExample(AdminTableExample example);

    AdminTable selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    int updateByExample(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    int updateByPrimaryKeySelective(AdminTable record);

    int updateByPrimaryKey(AdminTable record);
}