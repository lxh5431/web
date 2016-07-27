package com.javen.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.javen.model.User;
import com.javen.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  

public class TestMyBatis {
	private static Logger logger=Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService=null;
	@Test
	public void test1(){
		User user=userService.getUserById(2);
		logger.info(JSON.toJSONString(user));
	}

}
