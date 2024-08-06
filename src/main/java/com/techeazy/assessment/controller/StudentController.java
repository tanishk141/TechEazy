package com.techeazy.assessment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techeazy.assessment.dto.EnrollDto;
import com.techeazy.assessment.dto.Response;
import com.techeazy.assessment.dto.StudentDto;
import com.techeazy.assessment.service.IStudentService;
import com.techeazy.assessment.utility.Status;
import com.techeazy.assesssment.entity.Student;

import jakarta.validation.Valid;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private IStudentService iStudentService;
	
	@PostMapping("/createStudent")
	public ResponseEntity<Response> create(@Valid @RequestBody StudentDto studentDto){
		
		iStudentService.createStudent(studentDto);
		Response studentResponse = new Response();
		studentResponse.setStatus(Status.Success);
		studentResponse.setMessage("Student Created");
		return new ResponseEntity<Response>(studentResponse,HttpStatus.CREATED);
	}
	
	@PostMapping("/enroll")
	public ResponseEntity<Student> enrollToSubject(@Valid @RequestBody EnrollDto enrollDto){
		Student student = iStudentService.enrollToSubject(enrollDto);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students= iStudentService.getAllStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}	
	
}
