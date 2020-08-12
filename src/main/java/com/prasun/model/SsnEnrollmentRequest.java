package com.prasun.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
public class SsnEnrollmentRequest {

	
	
	private String fname;
	
	private String lname;
	
	private String gender;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dob;
	
	private String stateName;
	
}
