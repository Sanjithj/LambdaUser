package com.bridgelabz;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) throws CustomException {

        System.out.println("Welcome to the Exception problem");
        User v = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String first_name = sc.next();
        User.firstNameValidation(first_name);
        
        System.out.println("Please enter last name  : ");
        String last_name = sc.next();
        User.lastNameValidation(last_name);
        System.out.println("Please enter email: ");
        String email = sc.next();
        User.emailValidation(email);
        System.out.println("Please enter mobile number: ");
        String number = sc.next();
        User.mobileValidation(number);
        System.out.println("Please enter password: ");
        String password = sc.next();
        User.passwordValidation(password);
       System.out.println(" all test done finally");
       

}

	
}
