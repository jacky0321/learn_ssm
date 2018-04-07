package com.learning.mappers;

import java.util.List;
import java.util.Map;

import com.learning.model.Student;

public interface StudentMapper {

	public int InsertStudent(Student student);
	public Student getStudent(int id);
	public Student getStudentWithParams(String name, int age);
	public List<Student> getPageStudent(Map<String, Integer> map);
}
