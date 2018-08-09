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
public class FindBackController {
	@Autowired
	StudentloginService studentloginservice;
	
	@Autowired
	CompanyloginService companyloginService;
	
	@Autowired
	AdministratorloginService administratorloginService;
	
	@ResponseBody
	@RequestMapping(value="findback_01", method = RequestMethod.POST)
	//根据用户名和邮箱查找数据库，是否输入的用户名和邮箱匹配
	public String findBackPassword_01(String identity, String username, String email,HttpSession session) {
		System.out.println("身份:"+identity+" 用户名:"+username+" 邮箱:"+email);
		
		if(identity.equals("毕业生")) {
			try {
				Studentlogin student = studentloginservice.getStudentbyname(username);
				//System.out.println(student);
				//用户或邮箱不存在或不匹配
				if(student == null) {
					System.out.println("没有此账户！");
					return "nofailure";
				}
				else {
					if(!student.getEmail().equals(email)) {
						System.out.println("账户和邮箱不匹配！");
						return "matchfailure";}
					   
				}
				//用户和邮箱合理
				session.setAttribute("userfindback",student);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("数据库查询异常！");
				return "failure";
			}	
		}
		if(identity.equals("企业")) {
			try {
				Companylogin com = companyloginService.getCompanybyname(username);
				//System.out.println(student);
				//用户或邮箱不存在或不匹配
				if(com == null) {
					System.out.println("没有此账户！");
					return "nofailure";
				}
				else {
					if(!com.getEmail().equals(email)) {
						System.out.println("账户和邮箱不匹配！");
						return "matchfailure";}
					   
				}
				//用户和邮箱合理
				session.setAttribute("userfindback",com);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("数据库查询异常！");
				return "failure";
			}	
		}
		if(identity.equals("管理员")) {
			try {
				Administratorlogin admin = administratorloginService.getAdministratorbyname(username);
				//System.out.println(student);
				//用户或邮箱不存在或不匹配
				if(admin == null) {
					System.out.println("没有此账户！");
					return "nofailure";
				}
				else {
					if(!admin.getEmail().equals(email)) {
						System.out.println("账户和邮箱不匹配！");
						return "matchfailure";}
					   
				}
				//用户和邮箱合理
				session.setAttribute("userfindback",admin);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("数据库查询异常！");
				return "failure";
			}	
		}
		System.out.println("未知错误！");
		return "failure";
		
	}
	@ResponseBody
	@RequestMapping(value="findback_02", method = RequestMethod.POST)
	//用户输入的答案与数据库比较
	public String findBackPassword_02(String answer,HttpSession session) {
		//判断session中是否有userfindback此对象
		if(session.getAttribute("userfindback")==null) {
			System.out.println("session中没有userfindback");
			return "failure";
		}
		else {
			Class c= session.getAttribute("userfindback").getClass();
			if(c.equals(Studentlogin.class)) {
				System.out.println("student修改");
				Studentlogin stu = (Studentlogin)session.getAttribute("userfindback");
				if(stu.getAnswer()!=null&&stu.getAnswer().equals(answer)) 
					return "success";
				else
					return "failure";
			}
			else if(c.equals(Companylogin.class)) {
				System.out.println("company修改");
				Companylogin com = (Companylogin)session.getAttribute("userfindback");
				if(com.getAnswer()!=null&&com.getAnswer().equals(answer)) 
					return "success";
				else
					return "failure";
			}
			else if(c.equals(Administratorlogin.class)) {
				System.out.println("admin修改");
				Administratorlogin admin = (Administratorlogin)session.getAttribute("userfindback");
				//System.out.println("数据库中答案:"+admin.getAnswer());
				if(admin.getAnswer()!=null&&admin.getAnswer().equals(answer)) 
					return "success";
				else
					return "failure";
			}
			else
				return "failure";
			
			
		}
		
	}
	@ResponseBody
	@RequestMapping(value="findback_03", method = RequestMethod.POST)
	//修改数据库，重设密码
	public String findBackPassword_03(String password,HttpSession session) {
		if(session.getAttribute("userfindback")==null) {
			System.out.println("session中没有userfindback");
			return "failure";
		}
		else {
			Class c= session.getAttribute("userfindback").getClass();
			try {
				if(c.equals(Studentlogin.class)) {
					Studentlogin stu = (Studentlogin)session.getAttribute("userfindback");
					studentloginservice.resetPassword(stu.getStuloginid(), password);
					//销毁userfindback对象
					session.removeAttribute("userfindback");
					return "success";
				}
				else if(c.equals(Companylogin.class)) {
					Companylogin com = (Companylogin)session.getAttribute("userfindback");
					companyloginService.resetPassword(com.getComploginid(), password);
					session.removeAttribute("userfindback");
					return "success";
				}
				else if(c.equals(Administratorlogin.class)) {
					Administratorlogin admin = (Administratorlogin)session.getAttribute("userfindback");
					administratorloginService.resetPassword(admin.getAdminloginid(), password);
					session.removeAttribute("userfindback");
					return "success";
				}
				else {
					session.removeAttribute("userfindback");
					return "failure";
					}
		     }catch(Exception e) {
		    	 e.printStackTrace();
		    	 System.out.println("数据库修改密码失败");
				 session.removeAttribute("userfindback");
		    	 return "failure";
		     }
			
		}
	}
}