package com.first.dao;

import com.first.bean.College;
import com.first.bean.CollegeExample;
import com.first.bean.CollegeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeMapper {
    long countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(Integer collegeid);

    int insert(CollegeWithBLOBs record);

    int insertSelective(CollegeWithBLOBs record);

    List<CollegeWithBLOBs> selectByExampleWithBLOBs(CollegeExample example);

    List<College> selectByExample(CollegeExample example);

    CollegeWithBLOBs selectByPrimaryKey(Integer collegeid);

    int updateByExampleSelective(@Param("record") CollegeWithBLOBs record, @Param("example") CollegeExample example);

    int updateByExampleWithBLOBs(@Param("record") CollegeWithBLOBs record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(CollegeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CollegeWithBLOBs record);

    int updateByPrimaryKey(College record);
}