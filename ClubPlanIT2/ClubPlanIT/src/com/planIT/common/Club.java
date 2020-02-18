package com.planIT.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.planIT.common.Member.Address;

public class Club
{
	
    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
	private static ArrayList<Member> memberList;
	private static ArrayList<Member> memberAddedList;
	private static String teamDescription = null;
	private static Team newTeam;
	private static Club club;
	
	// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    public Club() {
    	
    	System.out.println("Welcome to our Club..");
    	
        memberList = new ArrayList();          
        //ArrayList comprising member attributes and associated address attributes for players - line1, line2, city, state, postcode, country

        memberList.add(new Player("Jameson", "Bond", "M", "01/01/1998", "Nigerian",	new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Fred", "Smith", "M", "02/02/1999", "British", new Address("12","Harper ST","Canterbury","Kent","DA44FR","UK")));
        memberList.add(new Player("Susan", "Blue", "F", "03/03/2000", "American", new Address("25","Jason Cl","Dartford","Kent","DA3FR","UK")));
        memberList.add(new Player("Fern", "Towns", "M", "04/05/2001", "Nigerian", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("William", "Gonzo", "F", "05/06/2002", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Jenny", "Sung", "F", "12/12/1990", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Martin", "James", "M", "05/05/1992", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Hasan", "Sung", "F", "12/12/1999", "British", new Address("222","Jameson ST","Rochester","Kent","RM23FR","UK")));
        memberList.add(new Player("Thomas", "Cat", "F", "08/09/1991", "British", new Address("15A"," ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Christy", "Sung", "M", "12/12/1991", "British", new Address("56","lyon ST","Wembley","Middlesex","HA22JG","UK")));
        memberList.add(new Player("Micky", "Mouse", "F", "01/12/1981", "British", new Address("37","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Micky", "White", "F", "01/12/1994", "British", new Address("124","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Minni", "Mouse", "F", "01/12/1999", "British", new Address("125","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Minnie", "White", "F", "01/12/1991", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Nicky", "White", "M", "01/12/1988", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Rocky", "Moore", "M", "01/12/1991", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Vinn", "Joyce", "F", "01/12/1991", "British", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Jas", "Pal", "M", "10/12/1980", "Indian", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Leon", "James", "M", "05/05/1997", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Kevin", "Durant", "M", "05/05/1996", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Kevin", "Love", "M", "05/05/1999", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Jimmy", "Butler", "M", "05/05/1994", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Maya", "Moore", "F", "05/05/1992", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Cynthia", "Cooper", "F", "05/05/1994", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Lauren", "Jackson", "F", "05/05/1985", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Paul", "George", "M", "05/05/1981", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Chris", "Paul", "M", "05/05/1994", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Laura", "Jane", "F", "05/05/1995", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Pauline", "George", "F", "05/05/1981", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Player("Christy", "Smith", "F", "05/05/1982", "New Zealand", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));     
        
      //ArrayList comprising member attributes and associated address attributes for Coach - line1, line2, city, state, postcode, country
        
        memberList.add(new Coach("Max", "Bond", "M", "22/01/2004", "Dutch", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Coach("Pete", "Jones", "M", "23/02/1999", "Spanish", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Coach("Gail", "Lama", "F", "24/05/2005", "Argentine", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Coach("Dave", "Reed", "M", "25/02/2002", "Brazilian", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));
        memberList.add(new Coach("Susan", "Franks", "F", "27/02/2003", "Mexican", new Address("123","Main ST","Dartford","Kent","DA23FR","UK")));           
        System.out.println("FirstName LastName Gender");
        
        for(Member old:memberList) {
        	System.out.println(old.getFirstName() + "\t" + old.getLastName() + "\t" + old.getGender());
        }
    }
    
    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public static void main(String [] args) {
    	
     	if(club==null) {
     		club = new Club();
     	}
    	
     	
        try {
       	
            Scanner input=new Scanner(System.in);

             
            memberAddedList = new ArrayList();
            Utility util = new Utility();

    		System.out.print("Do you want to create a Team?:  Y(T) or N(F) ");
    		String ansCreateTeam=input.next();
    		
    		if(util.convertToBoolean(ansCreateTeam)) 
    		{
    			newTeam = club.createTeam();
    		}else 
    		{
    			if(!ansCreateTeam.equalsIgnoreCase("F") && !ansCreateTeam.equalsIgnoreCase("N")) {
        			System.out.println("Invalid Input");
       
    			}else {
    				System.out.println("Thank you for using our Team creator App");
    				System.exit(0);
    			}
    		}
    		
    		if(newTeam!=null) {
    			
    			club.addMembersToTeamFromList();
    			
    			for(Member m : newTeam.getTeamMembers()) {
    				Period p = club.getPeriod(m.getDob(),LocalDate.now());
    				System.out.println(m.getFirstName() + " " + m.getLastName() + " : " + m.getGender()  + " : " + m.getRole()  + " : " + p.getYears());
    			}
    		}else {System.out.println("Team needs to be created to continue...");
    		newTeam = club.createTeam();
    			
    		}
    		
    		System.out.print("Do you want to add new members to Team?: Y(T) or N(F) ");
    		String ansAddMemberToTeam=input.next();
    		
    		if(util.convertToBoolean(ansAddMemberToTeam)) { 
    			
        		System.out.print("Input name to add to team: ");
        		String name=input.next();
    			club.addTeamMembers(name,memberAddedList);
    		}else {
    			if(!ansAddMemberToTeam.equalsIgnoreCase("F") && !ansAddMemberToTeam.equalsIgnoreCase("N")) {
        			System.out.println("Invalid Input");
        			System.exit(0);
    			}else {
    				//club.printMemberList(memberList);
    				main(args);
    			
    			}
    		}
        
    		
    		// To add a new member to the Club
    		System.out.println("Do you want to add a member to the club? Y(T) or N(F) ");
    		String clubMemberInput = input.next();
    		
    		if(util.convertToBoolean(clubMemberInput)) {
    			club.addMember();
    		}
    		
        }catch(InputMismatchException e) {
        	System.out.println("Wrong input entered " +e);
        }

    }
    private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
        return Period.between(dob.toLocalDate(), now.toLocalDate());
    }
    
    public Team createTeam() 
    {
    	Scanner input=new Scanner(System.in);
    	
		System.out.print("Input Team Name: ");
		String tName=input.nextLine();
		
		System.out.print("\nInput Age Group Low: ");
		int ageGrpLow=input.nextInt();
		
		System.out.print("\nInput Age Group High: ");
		int ageGrpHigh=input.nextInt();
		
		System.out.print("\nInput Team Gender:M/F/Mixed ");
		String gender=input.next();		
		
		System.out.print("\nInput Team Size: ");
    	int tSize=input.nextInt();
    	
    	if(!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("Mixed")) {
    		System.out.println("Invalid gender input");
    		System.exit(0);
    	}
    	
		Team team = new Team(tName, ageGrpLow, ageGrpHigh, gender, tSize, memberAddedList);
		
    	teamDescription = "Team: " +tName + " for age group " + ageGrpLow+":"+ageGrpHigh + "'s with " + gender + " players and team size " + tSize;
    	
		return team;
    	
    }
    
    public ArrayList<Member> addMember() {
    	
    	try {
        	Scanner input=new Scanner(System.in);
        	Member mem = new Member();
            Utility util = new Utility();
        	
    		System.out.print("\nInput Member Type (Player or Coach) : ");
    		String type=input.next();
    		
        	if(type.equalsIgnoreCase("Coach")) {
        		mem = (Member) new Coach();
        	}else if(type.equalsIgnoreCase("Player")){
        		mem = (Member) new Player();
        	}else {
        		System.out.println("Invalid type");
        		System.exit(0);
        	}

    		System.out.print("Input FirstName: ");
    		String fName=input.next();	
    		System.out.print("\nInput LastName: ");
    		String lName=input.next();	
    		System.out.print("\nInput Gender: ");
    		String gender=input.next();	
    		System.out.print("\nInput Date of Birth - Format dd/MM/yyyy: ");
    		String dob=input.next();	
    		System.out.print("\nInput Nationality: ");
    		String nation=input.next();	
    		
    		mem.setFirstName(fName);
        	mem.setLastName(lName);
        	mem.setGender(gender);
        	mem.setDob(dob);
        	mem.setnationality(nation);
  		
    		System.out.print("Input Addr1: ");
    		String addr1=input.next();	
    		System.out.print("\nInput Addr2: ");
    		String addr2=input.next();	
    		System.out.print("\nInput City: ");
    		String city=input.next();	
    		System.out.print("\nInput State: ");
    		String state=input.next();	
    		System.out.print("\nInput Postcode: ");
    		String postCode=input.next();	
    		System.out.print("\nInput Country: ");
    		String country=input.next();	

        	Address addr = new Address(addr1,addr2, city, state,postCode,country);

        	mem.setAddress(addr);

        	memberList.add(mem);
        	
    		printMemberList(memberList);
    		
    		System.out.print("Do you want to add more members?:  Y(T) or N(F)");
    		String ansAddMore=input.next();
    		
        	if(util.convertToBoolean(ansAddMore)) {
        		addMember();
        	}
    	}catch(DateTimeParseException e){
    		System.out.println("Wrong date input entered " +e);
    	}catch(InputMismatchException e) {
        	System.out.println("Wrong input entered " +e);
    	}catch(NullPointerException e) {
    		System.out.println("null input entered " +e);
    	}

    	return memberList;
    }
    
    public Team addTeamMembers(String name, ArrayList<Member> members) {
    	Scanner input=new Scanner(System.in);
        Utility util = new Utility();
        
        if(newTeam==null) {
        	System.out.println("Team needs to be created before you can add members ");
        	newTeam = createTeam();
        }
        
    	for(Member m : memberList) {
    		
    		if(m.getFirstName().equalsIgnoreCase(name)) {
    			
    			if(newTeam.getGender().equalsIgnoreCase(m.getGender())) {
        			LocalDate today = LocalDate.now();
        			LocalDate dob = m.getDob();

        			members.add(m);
        			newTeam.setTeamMembers(members);
    			}else {
    				System.out.println("Invalid Gender match");
    			}
    			
    			for(Member p : newTeam.getTeamMembers()) {
    				System.out.println(p.getFirstName() + "-" + p.getLastName() + " is a member of " + newTeam.getTeamName());
    			}

    			
    		}
    	}
		System.out.print("Do you want to add more members?:  Y(T) or N(F)");
		String ansAddMore=input.next();
		
    	if(util.convertToBoolean(ansAddMore)) {
    		System.out.print("Input name to add to team");
    		String newMem=input.next();
			addTeamMembers(newMem,memberAddedList);
    	}
    	
    	return newTeam;
    }
    
    private Period getPeriod(LocalDate dob, LocalDate today) {
    	return Period.between(dob, today);
	}
    
	public void getDisplayText() {
		
		System.out.println("\n"+teamDescription);
		
		for(Member m : newTeam.getTeamMembers()) {
			System.out.println("\n|" + m.getFirstName() + " " + m.getLastName() +"| Gender - "+ m.getGender() +" | Dob - "+ m.getDob() +" | nationality - " + m.getnationality()+ " added to team");
		}
	}
	
	public void printMemberList(ArrayList<Member> members) {
		
		System.out.println("Our member list contains.....");
		for(Member m : members) {
			System.out.println("\n|" + m.getFirstName() + " " + m.getLastName() +"| Gender - "+ m.getGender() +" | Dob - "+ m.getDob() +" | nationality - " + m.getnationality());
		
		}
	}	
	
	public void addMembersToTeamFromList() {
		
               
		for(Member m:memberList) {

			if(m.getRole().equalsIgnoreCase("Coach") && (m.getGender().equalsIgnoreCase(newTeam.getGender()) || newTeam.getGender().equalsIgnoreCase("Mixed"))) {
				newTeam.getTeamMembers().add(m);
				break;
			}
		}        
        
		for(Member m:memberList) {
			Period p = club.getPeriod(m.getDob(),LocalDate.now());

			if(m.getRole().equalsIgnoreCase("Player") && (p.getYears() >= newTeam.getAgeGroupLow() && p.getYears() <=newTeam.getAgeGroupHigh()) && (m.getGender().equalsIgnoreCase(newTeam.getGender()) || newTeam.getGender().equalsIgnoreCase("Mixed"))) {
				
				if(newTeam.getTeamMembers().size()< newTeam.getTeamSize()) {
					newTeam.getTeamMembers().add(m);
				}else {
					System.out.println("Team size met..");
					break;
				}
			}
		}
		
		if(newTeam.getTeamMembers().size()< newTeam.getTeamSize()) {
			newTeam = null;
			System.out.println("Team cannot be created. Not enough members for specified team size!");
			String[] args = null;
			main(args);
		}
		

	}
    
}
