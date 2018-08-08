package com.first.dao;

import com.first.bean.Collegeyearrate;
import com.first.bean.CollegeyearrateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeyearrateMapper {
    long countByExample(CollegeyearrateExample example);

    int deleteByExample(CollegeyearrateExample example);

    int deleteByPrimaryKey(Integer collegeyearrateid);

    int insert(Collegeyearrate record);

    int insertSelective(Collegeyearrate record);

    List<Collegeyearrate> selectByExample(CollegeyearrateExample example);

    Collegeyearrate selectByPrimaryKey(Integer collegeyearrateid);

    int updateByExampleSelective(@Param("record") Collegeyearrate record, @Param("example") CollegeyearrateExample example);

    int updateByExample(@Param("record") Collegeyearrate record, @Param("example") CollegeyearrateExample example);

    int updateByPrimaryKeySelective(Collegeyearrate record);

    int updateByPrimaryKey(Collegeyearrate record);
}