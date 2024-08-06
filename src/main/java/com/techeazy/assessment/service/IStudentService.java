package com.techeazy.assessment.service;

import java.util.List;
import java.util.Optional;

import com.techeazy.assessment.dto.EnrollDto;
import com.techeazy.assessment.dto.StudentDto;
import com.techeazy.assessment.dto.SubjectDto;
import com.techeazy.assesssment.entity.Student;
import com.techeazy.assesssment.entity.Subject;

public interface IStudentService {
	
	public void createStudent(StudentDto studentDto);
	public Student enrollToSubject(EnrollDto enrollDto);
	public List<Student> getAllStudents();
	public void createSubject(SubjectDto subjectDto);
	public List<Subject> getAllSubjects();

}
