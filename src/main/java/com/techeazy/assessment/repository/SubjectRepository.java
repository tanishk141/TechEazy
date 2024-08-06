package com.techeazy.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techeazy.assesssment.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
