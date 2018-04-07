package com.learning.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.learning.mappers.StudentMapper;
import com.learning.model.Student;
import com.learning.util.SqlSessionFactoryUtil;

public class StudentTest {

	private static Logger logger = Logger.getLogger(StudentTest.class);
	SqlSession sqlSession = null;
	StudentMapper studentMapper = null;
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	
	public void testSearchStudent() {
		logger.info("模糊查询学生！(if条件)");
		Map<String, Object> map = new HashMap<>();
		map.put("age", 24);
		map.put("name", "%j%");
		map.put("grade_id", 1);
		List<Student> students = studentMapper.searchStudents(map);
		for(Student s: students) {
			System.out.println(s);
		}
	}
	

	public void testSearchStudent2() {
		logger.info("模糊查询学生(choose条件)！");
		Map<String, Object> map = new HashMap<>();
		map.put("searchBy", "age");
		map.put("age", 24);
		map.put("name", "%j%");
		map.put("grade_id", 1);
		List<Student> students = studentMapper.searchStudents2(map);
		for(Student s: students) {
			System.out.println(s);
		}
	}
	
	public void testSearchStudent3() {
		logger.info("模糊查询学生(where条件)！");
		Map<String, Object> map = new HashMap<>();
		map.put("age", 24);
		map.put("name", "%j%");
		map.put("grade_id", 1);
		List<Student> students = studentMapper.searchStudents3(map);
		for(Student s: students) {
			System.out.println(s);
		}
	}
	
	public void testSearchStudent4() {
		logger.info("模糊查询学生(trim条件)！");
		Map<String, Object> map = new HashMap<>();
		map.put("age", 24);
//		map.put("name", "%j%");
		map.put("grade_id", 1);
		List<Student> students = studentMapper.searchStudents4(map);
		for(Student s: students) {
			System.out.println(s);
		}
	}
	
	public void testSearchStudent5() {
		logger.info("模糊查询学生(foreach条件)！");
		Map<String, Object> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < 3; i++) {
			list.add(i);
		}

		map.put("age", 24);
		map.put("name", "%j%");
		map.put("grade_ids", list);
		List<Student> students = studentMapper.searchStudents5(map);
		for(Student s: students) {
			System.out.println(s);
		}
	}
	
	@Test
	public void updateStudent() {
		logger.info("修改学生部分信息!");
		Student student = new Student();
		student.setId(1);
		student.setAge(30);
//		student.setName("Candy");
		studentMapper.updateStudent(student);
		sqlSession.commit();
	}
}
