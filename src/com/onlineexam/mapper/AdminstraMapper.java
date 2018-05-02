package com.onlineexam.mapper;

import com.onlineexam.po.Adminstra;
import com.onlineexam.po.AdminstraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminstraMapper {
    long countByExample(AdminstraExample example);

    int deleteByExample(AdminstraExample example);

    int deleteByPrimaryKey(String aid);

    int insert(Adminstra record);

    int insertSelective(Adminstra record);

    List<Adminstra> selectByExample(AdminstraExample example);

    Adminstra selectByPrimaryKey(String aid);

    int updateByExampleSelective(@Param("record") Adminstra record, @Param("example") AdminstraExample example);

    int updateByExample(@Param("record") Adminstra record, @Param("example") AdminstraExample example);

    int updateByPrimaryKeySelective(Adminstra record);

    int updateByPrimaryKey(Adminstra record);
}