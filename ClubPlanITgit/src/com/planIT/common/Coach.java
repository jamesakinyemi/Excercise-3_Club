package com.planIT.common;

public class Coach extends Member 
{
	
	public Coach(String fName, String lName, String gender,String dob, String nationality, Address address)
	{
		this.setRole("Coach");
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setGender(gender);
		this.setDob(dob);
		this.setnationality(nationality);

		
		this.setAddress(address);
		
	}
	
	public Coach() {
		this.setRole("Coach");
	}
}
