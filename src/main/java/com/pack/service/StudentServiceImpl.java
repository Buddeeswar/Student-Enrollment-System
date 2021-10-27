package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.StudentDao;
import com.pack.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	@Override
	public void insertStudent(Student st) {
       studentDao.insertStudent(st);		
	}
	@Override
	public List<Student> fetchAllStudent() {
     List<Student> stList=studentDao.fetchAllStudent();
		return stList;
	}
	@Override
	public void deleteStudent(Integer stid) {
     studentDao.deleteStudent(stid);		
	}
	@Override
	public Student fetchStudentById(Integer stid) {
		Student st=studentDao.fetchStudentById(stid);
		return st;
		
	}
	@Override
	public void updateStudent(Student stid) {
		studentDao.updateStudent(stid);
		
	}

}
