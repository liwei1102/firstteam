package com.first.dao;

import com.first.bean.Administratorlogin;
import com.first.bean.AdministratorloginExample;
import com.first.bean.Companylogin;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorloginMapper {
	
	//通过username, password查找一条信息
	Administratorlogin selectbyUsenamepass(@Param("username")String uesrname, @Param("password")String password);

	//通过email, password查找一条信息
	Administratorlogin selectbyUseemailpass(@Param("email")String email, @Param("password")String password);

	
	
	//通过username,查找一条信息
	Administratorlogin selectbyUsename(@Param("username")String uesrname);

	//通过email,查找一条信息
	Administratorlogin selectbyemail(@Param("email")String email);
			
    long countByExample(AdministratorloginExample example);

    int deleteByExample(AdministratorloginExample example);

    int deleteByPrimaryKey(Integer adminloginid);

    int insert(Administratorlogin record);

    int insertSelective(Administratorlogin record);

    List<Administratorlogin> selectByExample(AdministratorloginExample example);

    Administratorlogin selectByPrimaryKey(Integer adminloginid);

    int updateByExampleSelective(@Param("record") Administratorlogin record, @Param("example") AdministratorloginExample example);

    int updateByExample(@Param("record") Administratorlogin record, @Param("example") AdministratorloginExample example);

    int updateByPrimaryKeySelective(Administratorlogin record);

    int updateByPrimaryKey(Administratorlogin record);
}