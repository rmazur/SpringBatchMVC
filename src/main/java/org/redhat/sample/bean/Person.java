package org.redhat.sample.bean;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class Person implements Serializable {

	String firstname;

	String lastname;

	String gender;

	Date dob;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


}
