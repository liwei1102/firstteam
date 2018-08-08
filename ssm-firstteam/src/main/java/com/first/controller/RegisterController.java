package com.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.bean.Administratorlogin;
import com.first.bean.Companylogin;
import com.first.bean.Studentlogin;
import com.first.service.AdministratorloginService;
import com.first.service.CompanyloginService;
import com.first.service.StudentloginService;

@Controller
public class RegisterController {

	@Autowired
	StudentloginService studentloginservice;
	
	@Autowired
	CompanyloginService companyloginService;
	
	@Autowired
	AdministratorloginService administratorloginService;
	
	
	@ResponseBody
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(String identity, String username, String mail, String password,String question,String answer) {
		System.out.println(identity);
		System.out.println(username);
		System.out.println(password);
		System.out.println(password);
		System.out.println(question);
		System.out.println(answer);
		
		if(identity.equals("毕业生")) {
			Studentlogin studentlogin = new Studentlogin(username,password,mail,question,answer);
			try {
				if(studentloginservice.getStudentbyname(studentlogin.getUsername())==null && 
						studentloginservice.getStudentbyemail(studentlogin.getEmail())==null) {
					System.out.println("可以插");
					studentloginservice.insertStudent(studentlogin);
					System.out.println("注册成功！");
					return "success";
				}else {
					System.out.println("不可以插");
					System.out.println("该用户名或邮箱已注册，请重新输入！");
					return "failure";
				}	
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("注册失败！");
				return "failure";
			}
		}
		if(identity.equals("企业")){
			Companylogin companylogin = new Companylogin(username,password,mail,question,answer);
			try {
				if(companyloginService.getCompanybyname(companylogin.getUsername())==null && 
						companyloginService.getCompanybyemail(companylogin.getEmail())==null) {
					System.out.println("可以插");
					companyloginService.insertCompany(companylogin);
					System.out.println("注册成功！");
					return "success";
				}else {
					System.out.println("不可以插");
					System.out.println("该用户名或邮箱已注册，请重新输入！");
					return "failure";
				}	
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("注册失败！");
				return "failure";
			}
		}
		if(identity.equals("管理员")) {
			Administratorlogin administratorlogin = new Administratorlogin(username,password,mail,question,answer);
			try {
				if(administratorloginService.getAdministratorbyname(administratorlogin.getUsername())==null && 
						administratorloginService.getAdministratorbyemail(administratorlogin.getEmail())==null) {
					System.out.println("可以插");
					administratorloginService.insertAdministrator(administratorlogin);
					System.out.println("注册成功！");
					return "success";
				}else {
					System.out.println("不可以插");
					System.out.println("该用户名或邮箱已注册，请重新输入！");
					return "failure";
				}	
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("注册失败！");
				return "failure";
			}
		}
		
		return "failure";
	}
}
