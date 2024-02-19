package com.jdbcTemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		UserDao dao = context.getBean(UserDao.class);
		dao.create("klm", 23423.00);
	}

}
