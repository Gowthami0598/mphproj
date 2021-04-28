package com.mph.Exception;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {

	}

	@Override
	public String toString() {
		return "UserNotFound.. please check the credential";
	}

	public void UserNotFoundException() {
		System.out.println("From User not found exception");
	}

}