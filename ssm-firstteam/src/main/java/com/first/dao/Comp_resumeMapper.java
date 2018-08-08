package com.first.dao;

import com.first.bean.Comp_resumeExample;
import com.first.bean.Comp_resumeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Comp_resumeMapper {
    long countByExample(Comp_resumeExample example);

    int deleteByExample(Comp_resumeExample example);

    int deleteByPrimaryKey(Comp_resumeKey key);

    int insert(Comp_resumeKey record);

    int insertSelective(Comp_resumeKey record);

    List<Comp_resumeKey> selectByExample(Comp_resumeExample example);

    int updateByExampleSelective(@Param("record") Comp_resumeKey record, @Param("example") Comp_resumeExample example);

    int updateByExample(@Param("record") Comp_resumeKey record, @Param("example") Comp_resumeExample example);
}