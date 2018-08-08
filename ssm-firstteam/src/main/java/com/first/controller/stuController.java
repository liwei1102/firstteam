package com.first.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.first.bean.Studentlogin;
import com.first.service.stuService;


@Controller
public class stuController {

	@Autowired
	stuService stuService;
	
	
	@RequestMapping(value = "/findstu")
	public ModelAndView findAll(HttpServletRequest request) {
		Studentlogin studentlogin = stuService.getstu();
		ModelAndView mav = new ModelAndView();
		mav.addObject("member",studentlogin);
		mav.setViewName("/end");
		return mav;
	}	
}
