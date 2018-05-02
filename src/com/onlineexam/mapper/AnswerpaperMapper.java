package com.onlineexam.mapper;

import com.onlineexam.po.Answerpaper;
import com.onlineexam.po.AnswerpaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerpaperMapper {
    long countByExample(AnswerpaperExample example);

    int deleteByExample(AnswerpaperExample example);

    int insert(Answerpaper record);

    int insertSelective(Answerpaper record);

    List<Answerpaper> selectByExample(AnswerpaperExample example);

    int updateByExampleSelective(@Param("record") Answerpaper record, @Param("example") AnswerpaperExample example);

    int updateByExample(@Param("record") Answerpaper record, @Param("example") AnswerpaperExample example);
}