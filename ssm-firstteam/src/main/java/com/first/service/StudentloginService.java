package com.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.bean.Studentlogin;
import com.first.dao.StudentloginMapper;

@Service
public class StudentloginService {

	@Autowired
	StudentloginMapper studentloginmapper;
	
	
	
	//从数据库中获取到规定name,password的对象
	public Studentlogin getuserStudent(String name, String password) {
		return studentloginmapper.selectbyUsenamepass(name, password);
		
	}
	
	//从数据库中获取到规定name,password的对象
	public Studentlogin getemailStudent(String email, String password) {
		return studentloginmapper.selectbyUseemailpass(email, password);		
	}

	//从数据库中获取到指定的company对象
	public int  insertStudent(Studentlogin student){
		return studentloginmapper.insert(student);
	}
	
	//从数据库中获取到指定name的对象
	public Studentlogin getStudentbyname(String name) {
		return studentloginmapper.selectbyUsename(name);
	}
	
	//从数据库中获取到指定email的对象
	public Studentlogin getStudentbyemail(String email) {
		return studentloginmapper.selectbyemail(email);
	}
	
	
}
