package com.learning.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.learning.mappers.AddressMapper;
import com.learning.mappers.EmployeeMapper;
import com.learning.mappers.GradeMapper;
import com.learning.mappers.StudentMapper;
import com.learning.model.Student;
import com.learning.util.SqlSessionFactoryUtil;

public class StudentJTest {

	private static Logger logger = Logger.getLogger(StudentTest.class);
	SqlSession sqlSession = null;
	StudentMapper studentMapper = null;
	AddressMapper addressMapper = null;
	EmployeeMapper employeeMapper = null;
	GradeMapper gradeMapper = null;
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
		addressMapper = sqlSession.getMapper(AddressMapper.class);
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		gradeMapper = sqlSession.getMapper(GradeMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	public void testAdd() {
		Student student = new Student("Lili", 24);
		int result = studentMapper.add(student);
		sqlSession.commit();
		if(result > 0){
			logger.info("添加成功！");
			System.out.println(student);
		}	
	}
	
	public void testUpdate() {
		Student student = new Student(1, "Mike", 23);
		int result = studentMapper.update(student);
		sqlSession.commit();
		if(result > 0){
			logger.info("修改成功！");
			System.out.println(student);
		}
	}

	@Test
	public void testDelete() {
		int result = studentMapper.delete(4);
		sqlSession.commit();
		if(result > 0){
			logger.info("删除成功！");
		}else {
			logger.info("删除失败！");
		}
	}
	
	public void testFindById() {
		logger.info(studentMapper.findById(1));
	}

	public void testFindAll() {
		for(Student student: studentMapper.findAll()){
			logger.info(student);
		}
	}
	
	public void testFindByIdWithAddress(){
		logger.info(studentMapper.findByIdWithAddress(1));
	}
	
	public void testFindByIdAdd() {
		logger.info(addressMapper.findById(2));
	}
	
	public void testEmpFindById() {
		logger.info(employeeMapper.findById(4));
	}
	
	public void testfindByIdWithGrade() {
		logger.info(studentMapper.findByIdWithGrade(1));
	}
	
	public void testGrade() {
		logger.info(gradeMapper.findById(2));
	}
	
	public void testGradeWithStudent() {
		logger.info(gradeMapper.findByIdWithStudents(1));
	}
}
