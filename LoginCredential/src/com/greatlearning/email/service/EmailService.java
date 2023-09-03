package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class EmailService implements IEmailService{

	private String upper = "ABACEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String number = "1234567890";
	private String specialChar = "!@#$%^&*()_~<>:,.;?/{}[]|";
	private String passwordChars = upper + lower + number + specialChar;
	private Random random = new Random();
	
	@Override
	public void generateEmail(Employee employee) {
		
		String emailAddress = employee.getFirstName() + employee.getLastName() + "@"
						+ employee.getDept() + "gl.in";
		employee.setEmail(emailAddress);
		
	}

	@Override
	public void generatePassword(Employee employee) {
		
		String password = "";
		for(int i=0; i<8; i++) {
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		
		employee.setPassword(password);
	}

	@Override
	public void showCredentails(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName() +"Your Credentails are:");
		System.out.println("Email Address is: " + employee.getEmail());
		System.out.println("Password is: " + employee.getPassword());
	}

}
