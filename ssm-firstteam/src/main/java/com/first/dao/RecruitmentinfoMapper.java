package com.first.dao;

import com.first.bean.Recruitmentinfo;
import com.first.bean.RecruitmentinfoExample;
import com.first.bean.RecruitmentinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentinfoMapper {
    long countByExample(RecruitmentinfoExample example);

    int deleteByExample(RecruitmentinfoExample example);

    int deleteByPrimaryKey(Integer infoid);

    int insert(RecruitmentinfoWithBLOBs record);

    int insertSelective(RecruitmentinfoWithBLOBs record);

    List<RecruitmentinfoWithBLOBs> selectByExampleWithBLOBs(RecruitmentinfoExample example);

    List<Recruitmentinfo> selectByExample(RecruitmentinfoExample example);

    RecruitmentinfoWithBLOBs selectByPrimaryKey(Integer infoid);

    int updateByExampleSelective(@Param("record") RecruitmentinfoWithBLOBs record, @Param("example") RecruitmentinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitmentinfoWithBLOBs record, @Param("example") RecruitmentinfoExample example);

    int updateByExample(@Param("record") Recruitmentinfo record, @Param("example") RecruitmentinfoExample example);

    int updateByPrimaryKeySelective(RecruitmentinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RecruitmentinfoWithBLOBs record);

    int updateByPrimaryKey(Recruitmentinfo record);
}