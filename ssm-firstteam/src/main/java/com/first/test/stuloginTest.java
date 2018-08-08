package com.first.test;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.first.bean.Studentlogin;
import com.first.dao.StudentloginMapper;



/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class stuloginTest {
	
	
		@Autowired
		StudentloginMapper mapper;
		
		@Test
		public void stulogintest() {
			
			Studentlogin ans = mapper.selectbyUsenamepass("李伟", "123456");
			
			System.out.println(ans.getUsername()+ans.getPassword());
			
		}
		
	

}

