package com.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.bean.Studentlogin;
import com.first.dao.StudentloginMapper;

@Service
public class stuService {
	
	@Autowired
	StudentloginMapper mapper;
	
	
	public Studentlogin getstu() {
		return mapper.selectbyUsenamepass("李伟", "123456");
	}
}
