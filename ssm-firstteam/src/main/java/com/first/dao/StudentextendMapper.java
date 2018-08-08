package com.first.dao;

import com.first.bean.Studentextend;
import com.first.bean.StudentextendExample;
import com.first.bean.StudentextendWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentextendMapper {
    long countByExample(StudentextendExample example);

    int deleteByExample(StudentextendExample example);

    int deleteByPrimaryKey(Integer stuextendid);

    int insert(StudentextendWithBLOBs record);

    int insertSelective(StudentextendWithBLOBs record);

    List<StudentextendWithBLOBs> selectByExampleWithBLOBs(StudentextendExample example);

    List<Studentextend> selectByExample(StudentextendExample example);

    StudentextendWithBLOBs selectByPrimaryKey(Integer stuextendid);

    int updateByExampleSelective(@Param("record") StudentextendWithBLOBs record, @Param("example") StudentextendExample example);

    int updateByExampleWithBLOBs(@Param("record") StudentextendWithBLOBs record, @Param("example") StudentextendExample example);

    int updateByExample(@Param("record") Studentextend record, @Param("example") StudentextendExample example);

    int updateByPrimaryKeySelective(StudentextendWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StudentextendWithBLOBs record);

    int updateByPrimaryKey(Studentextend record);
}