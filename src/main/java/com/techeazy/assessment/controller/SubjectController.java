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

import com.techeazy.assessment.dto.Response;
import com.techeazy.assessment.dto.SubjectDto;
import com.techeazy.assessment.service.IStudentService;
import com.techeazy.assessment.utility.Status;
import com.techeazy.assesssment.entity.Subject;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private IStudentService iStudentService;

	@PostMapping("/createSubject")
	public ResponseEntity<Response> createSubject(@Valid @RequestBody SubjectDto subjectDto){
		iStudentService.createSubject(subjectDto);
		return new ResponseEntity<Response>(new Response(Status.Success,"Subject Created"),HttpStatus.CREATED);
	}	
		
	@GetMapping("/getAllSubjects")
	public ResponseEntity<List<Subject>> getAllSubjects(){
		List<Subject> allSubjects = iStudentService.getAllSubjects();
		return new ResponseEntity<List<Subject>>(allSubjects,HttpStatus.OK);
	}
}
