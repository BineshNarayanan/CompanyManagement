package com.companymanagement.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.companymanagement.model.Company;
import com.companymanagement.model.CompanyOwners;
import com.companymanagement.model.Owner;

@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(method = RequestMethod.GET)
	public String showHome() {
		return "Welcome to CompanyManagement Portal";
	}

	@RequestMapping(value = "/companymanagement/company/{companyId}", method = RequestMethod.GET)
	public @ResponseBody Company company(@PathVariable String companyId) {
		Company company = new Company(1, "Morningstar");
		if (companyId.equals("2")) {
			company = new Company(2, "Morningstar Investment Services");
		}
		return company;
	}
	
	@RequestMapping(value = "/companymanagement/company", method = RequestMethod.POST,consumes = "application/json")
	public @ResponseBody Company addCompany(@RequestBody Company company) {
		//call service and add the company
		return company;
	}
	
	@RequestMapping(value = "/companymanagement/company/{companyId}", method = RequestMethod.PUT,consumes = "application/json")
	public @ResponseBody Company updateCompany(@PathVariable String companyId, @RequestBody Company company) {
		//call service and update the company
		return company;
	}
	
	@RequestMapping(value = "/companymanagement/company/{companyId}", method = RequestMethod.POST,consumes = "application/json")
	public @ResponseBody Company addOwners(@PathVariable String companyId, @RequestBody Owner owner) {
		//call service get the company
		//add the owners and update;
		Company company = new Company(Integer.parseInt(companyId), "Morningstar");
		CompanyOwners companyOwner = new CompanyOwners();
		companyOwner.addOwner(owner);
		company.setOwners(companyOwner);
		return company;
	}

	@RequestMapping(value = "/companymanagement/company", method = RequestMethod.GET)
	public @ResponseBody List<Company> listCompanies() {
		List<Company> companyList = new ArrayList<Company>(0);
		Company company_1 = new Company(1, "Morningstar");
		Company company_2 = new Company(2, "Morningstar Investment Services");
		companyList.add(company_1);
		companyList.add(company_2);
		return companyList;
	}
	
	
	
}