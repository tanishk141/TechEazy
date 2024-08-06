package com.techeazy.assessment.dto;

import jakarta.validation.constraints.NotNull;

public class SubjectDto {
	
	@NotNull(message = "please provide a valid name, it can't be null")
	private String subjectName ;

	@NotNull(message = "please provide a valid code, it can't be null")
	private String subjectCode;
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	@Override
	public String toString() {
		return "SubjectDto [subjectName=" + subjectName + ", subjectCode=" + subjectCode + "]";
	}

}
