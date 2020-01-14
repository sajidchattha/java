package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		Student stud1 = new Student();
		//stud1.enroll();
	do {
		System.out.println("PRESS:\n 1. i for general information\n2. b for balance");
		String button = "";
		Scanner bt = new Scanner(System.in);
		button = bt.nextLine();
		
		if (button.equals("i") || bt.equals("I")) {
			stud1.Info();	
		}else if (button.equals("b") || bt.equals("B")) {
			
			stud1.balance();
		}
	//
		
		
		
	}while(1 !=0); 
	}

}
