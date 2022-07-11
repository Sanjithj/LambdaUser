package com.bridgelabz;

public class IFunction {
	
		@FunctionalInterface
		public interface ValidateFirstName {
		    public boolean validateFirstName(String firstName) throws CustomException;
		}
		@FunctionalInterface
		public interface ValidateLastName {
		    public boolean LastName(String lastName) throws CustomException;
		}
		@FunctionalInterface
		public interface ValidationEmail {
		    public boolean Email(String email) throws CustomException;
		}
		@FunctionalInterface
		public interface ValidatePhoneNumber {
		    public boolean PhoneNumber(String phoneNumber) throws CustomException;
		}
		@FunctionalInterface
		public interface ValidatePassword {
		    public boolean Password(String password) throws CustomException;
		}
	}


