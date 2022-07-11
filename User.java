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
public static void emailValidation(String email) {
	String emailRegex="^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
	Pattern pattern=Pattern.compile(emailRegex);
	Matcher matcher=pattern.matcher(email);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("not valid");
	}
}
public static void mobileValidation(String mobile) {
	String mobileRegex="^(91|0)?[7-9]{1}+[0-9]{9}$";
	Pattern pattern=Pattern.compile(mobileRegex);
	Matcher matcher=pattern.matcher(mobile);
	if(matcher.find()) {
		System.out.println("its valid ");
	}
	else {
		System.out.println("not valid");
	}
}
public static void passwordValidationRule1(String password) {
	String passwordRegex="^([A-Za-z0-9]*[//!//@//#//$//%//^//&//*//(//)//_//-//+//=//{//}//[//]//?//>//.//<//,//]*){8}$";
	Pattern pattern=Pattern.compile(passwordRegex);
	Matcher matcher=pattern.matcher(password);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("not valid");
	}
}
public static void passwordValidationRule2(String password) {
	String regexPassword="[A-Za-z0-9]{8}$";
	Pattern pattern=Pattern.compile(regexPassword);
	Matcher matcher=pattern.matcher(password);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("not valid");
	}
}
public static void passwordValidationRule3(String password) {
	String regexPassword="^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
	Pattern pattern=Pattern.compile(regexPassword);
	Matcher matcher=pattern.matcher(password);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("not valid");
	}
}
public static void passwordValidationRule4(String password) {
	String regexPassword="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
	Pattern pattern=Pattern.compile(regexPassword);
	Matcher matcher=pattern.matcher(password);
	if(matcher.find()) {
		System.out.println("its valid");
	}
	else {
		System.out.println("not valid");
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
    System.out.println("Enter your email");
	String email = sc.next();
    User.emailValidation(email);
    System.out.println("Enter your mobile number");
	String mobile = sc.next();
    User.mobileValidation(mobile);  
    System.out.println("Enter your password number");
	String password = sc.next();
    User.passwordValidationRule1(password);
    System.out.println("Enter your password number");
	String password2 = sc.next();
    User.passwordValidationRule2(password2);
    System.out.println("Enter your password number");
  	String password3 = sc.next();
    User.passwordValidationRule3(password3);	
    System.out.println("Enter your password number");
	String password4 = sc.next();
    User.passwordValidationRule4(password4);
    sc.close();
}
}
