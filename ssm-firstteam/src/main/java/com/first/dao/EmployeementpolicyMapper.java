package com.first.dao;

import com.first.bean.Employeementpolicy;
import com.first.bean.EmployeementpolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeementpolicyMapper {
    long countByExample(EmployeementpolicyExample example);

    int deleteByExample(EmployeementpolicyExample example);

    int deleteByPrimaryKey(Integer policyid);

    int insert(Employeementpolicy record);

    int insertSelective(Employeementpolicy record);

    List<Employeementpolicy> selectByExampleWithBLOBs(EmployeementpolicyExample example);

    List<Employeementpolicy> selectByExample(EmployeementpolicyExample example);

    Employeementpolicy selectByPrimaryKey(Integer policyid);

    int updateByExampleSelective(@Param("record") Employeementpolicy record, @Param("example") EmployeementpolicyExample example);

    int updateByExampleWithBLOBs(@Param("record") Employeementpolicy record, @Param("example") EmployeementpolicyExample example);

    int updateByExample(@Param("record") Employeementpolicy record, @Param("example") EmployeementpolicyExample example);

    int updateByPrimaryKeySelective(Employeementpolicy record);

    int updateByPrimaryKeyWithBLOBs(Employeementpolicy record);

    int updateByPrimaryKey(Employeementpolicy record);
}