package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	public static void firstNameValidation(String name) {
		String firstNameRegex="^[A-Z]{1}[a-z]{2}$";
		Pattern pattern=Pattern.compile(firstNameRegex);
		Matcher matcher=pattern.matcher(name);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("its not valid");
		}
		
	}
public static void lastNameValidation(String name) {
	String lastNameRegex="^[A-Z]{1}[a-z]{2}$";
	Pattern pattern=Pattern.compile(lastNameRegex);
	Matcher matcher=pattern.matcher(name);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("its not valid");
	}

		
	}
public static void main(String[] args) {
	System.out.println("Welcome to user registration");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name");
	String firstName = sc.next();
	User.firstNameValidation(firstName);
	System.out.println("Enter the last name");
	String lastName = sc.next();
    User.lastNameValidation(lastName);
    sc.close();
}
}
