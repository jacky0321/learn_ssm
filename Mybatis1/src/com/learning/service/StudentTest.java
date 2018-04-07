package com.learning.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.learning.mappers.StudentMapper;
import com.learning.model.Student;
import com.learning.util.SqlSessionFactoryUtil;

public class StudentTest {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	
	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("Jacky", 24);
		int result = studentMapper.add(student);
		sqlSession.commit();
		if(result > 0){
			logger.info("Ìí¼Ó³É¹¦£¡");
			System.out.println(student);
		}
	}
}
