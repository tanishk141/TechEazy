package com.techeazy.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techeazy.assessment.dto.StudentDto;
import com.techeazy.assesssment.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	void save(StudentDto student);

}
