package emailapp;

import java.util.Scanner;

public class Email {
	
	// as i dont want people to access these data memebers, i follow the encapsulation and make them private
	
		private String firstname;
		private String lastname;
		private String password;
		private String department;
		private int mailboxCapacity;
		private String email;
		private String alternateEmail;
		
		
		// We need constructor to recieve first and last name
		
		public Email (String firstname, String lastname) {
			
			//this.<class_variable> = local_variable
			this.firstname = firstname;
			this.lastname = lastname;
	        System.out.println(this.firstname + " "+this.lastname);
	        
	        this.department = setDepartment();
	        System.out.println("Department is: " + this.department);
        
	        this.email = setEmail();
	        System.out.println("Email address: " + this.email);
        
        //Call a method to ask for a department and return the department
		}
		
		//methods should be outside the constructor 
		
		
        private String setDepartment() {
        	
        	System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 none ");
        	Scanner scan = new Scanner(System.in);
        	int department_choice = scan.nextInt();
        	
        	if (department_choice == 1) { return "Sales";}
        	else if (department_choice == 2) {return "development";}
        	else if (department_choice == 3) {return "Accounting";}
        	else return "";	
        }
        
        
        private String setEmail() {
        	
        	String emailaddr = firstname.toLowerCase() + "." + lastname.toLowerCase() +"@gmail.com";
        	return emailaddr;
       }
        
		//Ask for department
		
		//Generate the random password
		
		//Generate a random password
		
		
		//set the mailbox capacity
		
		// change the password
		
		
}
