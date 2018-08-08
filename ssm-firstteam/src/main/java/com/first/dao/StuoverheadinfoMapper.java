package com.first.dao;

import com.first.bean.Stuoverheadinfo;
import com.first.bean.StuoverheadinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuoverheadinfoMapper {
    long countByExample(StuoverheadinfoExample example);

    int deleteByExample(StuoverheadinfoExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(Stuoverheadinfo record);

    int insertSelective(Stuoverheadinfo record);

    List<Stuoverheadinfo> selectByExample(StuoverheadinfoExample example);

    Stuoverheadinfo selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") Stuoverheadinfo record, @Param("example") StuoverheadinfoExample example);

    int updateByExample(@Param("record") Stuoverheadinfo record, @Param("example") StuoverheadinfoExample example);

    int updateByPrimaryKeySelective(Stuoverheadinfo record);

    int updateByPrimaryKey(Stuoverheadinfo record);
}