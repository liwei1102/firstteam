package com.first.dao;

import com.first.bean.Studentlogin;
import com.first.bean.StudentloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface StudentloginMapper {
	
	//通过username, password查找一条信息
	Studentlogin selectbyUsenamepass(@Param("username")String uesrname, @Param("password")String password);

	//通过email, password查找一条信息
	Studentlogin selectbyUseemailpass(@Param("email")String email, @Param("password")String password);

	//通过username,查找一条信息
	Studentlogin selectbyUsename(@Param("username")String uesrname);

	//通过email,查找一条信息
	Studentlogin selectbyemail(@Param("email")String email);
		
    long countByExample(StudentloginExample example);

    int deleteByExample(StudentloginExample example);

    int deleteByPrimaryKey(Integer stuloginid);

    int insert(Studentlogin record);

    int insertSelective(Studentlogin record);

    List<Studentlogin> selectByExample(StudentloginExample example);

    Studentlogin selectByPrimaryKey(Integer stuloginid);

    int updateByExampleSelective(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByExample(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByPrimaryKeySelective(Studentlogin record);

    int updateByPrimaryKey(Studentlogin record);
}