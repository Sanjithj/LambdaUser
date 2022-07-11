package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static boolean firstNameValidation(String name) throws CustomException{
		String firstNameRegex="^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern=Pattern.compile(firstNameRegex);
		Matcher matcher=pattern.matcher(name);
		if(matcher.find()==false) {
			throw new CustomException ("please enter correct first name");
		}
		return matcher.find(); 
	}

public static boolean lastNameValidation(String name) throws  CustomException {
	String lastNameRegex="^[A-Z]{1}[a-z]{2,}$";
	Pattern pattern=Pattern.compile(lastNameRegex);
	Matcher matcher=pattern.matcher(name);
	if(matcher.find()==false) {
		throw new CustomException("please enter correct last name");
	}
	return matcher.find();
	
}

public static boolean emailValidation(String email) throws CustomException {
	String emailRegex="^[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?$";
	Pattern pattern=Pattern.compile(emailRegex);
	Matcher matcher=pattern.matcher(email);
	if(matcher.find()) {
		throw new CustomException("please enter correct email");
	}
	return matcher.find();
}

public static boolean mobileValidation(String mobile) throws CustomException{
	String mobileRegex="^(91|0)?[7-9]{1}+[0-9]{9}$";
	Pattern pattern=Pattern.compile(mobileRegex);
	Matcher matcher=pattern.matcher(mobile);
	if(matcher.find()==false) {
		throw new CustomException("please enter correct mobile number");
		
	}
	return matcher.find();
}

public static boolean passwordValidation(String password) throws CustomException {
	String passwordRegex="^([A-Za-z0-9]*[//!//@//#//$//%//^//&//*//(//)//_//-//+//=//{//}//[//]//?//>//.//<//,//]*){8}$";
	Pattern pattern=Pattern.compile(passwordRegex);
	Matcher matcher=pattern.matcher(password);
	if(matcher.find()==false) {
		throw new CustomException("please enter correct valid password");

	}
	return matcher.find();
}
}
