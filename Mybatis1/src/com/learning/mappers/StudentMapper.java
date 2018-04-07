package com.learning.mappers;

import java.util.List;

import com.learning.model.Student;

public interface StudentMapper {

	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student findById(int id);
	
	public List<Student> findAll();
	
	public Student findByIdWithAddress(int id);
	
	public Student findByIdWithGrade(int id);
	
	public Student findByGradeId(int id);
}
