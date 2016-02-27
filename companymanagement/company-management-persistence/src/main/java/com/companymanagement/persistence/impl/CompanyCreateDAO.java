package com.companymanagement.persistence.impl;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.companymanagement.persistence.ICreateDAO;

public class CompanyCreateDAO<Company> implements ICreateDAO<Company> {
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void create(Company object) {
		System.out.println("Company Create..");
		
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

}
