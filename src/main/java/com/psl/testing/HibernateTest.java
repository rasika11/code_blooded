package com.psl.testing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Department;
import com.psl.dao.DepartmentDao;

public class HibernateTest {
 
	@Test
	public void testAdd(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
		
		DepartmentDao d = (DepartmentDao) context.getBean("DepartmentDao");
		//DepartmentDao dd = new DepartmentDao();
		d.add(new Department(101, "Admin", 020123));
	}
	 
 
}
