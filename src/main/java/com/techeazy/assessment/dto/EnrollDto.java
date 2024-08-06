package com.techeazy.assessment.dto;

import jakarta.validation.constraints.NotNull;

public class EnrollDto {
	
	@NotNull(message = "Student Id can not be null")
	private Integer studentId;
	
	@NotNull(message = "Subject Id can not be null")
	private Integer subjectId;
	

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "EnrollDto [studentId=" + studentId + ", subjectId=" + subjectId + "]";
	}

	
	
	

}
