package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Ask How Many User We Want To Add
		
		//Create n Number of new student
		System.out.print("Enter number of new Students Enrolled: ");
		Scanner scn = new Scanner(System.in);
		int numOfStudent = scn.nextInt();
		Student[] arr = new Student[numOfStudent];
		
		
		//create new student
		for(int n=0;n<numOfStudent;n++) {
			arr[n] = new Student();
			arr[n].enroll();
			arr[n].payTution();
			
		}
		
		for(int n=0;n<numOfStudent;n++) {
			System.out.println("\nStudent " + (n+1) + " Info");
			System.out.println(arr[n].showInfo());
		}
		
	}

}
