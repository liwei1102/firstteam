package com.first.controller;

import javax.servlet.http.HttpSession;

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
public class LoginController {

	@Autowired
	StudentloginService studentloginservice;
	
	@Autowired
	CompanyloginService companyloginService;
	
	@Autowired
	AdministratorloginService administratorloginService;
	
	
	@ResponseBody
	@RequestMapping(value="/userlogin", method = RequestMethod.POST)
	public String userLogin(String identity, String account, String password,HttpSession session) {
		System.out.println(identity);
		System.out.println(account);
		System.out.println(password);
		if(identity.equals("毕业生")) {
			try {
				Studentlogin student = studentloginservice.getuserStudent(account, password);
				System.out.println("haha");
				if(student == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",student );
					//System.out.println(student);
					return "studentsuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}
		if(identity.equals("企业")){
			try {
				Companylogin company = companyloginService.getuserCompany(account, password);
				System.out.println("haha");
				if(company == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",company);
					return "companysuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}
		if(identity.equals("管理员")) {
			try {
				Administratorlogin adminstrator = administratorloginService.getuserAdministrator(account, password);
				System.out.println("haha");
				if(adminstrator == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",adminstrator);
					return "administratorsuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}	
		return "failure";
	}
	
	@ResponseBody
	@RequestMapping(value="/emaillogin", method = RequestMethod.POST)
	public String emailLogin(String identity, String email, String password,HttpSession session) {
		System.out.println(identity);
		System.out.println(email);
		System.out.println(password);
		if(identity.equals("毕业生")) {
			try {
				Studentlogin student = studentloginservice.getemailStudent(email, password);
				System.out.println("haha");
				if(student == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",student );
					return "studentsuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}
		if(identity.equals("企业")){
			try {
				Companylogin company = companyloginService.getemailCompany(email, password);
				System.out.println("haha");
				if(company == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",company );
					return "companysuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}
		if(identity.equals("管理员")) {
			try {
				Administratorlogin adminstrator = administratorloginService.getemailAdministrator(email, password);
				System.out.println("haha");
				if(adminstrator == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					//return "{\"success\":true} ";
					//write
					session.setAttribute("user",adminstrator );
					return "administratorsuccess";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
		}	
		return "failure";
	}
}
