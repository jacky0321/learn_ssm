package com.learning.mappers;

import java.util.List;

import com.learning.model.Grade;
import com.learning.model.Student;

public interface GradeMapper {
	
	public Grade findById(int id);
	
	public List<Student> findByIdWithStudents(int id);
}
