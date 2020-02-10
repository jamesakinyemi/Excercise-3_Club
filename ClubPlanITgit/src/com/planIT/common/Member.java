package com.planIT.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member 
/**
 * A member has firstname, lastname, gender, DOB, address, nationality, Role added to cater for Coach or Player method
 */
{
	
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dob;
	private String nationality;
	private String role;
	private Address address;
	
	/**
	 * Getters and setters added by highlighting and selecting Getters and Setters option from "source"
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public LocalDate getDob() 
	{
		return dob;
	}
	
	public void setDob(String dob) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate newDate = LocalDate.parse(dob,df);		
		this.dob = newDate;
	}
	
	public String getnationality() 
	{
		return nationality;
	}
	
	public void setnationality(String nationality) 
	{
		this.nationality = nationality;
	}

	public String getRole() 
	{
		return role;
	}
	
	public void setRole(String role) 
	{
		this.role = role;
	}
	
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}

	// Inner class for the address fields line1, line2, city, state, postcode, country. Inner class created for address within the member class.
		
	static class Address
		{
		
		private String addrLine1;
		private String addrLine2;
		private String city;
		private String state;
		private String postCode;
		private String country;
		
		public Address(String addr1, String addr2, String city, String state,String postCode,String country) {
			this.setAddrLine1(addr1);
			this.setAddrLine2(addr2);
			this.setCity(city);
			this.setState(state);
			this.setPostCode(postCode);
			this.setCountry(country);
		}
		
		public String getAddrLine1() {
			return addrLine1;
		}
		public void setAddrLine1(String addrLine1) {
			this.addrLine1 = addrLine1;
		}
		public String getAddrLine2() {
			return addrLine2;
		}
		public void setAddrLine2(String addrLine2) {
			this.addrLine2 = addrLine2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostCode() {
			return postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
	
	}
}
