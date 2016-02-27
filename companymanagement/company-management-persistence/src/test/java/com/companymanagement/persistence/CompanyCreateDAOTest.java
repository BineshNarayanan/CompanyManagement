package com.companymanagement.persistence;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.companymanagement.model.Company;
import com.companymanagement.persistence.impl.CompanyCreateDAO;

public class CompanyCreateDAOTest {
	
	CompanyCreateDAO<Company> companyCreateDao;
	
	@Before
	public void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("companymanagement-persistence.xml");
		companyCreateDao = (CompanyCreateDAO<Company>)context.getBean("companyCreateDao");
	}
	
	@Test
	public void createCompany(){
		companyCreateDao.create(null);
		while(true){
			
		}
	}
}
