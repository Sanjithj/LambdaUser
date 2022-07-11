package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	public static void nameValidation(String name) {
		String nameregex="^[A-Z]{1}[a-z]{2}$";
		Pattern pattern=Pattern.compile(nameregex);
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
	User.nameValidation(firstName);


}
}
