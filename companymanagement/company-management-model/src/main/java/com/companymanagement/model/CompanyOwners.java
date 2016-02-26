package com.companymanagement.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds the list of company owners.
 * @author Binesh
 *
 */
public class CompanyOwners {
	List<Owner> owners = new ArrayList<Owner>();

	public List<Owner> getOwners() {
		return owners;
	}
	
	public void addOwner(Owner owner){
		owners.add(owner);
	}

}
