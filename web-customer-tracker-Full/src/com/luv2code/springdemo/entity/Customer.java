package com.luv2code.springdemo.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.luv2code.springdemo.mvc.validation.CourseCode;



@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	
	private int id;

	@NotNull(message="* Pflichtfeld Mindestens 1 Zeichen")
	@Size(min=1, message="* Pflicht Mindestens 1 Zeichen")
	@Column(name="first_name")
	private String firstName;
	
	
	@NotNull(message="* Pflichtfeld Mindestens 1 Zeichen")
	@Size(min=1, message="* Pflicht Mindestens 1 Zeichen")
	@Column(name="last_name")
	private String lastName;
	
	
	@NotNull(message="* Pflichtfeld richtige email-Adresse?")
	@Size(min=1, message="* Pflicht richtige email-Adresse?")
	@Pattern(regexp="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$", message="* richtige Email-Adresse?")
	@Column(name="email")
	private String email;
	
	@NotNull(message="* Pflichtfeld Datum des Eintrittes?")
	@Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\.](0?[1-9]|1[012])[\\/\\.]\\d{4}$", message="* not valid date")
	@Column(name="entry")
	String entry;
	
	
	
	@Pattern(regexp="^\\d*\\.\\d+|\\d+\\.\\d*$", message="Not decimal")
	@DecimalMin(value = "50.00", message="Min 50.00")
	@DecimalMax(value = "100.00", message="Max 100.00")
	@Column(name="minimum")
	private String minimum;
	
	
	
	/*
	 * @DateTimeFormat(pattern="dd.mm.yyy")
	 * private Date birthday;
	 * 
	 * */

	//@Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", message="* not valid date")
	@Column(name="birthday")
	private Date birthday;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only  5 chars/digits")
	@Column(name="postalcode")
	private String postalCode;
	
	@CourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
	@Column(name="coursecode")
	private String courseCode;
	
	
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", entry=" + entry + ", minimum=" + minimum + ", birthday=" + birthday + "]";
	}

	

	
		
}





