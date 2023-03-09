package studentdatabaseapp;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	//constructor to prompt user name and year
	public Student() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = scn.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = scn.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level: ");
		this.gradeYear = scn.nextInt();
		setStudentID();
		

		
		
	}
	
	//Generate ID
	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll in course
	public void enroll() {
		do {
			System.out.print("Enter Course To Enroll(Q to quit): ");
			Scanner scn = new Scanner(System.in);
			String course = scn.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costOfCourse;
			}else {
				break;
			}
		}while(1 != 0);
		
		
		System.out.println("Tuition Fee is : " + tutionBalance);
	}
	
	
	
	public void remainingBalance() {
		System.out.println("Your Pending Fee is ₹: " + tutionBalance);
	}
	
	//Pay tution	
	public void payTution() {
		System.out.println("Enter The Amount You Want To Pay Now ₹: ");
		Scanner scn = new Scanner(System.in);
		int payment = scn.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("-------------------------------------------");
		System.out.println("Thank you for your payment of ₹" + payment);
		remainingBalance();
		System.out.println("-------------------------------------------");
	}
	
	//Show Info
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +"\nStudent ID : "+ studentId +"\nCourses Enrolled :" + courses +
				"\nRemaining Fee ₹: " + tutionBalance;
	}
}
