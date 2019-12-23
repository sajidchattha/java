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
		private int defaultPasswordlength = 12;
		
		
		// We need constructor to recieve first and last name
		
		public Email () {
			
			//this.<class_variable> = local_variable
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name: ");
			firstname = sc.nextLine();
			System.out.println("Enter the last name: ");
			lastname = sc.nextLine();
			this.firstname = firstname;
			this.lastname = lastname;
			
	        
	        
	        this.department = setDepartment();
	        
	        System.out.println("\n:::::::Details:::::::\n"); 
	        
	        System.out.println(this.firstname + " "+this.lastname);
	        System.out.println("Department is: " + this.department);
        
	        
	         
	        
	        this.email = setEmail();
	        System.out.println("Email address: " + this.email);
	        
	        this.password = randomPassword(defaultPasswordlength);
	        System.out.println("YOu password: " + this.password);
        
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
         
        public String randomPassword (int length) {
        	
        	String passwordSet ="ABCDEFGHIJKLMNOUPQRSTUVXYZ123456789!§$%67890ß´+";
        	char [] password = new char [length];
        	
        	for (int i=1; i<length; i++) {
        		
        		int rand = (int) (Math.random()*passwordSet.length());
        		password [i] = passwordSet.charAt(rand);
        		
        	}
        	return new String (password);
        }
        
		//Ask for department
		
		//Generate the random password
		
		//Generate a random password
		
		
		//set the mailbox capacity
		
		// change the password
		
		
}
