package com.first.dao;

import com.first.bean.Companylogin;
import com.first.bean.CompanyloginExample;
import com.first.bean.Studentlogin;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyloginMapper {
	
	//通过username, password查找一条信息
	Companylogin selectbyUsenamepass(@Param("username")String uesrname, @Param("password")String password);

	//通过email, password查找一条信息
	Companylogin selectbyUseemailpass(@Param("email")String email, @Param("password")String password);

	
	
	//通过username,查找一条信息
	Companylogin selectbyUsename(@Param("username")String uesrname);

	//通过email,查找一条信息
	Companylogin selectbyemail(@Param("email")String email);
	
    long countByExample(CompanyloginExample example);

    int deleteByExample(CompanyloginExample example);

    int deleteByPrimaryKey(Integer comploginid);

    int insert(Companylogin record);

    int insertSelective(Companylogin record);

    List<Companylogin> selectByExample(CompanyloginExample example);

    Companylogin selectByPrimaryKey(Integer comploginid);

    int updateByExampleSelective(@Param("record") Companylogin record, @Param("example") CompanyloginExample example);

    int updateByExample(@Param("record") Companylogin record, @Param("example") CompanyloginExample example);

    int updateByPrimaryKeySelective(Companylogin record);

    int updateByPrimaryKey(Companylogin record);
}