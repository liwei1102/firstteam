package com.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.bean.Studentlogin;
import com.first.service.StudentloginService;

@Controller
public class StudentloginController {
	
	
	@Autowired
	StudentloginService studentloginservice;
	
	@ResponseBody
	@RequestMapping(value="/studentlogin", method = RequestMethod.POST)
	public String studentlogin(String account, String password) {
		
		System.out.println(account);
		System.out.println(password);
			try {
				Studentlogin student = studentloginservice.getuserStudent(account, password);
				System.out.println("haha");
				
				if(student == null) {
					System.out.println("登录失败！");
					return "failure";
				}else {
					System.out.println("登录成功！");
					return "{\"success\":true} ";
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("登录失败！");
				return "failure";
			}	
	}
	
	
	@ResponseBody
	@RequestMapping(value="/studentregister", method = RequestMethod.POST)
	public String studentlogin(String username,String mail,String password,String question, String answer) {
		
		System.out.println(username);
		System.out.println(mail);
		System.out.println(password);
		System.out.println(question);
		System.out.println(answer);
		System.out.println("kaishi");
		
		Studentlogin studentlogin = new Studentlogin(username,password,mail,question,answer);
		
		try {
			
			if(studentloginservice.getStudentbyname(studentlogin.getUsername())==null && 
					studentloginservice.getStudentbyemail(studentlogin.getEmail())==null) {
				System.out.println("可以插");
				studentloginservice.insertStudent(studentlogin);
				System.out.println("注册成功！");
				return "{\"success\":true}";
				
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
	}
