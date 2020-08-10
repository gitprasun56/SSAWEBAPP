package com.prasun.model;

import java.util.Date;

import lombok.Data;


@Data
public class SsnEnrollmentRequest {

	
	
	private String fname;
	
	private String lname;
	
	private String gender;
	
	private Date dob;
	
	private String stateName;
	
}
