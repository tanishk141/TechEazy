package com.techeazy.assessment.dto;

import jakarta.validation.constraints.NotNull;

public class StudentDto {

	@NotNull(message = "please provide a valid name, it can't be null")
	private String studentName;
	
	@NotNull(message = "please provide a valid address, it can't be null")
	private String studentAddress ;

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentDto [studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
}
