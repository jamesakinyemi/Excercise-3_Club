package com.planIT.common;

public class Player extends Member {
	
	public Player(String fName, String lName, String gender, String dob, String nationality, Address address)
	{
		this.setRole("Player");
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setGender(gender);
		this.setDob(dob);
		this.setnationality(nationality);

		this.setAddress(address);
		
	}
	
	public Player() {
		this.setRole("Player");
	}
}
