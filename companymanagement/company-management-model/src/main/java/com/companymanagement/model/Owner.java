package com.companymanagement.model;

/**
 * This class holds details about a Company Owner.
 * @author Binesh
 *
 */
public class Owner {
	
	public Owner(){
		
	}
	
	public Owner(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private int id;
	private String name;
	private int ownershipPercent;
	
	public int getOwnershipPercent() {
		return ownershipPercent;
	}
	public void setOwnershipPercent(int ownershipPercent) {
		this.ownershipPercent = ownershipPercent;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + id;
	}
}
