package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	 private String firstName;
	 private String lastName;
	 private int gradYear;
	 private String studentId;
	 private String courses = "";
	 private int tutionBalance;
	 private int costPerCourse = 600;
	 
	 private static int id=1001;
	 private static int i = 1;
	 
	 public Student() {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the student first name: ");
		 this.firstName = sc.nextLine();
		 
		 System.out.println("Enter the student last name: ");
		 this.lastName = sc.nextLine();
		 
		 System.out.println("Enter the course name \n 1- Freshman \n 2- Sofwtare");
		 this.gradYear = sc.nextInt();
	
		 
		 setStudentId();
		 enroll();
		 
	 }
	//Constructor: prompts user to enter student's name and year
	
	//Generate an ID
	 
	 private void setStudentId() {
		 
		 id++;
		 this.studentId = gradYear + "" + id;
		 
	 }
	
	//Enroll in courses
	 
	 public void enroll() {
		 
		  
		do {
			Scanner c = new Scanner(System.in);
		
		 System.out.println("Enter the course to enroll (or press Q to quite): \n");
		 String course = "";
		 course = c.nextLine();
		 
		if (course.equals("Q")) {
			 System.out.println("Enrollment Finished");
			 break;
			
			 
			 } else if(course.equals("")){
					System.out.println("Fill the field with course name or press Q to quite");}
			 else{
				 courses = courses + "Course" + i + ". " + course + " \n";
				 i++;
				
		 }
		} while (1 != 0 ); 
		 
		 
		
	 }
	
	// View balance 
	
	// Pay Tution
	
	//Show status
	 public void Info() {
		 System.out.println("*****PERSONAL INFORMATION*****\n" + "\nFull Name: " + firstName + " " + lastName + " " + "\nGraduation Year: " + gradYear + "\nID: " + studentId );
		 System.out.println("\n*****Enrolled Courses***** \n" + "\n" + courses);
		 System.out.println("Number of enrolled courses: " + (i-1));
		 System.out.println("Total cost of enrolled courses: "+ (i-1)*costPerCourse + "$");
	 }

}
