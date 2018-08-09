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
	//�����û���������������ݿ⣬�Ƿ�������û���������ƥ��
	public String findBackPassword_01(String identity, String username, String email,HttpSession session) {
		System.out.println("���:"+identity+" �û���:"+username+" ����:"+email);
		
		if(identity.equals("��ҵ��")) {
			try {
				Studentlogin student = studentloginservice.getStudentbyname(username);
				//System.out.println(student);
				//�û������䲻���ڻ�ƥ��
				if(student == null) {
					System.out.println("û�д��˻���");
					return "nofailure";
				}
				else {
					if(!student.getEmail().equals(email)) {
						System.out.println("�˻������䲻ƥ�䣡");
						return "matchfailure";}
					   
				}
				//�û����������
				session.setAttribute("userfindback",student);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("���ݿ��ѯ�쳣��");
				return "failure";
			}	
		}
		if(identity.equals("��ҵ")) {
			try {
				Companylogin com = companyloginService.getCompanybyname(username);
				//System.out.println(student);
				//�û������䲻���ڻ�ƥ��
				if(com == null) {
					System.out.println("û�д��˻���");
					return "nofailure";
				}
				else {
					if(!com.getEmail().equals(email)) {
						System.out.println("�˻������䲻ƥ�䣡");
						return "matchfailure";}
					   
				}
				//�û����������
				session.setAttribute("userfindback",com);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("���ݿ��ѯ�쳣��");
				return "failure";
			}	
		}
		if(identity.equals("����Ա")) {
			try {
				Administratorlogin admin = administratorloginService.getAdministratorbyname(username);
				//System.out.println(student);
				//�û������䲻���ڻ�ƥ��
				if(admin == null) {
					System.out.println("û�д��˻���");
					return "nofailure";
				}
				else {
					if(!admin.getEmail().equals(email)) {
						System.out.println("�˻������䲻ƥ�䣡");
						return "matchfailure";}
					   
				}
				//�û����������
				session.setAttribute("userfindback",admin);
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("���ݿ��ѯ�쳣��");
				return "failure";
			}	
		}
		System.out.println("δ֪����");
		return "failure";
		
	}
	@ResponseBody
	@RequestMapping(value="findback_02", method = RequestMethod.POST)
	//�û�����Ĵ������ݿ�Ƚ�
	public String findBackPassword_02(String answer,HttpSession session) {
		//�ж�session���Ƿ���userfindback�˶���
		if(session.getAttribute("userfindback")==null) {
			System.out.println("session��û��userfindback");
			return "failure";
		}
		else {
			Class c= session.getAttribute("userfindback").getClass();
			if(c.equals(Studentlogin.class)) {
				System.out.println("student�޸�");
				Studentlogin stu = (Studentlogin)session.getAttribute("userfindback");
				if(stu.getAnswer()!=null&&stu.getAnswer().equals(answer)) 
					return "success";
				else
					return "failure";
			}
			else if(c.equals(Companylogin.class)) {
				System.out.println("company�޸�");
				Companylogin com = (Companylogin)session.getAttribute("userfindback");
				if(com.getAnswer()!=null&&com.getAnswer().equals(answer)) 
					return "success";
				else
					return "failure";
			}
			else if(c.equals(Administratorlogin.class)) {
				System.out.println("admin�޸�");
				Administratorlogin admin = (Administratorlogin)session.getAttribute("userfindback");
				//System.out.println("���ݿ��д�:"+admin.getAnswer());
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
	//�޸����ݿ⣬��������
	public String findBackPassword_03(String password,HttpSession session) {
		if(session.getAttribute("userfindback")==null) {
			System.out.println("session��û��userfindback");
			return "failure";
		}
		else {
			Class c= session.getAttribute("userfindback").getClass();
			try {
				if(c.equals(Studentlogin.class)) {
					Studentlogin stu = (Studentlogin)session.getAttribute("userfindback");
					studentloginservice.resetPassword(stu.getStuloginid(), password);
					//����userfindback����
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
		    	 System.out.println("���ݿ��޸�����ʧ��");
				 session.removeAttribute("userfindback");
		    	 return "failure";
		     }
			
		}
	}
}