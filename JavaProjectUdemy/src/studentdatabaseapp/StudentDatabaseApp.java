package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		Student stud1 = new Student();
		//stud1.enroll();
		
		System.out.println("PRESS b or B to show information regarding enrollment");
		String button = "";
		Scanner bt = new Scanner(System.in);
		button = bt.nextLine();
		
		if (button.equals("b") || bt.equals("B")) {
			stud1.Info();
			
		}
	//
		
		// Ask the user how many new students will be added to the database
		
         
	}

}
