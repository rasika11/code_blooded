package com.psl.dao;



	

	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.psl.bean.Department;

	
	
//@EnableTransactionManagement
	@Component("DepartmentDao")
	public class DepartmentDao {

		//using spring to inject object of sessionfactory..
		@Autowired
		private SessionFactory sessionFactory;
		
		//@Transactional // declarative transaction mngment
		public void add(Department dept){
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(dept);
			session.getTransaction().commit();
				
		}
		
	}


	
		

