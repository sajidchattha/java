package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	 private String firstName;
	 private String lastName;
	 private int gradYear;
	 private int studentId;
	 private String courses;
	 private int tutionBalance;
	 private int costPerCourse = 600;
	 
	 
	 public Student() {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the student first name: ");
		 this.firstName = sc.nextLine();
		 
		 System.out.println("Enter the student last name: ");
		 this.lastName = sc.nextLine();
		 
		 System.out.println("Enter the course name \n 1- Freshman \n 2-Sofwtare");
		 this.gradYear = sc.nextInt();
	
		 System.out.println(firstName + " " + lastName + " " + gradYear );
		 
	 }
	//Constructor: prompts user to enter student's name and year
	
	//Generate an ID
	
	//Enroll in courses
	
	// View balance 
	
	// Pay Tution
	
	//Show status

}
