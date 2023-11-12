package com.practice1;

public class Employee {

	String name = "Karim";
	String lName = "Sadiqi";
	int age = 23;
	double salary = 990.99d;
	String possition = "Teamlead";
	String address = "12343 Clyton Blvd";
	String gender = "M";
	String sheft = "9 to 5";

	public String leadstheTeam() {
		return "Leads the dev team";
	}

	public String codeReview() {
		return "Reviews the devs codes every day at 2:00pm";
	}

	public String attindMeetings() {
		return "attind the stand up meeting";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee devLead = new Employee();
		
//		invoking the Varible
		System.out.println("name"+devLead.name);
		System.out.println("LName"+devLead.lName);
		System.out.println("Age"+devLead.age);
		System.out.println("Salary"+devLead.salary);
		System.out.println("Possition"+devLead.possition);
		System.out.println("Address"+devLead.address);
		System.out.println("Gender"+devLead.gender);
		System.out.println("Sheft"+devLead.sheft);
		
//		invoking the Object
		System.out.println(devLead.leadstheTeam());
		System.out.println(devLead.codeReview());
		System.out.println(devLead.attindMeetings());
		
		

	}

}
