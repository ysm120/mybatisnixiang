package com.onlineexam.mapper;

import com.onlineexam.po.Makepaper;
import com.onlineexam.po.MakepaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MakepaperMapper {
    long countByExample(MakepaperExample example);

    int deleteByExample(MakepaperExample example);

    int insert(Makepaper record);

    int insertSelective(Makepaper record);

    List<Makepaper> selectByExample(MakepaperExample example);

    int updateByExampleSelective(@Param("record") Makepaper record, @Param("example") MakepaperExample example);

    int updateByExample(@Param("record") Makepaper record, @Param("example") MakepaperExample example);
}