package com.syntax.class26;

public class Task5 {

	/*
	 * create registration class in which you would have variables as email,
	 * username and password that have an access scope only within its own class
	 * After creating an object of the class user should be able to call methods and
	 * in each method seperatly pass vlaue to set users email username and password
	 * Requirments; Valid email consider to be only outlook Valid username and
	 * password cannot be empty and should be of the length larger than 6
	 * characters.Also valid password cannot contain username.
	 */

	private String userName;
	private String password;
	private String email;

	// getters

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	// setters

	public void setUsername(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("not valid");
		}
	}

	public void setEmail(String email) {
		if (email.endsWith("outlook")) {
			this.email = email;
		} else {
			System.out.println("not valid");
		}
	}

	public void setPassword(String password) {
		if (!password.isEmpty() && password.length() > 6) {
			this.password = password;

		} else {
			System.out.println("invalid password");
		}
	}
}
