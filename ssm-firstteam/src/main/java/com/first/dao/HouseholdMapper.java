package com.first.dao;

import com.first.bean.Household;
import com.first.bean.HouseholdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdMapper {
    long countByExample(HouseholdExample example);

    int deleteByExample(HouseholdExample example);

    int deleteByPrimaryKey(Integer householdid);

    int insert(Household record);

    int insertSelective(Household record);

    List<Household> selectByExample(HouseholdExample example);

    Household selectByPrimaryKey(Integer householdid);

    int updateByExampleSelective(@Param("record") Household record, @Param("example") HouseholdExample example);

    int updateByExample(@Param("record") Household record, @Param("example") HouseholdExample example);

    int updateByPrimaryKeySelective(Household record);

    int updateByPrimaryKey(Household record);
}