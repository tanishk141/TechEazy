package com.techeazy.assessment.dto;

import com.techeazy.assessment.utility.Status;

public class Response {

	private Status status ;
	
	private String message ;
	
	public Response() {
		super();
	}

	public Response(Status status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "StudentResponse [status=" + status + ", message=" + message + "]";
	}

	

}
