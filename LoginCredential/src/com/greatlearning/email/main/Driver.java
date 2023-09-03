package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.IEmailService;
import com.greatlearning.email.service.EmailService;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmailService service = new EmailService();
		
		System.out.println("Enter first name of the Employee:");
		String fname = sc.nextLine();
		
		System.out.println("Enter first name of the Employee:");
		String lname = sc.nextLine();
		
		Employee employee = new Employee(fname, lname);
		
		System.out.println("Please select the Department of the employee");
		
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
		
		case 1: employee.setDept("tech");
				break;
		
		case 2: employee.setDept("admin");
				break;
		
		case 3: employee.setDept("hr");
				break;
		
		case 4: employee.setDept("lg");
				break;
		default: System.out.println("Please select valid option");
				break;
		
		}
		
		if(employee.getFirstName()!=null && employee.getLastName()!=null && employee.getDept()!=null) {
			
			service.generateEmail(employee);
			service.generatePassword(employee);
			service.showCredentails(employee);
		}
		
	}
	
}
