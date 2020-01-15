package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		Student stud1 = new Student();
		//stud1.enroll();
	do {
		System.out.println("\n\nPRESS:\ni for full information\nb for balance\np for Pyaments");
		String button = "";
		Scanner bt = new Scanner(System.in);
		button = bt.nextLine();
		
		if (button.equals("i") || bt.equals("I")) {
			stud1.Info();	
		}else if (button.equals("b") || bt.equals("B")) {
			
			stud1.balance();
		}else if (button.equals("p") || bt.equals("P")) {
			
			stud1.payment(5000);
		}
	//
		
		
		
	}while(1 !=0); 
	}

}
