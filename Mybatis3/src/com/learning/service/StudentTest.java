package com.learning.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
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

	public void testInsertStudent() {
		logger.info("测试CLOB、BLOB插入");
		byte[] content = null;
		try {
			File file = new File("C://Users//Administrator//Desktop//123.JPG");
			InputStream inputStream = new FileInputStream(file);
			content = new byte[inputStream.available()];
			inputStream.read(content);
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Student student = new Student("Mike", 23, content, "很长的文本！！！");
		studentMapper.InsertStudent(student);
		sqlSession.commit();
	}
	
	public void testGetStudent() {
		logger.info("测试获取CLOB、BOLB数据！");
		Student student = studentMapper.getStudent(5);
		System.out.println(student);
		byte[] content = student.getImg();
		try {
			File file = new File("C://Users//Administrator//Desktop//456.JPG");
			OutputStream oStream = new FileOutputStream(file);
			
			oStream.write(content);
			oStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testGetStudentWithParam() {
		logger.info("测试param参数！");
		Student student = studentMapper.getStudentWithParams("%j%", 23);
		System.out.println(student);
	}
	
	@Test
	public void testGetPageStudent() {
		logger.info("测试分页！");
		Map<String, Integer> map = new HashMap<>();
		map.put("start", 0);
		map.put("offset", 5);
		List<Student> students = studentMapper.getPageStudent(map);
		for(Student std:students) {
			System.out.println(std);
		}
	}		
}
