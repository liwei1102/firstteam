package com.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.bean.Companylogin;
import com.first.bean.Studentlogin;
import com.first.dao.CompanyloginMapper;

@Service
public class CompanyloginService {

	@Autowired
	CompanyloginMapper companyloginMapper;
	
	//从数据库中获取到规定name,password的对象
	public Companylogin getuserCompany(String name, String password) {
		return companyloginMapper.selectbyUsenamepass(name, password);
	}

	//从数据库中获取到规定email,password的对象
	public Companylogin getemailCompany(String email, String password) {
		return companyloginMapper.selectbyUseemailpass(email, password);		
	}
	
	//从数据库中获取到指定的company对象
	public int  insertCompany(Companylogin company){
		return companyloginMapper.insert(company);
	}
		
	//从数据库中获取到指定name的对象
	public Companylogin getCompanybyname(String name) {
		return companyloginMapper.selectbyUsename(name);
	}
		
	//从数据库中获取到指定email的对象
	public Companylogin getCompanybyemail(String email) {
		return companyloginMapper.selectbyemail(email);
	}
	
}
