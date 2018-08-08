package com.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.bean.Administratorlogin;
import com.first.bean.Companylogin;
import com.first.bean.Studentlogin;
import com.first.dao.AdministratorMapper;
import com.first.dao.AdministratorloginMapper;

@Service
public class AdministratorloginService {
	
	@Autowired
	AdministratorloginMapper administratorloginMapper;
	
	//从数据库中获取到规定name,password的对象
	public Administratorlogin getuserAdministrator(String name, String password) {
		return administratorloginMapper.selectbyUsenamepass(name, password);
	}
	
	//从数据库中获取到规定name,password的对象
	public Administratorlogin getemailAdministrator(String email, String password) {
		return administratorloginMapper.selectbyUseemailpass(email, password);		
	}

	//从数据库中获取到指定的company对象
	public int  insertAdministrator(Administratorlogin administrator){
		return administratorloginMapper.insert(administrator);
	}
			
	//从数据库中获取到指定name的对象
	public Administratorlogin getAdministratorbyname(String name) {
		return administratorloginMapper.selectbyUsename(name);
	}
			
	//从数据库中获取到指定email的对象
	public Administratorlogin getAdministratorbyemail(String email) {
		return administratorloginMapper.selectbyemail(email);
	}
	
}
