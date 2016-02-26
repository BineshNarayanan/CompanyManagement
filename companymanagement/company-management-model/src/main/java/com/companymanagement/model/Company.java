package com.companymanagement.model;

/**
 * This class holds the details of a Company.
 * @author Binesh
 *
 */
public class Company 
{
	public Company(){
		
	}
	
	public Company(long companyId, String name) {
		this.companyId = companyId;
		this.name = name;
		this.address = new CompanyAddress();
		this.contact = new CompanyContact();
		this.owners = new CompanyOwners();
	}
	
    private long companyId;
    private String name;
    private CompanyAddress address;
    private CompanyContact contact;
    private CompanyOwners owners;
    
	public CompanyAddress getAddress() {
		return address;
	}
	public void setAddress(CompanyAddress address) {
		this.address = address;
	}
	public CompanyContact getContact() {
		return contact;
	}
	public void setContact(CompanyContact contact) {
		this.contact = contact;
	}
	public CompanyOwners getOwners() {
		return owners;
	}
	public void setOwners(CompanyOwners owners) {
		this.owners = owners;
	}
	public long getCompanyId() {
		return companyId;
	}
	public String getName() {
		return name;
	}
}
