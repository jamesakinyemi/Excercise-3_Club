package com.planIT.common;

public class Utility {
	
	public boolean isNotEmpty(String args) {
		
		if(args != "" || args !=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public boolean isEmpty(String value) {
		
		if(value == "" || value ==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean convertToBoolean(String value) {
		
		if(value.equalsIgnoreCase("Y") || value.equalsIgnoreCase("T")) {
			return true;
		}else {
			return false;
		}
	}

}
