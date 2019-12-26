package emailapp;

import java.util.Scanner;

public class Email {
	
	// as i dont want people to access these data memebers, i follow the encapsulation and make them private
	
		private String firstname;
		private String lastname;
		private String password;
		private String department;
		private int mailboxCapacity = 500;
		private String email;
		private String alternateEmail;
		private int defaultPasswordlength = 12;
		static boolean blank;
		
		
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
	        System.out.println("Department : " + this.department);
        
	        
	         
	        
	        this.email = setEmail();
	        System.out.println("Email address: " + this.email);
	        
	        this.setPassword(randomPassword(defaultPasswordlength));
	        System.out.println("YOu password: " + this.getPassword());
        
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
        
        
      //Generate the random password
        public String randomPassword (int length) {
        	
        	String passwordSet ="ABCDEFGHIJKLMNOUPQRSTUVXYZ123456789!§$%67890ß´+";
        	char [] password = new char [length];
        	
        	for (int i=1; i<length; i++) {
        		
        		int rand = (int) (Math.random()*passwordSet.length());
        		password [i] = passwordSet.charAt(rand);
        		
        	}
        	return new String (password);
        }
		//set the mailbox capacity
        
        public void setMailBoxcapacity (int mailbox_cap) {
		this.mailboxCapacity = mailbox_cap;
        }
        
     // change the password
        public void setPassword (String pass) {
        	this.password = pass;
        	blank = true;
        }

		public String getPassword() {
			return password;
		}
		//Get method /show info to display the information about the user entry
		
		public String showInfo() {
			return "Full Name : " + firstname + " " + lastname +"\n" + 
			"Email: " + email		;
			
			
		}
		
		
}
