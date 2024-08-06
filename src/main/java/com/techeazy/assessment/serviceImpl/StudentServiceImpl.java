package com.techeazy.assessment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techeazy.assessment.dto.EnrollDto;
import com.techeazy.assessment.dto.StudentDto;
import com.techeazy.assessment.dto.SubjectDto;
import com.techeazy.assessment.repository.StudentRepository;
import com.techeazy.assessment.repository.SubjectRepository;
import com.techeazy.assessment.service.IStudentService;
import com.techeazy.assesssment.entity.Student;
import com.techeazy.assesssment.entity.Subject;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public void createStudent(StudentDto studentDto) {
		Student student = new Student();
		student.setStudentName(studentDto.getStudentName());
		student.setStudentAddress(studentDto.getStudentAddress());
		
		studentRepository.save(student);
		
	}
	
	public Student enrollToSubject(EnrollDto enrollDto){
		Optional<Student> studentById = studentRepository.findById(enrollDto.getStudentId());
		Optional<Subject> subjectById = subjectRepository.findById(enrollDto.getSubjectId());
		
		if(studentById.isPresent() && subjectById.isPresent()) {
			Student student = studentById.get();
			 Subject subject = subjectById.get();
			 
			 student.getSubjects().add(subject);
			 Student studentDB = studentRepository.save(student);
			 
			 return studentDB;
		}
		
	return null;	
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
	
	public void createSubject(SubjectDto subjectDto) {
	
		Subject subject = new Subject();
		subject.setSubjectName(subjectDto.getSubjectName());
		subject.setSubjectCode(subjectDto.getSubjectCode());
		subjectRepository.save(subject);
	}
	
	
	public List<Subject> getAllSubjects(){
		return subjectRepository.findAll();
	}

}
