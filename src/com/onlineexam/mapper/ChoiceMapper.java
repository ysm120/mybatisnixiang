package com.onlineexam.mapper;

import com.onlineexam.po.Choice;
import com.onlineexam.po.ChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceMapper {
    long countByExample(ChoiceExample example);

    int deleteByExample(ChoiceExample example);

    int deleteByPrimaryKey(Integer choiceid);

    int insert(Choice record);

    int insertSelective(Choice record);

    List<Choice> selectByExampleWithBLOBs(ChoiceExample example);

    List<Choice> selectByExample(ChoiceExample example);

    Choice selectByPrimaryKey(Integer choiceid);

    int updateByExampleSelective(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByExample(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByPrimaryKeySelective(Choice record);

    int updateByPrimaryKeyWithBLOBs(Choice record);

    int updateByPrimaryKey(Choice record);
}