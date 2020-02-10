package com.planIT.common;

import java.util.ArrayList;

public class Team{
	
    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    private ArrayList<Member> teamMembers;
    private int ageGroupLow;
    private int ageGroupHigh;
    private int teamSize;
    private String teamName;
    private String gender;


	public Team(String teamName,int ageGrpLow, int ageGrpHigh, String gender, int teamSize, ArrayList<Member> memberAddedList) {
    	
    	this.teamName = teamName;
    	this.ageGroupLow = ageGrpLow;
    	this.ageGroupHigh = ageGrpHigh;
    	this.gender = gender;
    	this.teamSize = teamSize;
    	this.teamMembers = memberAddedList;
    	System.out.println("Team: " +teamName + " for age group " + ageGrpLow + "-" +ageGrpHigh + "'s with " + gender + " players and team size " + teamSize + " created");
    }
    
    public ArrayList<Member> getTeamMembers() {
		return teamMembers;
	}


	public void setTeamMembers(ArrayList<Member> teamMembers) {
		this.teamMembers = teamMembers;
	}


    public int getAgeGroupLow() {
		return ageGroupLow;
	}

	public void setAgeGroupLow(int ageGroupLow) {
		this.ageGroupLow = ageGroupLow;
	}

	public int getAgeGroupHigh() {
		return ageGroupHigh;
	}

	public void setAgeGroupHigh(int ageGroupHigh) {
		this.ageGroupHigh = ageGroupHigh;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeamName() {
		return teamName;
	}	

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
