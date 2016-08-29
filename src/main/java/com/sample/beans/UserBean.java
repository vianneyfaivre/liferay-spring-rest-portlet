package com.sample.beans;

import java.io.Serializable;

/**
 * Simple bean that contains information about a user 
 *
 * @author Vianney FAIVRE
 */
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String emailAddress;

	public UserBean(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "UserTestBean [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
