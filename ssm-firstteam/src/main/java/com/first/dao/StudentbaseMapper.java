package com.first.dao;

import com.first.bean.Studentbase;
import com.first.bean.StudentbaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentbaseMapper {
    long countByExample(StudentbaseExample example);

    int deleteByExample(StudentbaseExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(Studentbase record);

    int insertSelective(Studentbase record);

    List<Studentbase> selectByExample(StudentbaseExample example);

    Studentbase selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") Studentbase record, @Param("example") StudentbaseExample example);

    int updateByExample(@Param("record") Studentbase record, @Param("example") StudentbaseExample example);

    int updateByPrimaryKeySelective(Studentbase record);

    int updateByPrimaryKey(Studentbase record);
}