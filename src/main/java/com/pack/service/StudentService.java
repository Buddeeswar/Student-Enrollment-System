package com.pack.service;

import java.util.List;

import com.pack.model.Student;

public interface StudentService {
	public void insertStudent(Student st);

	public List<Student> fetchAllStudent();
	
	public void deleteStudent(Integer stid);
	
	public Student fetchStudentById(Integer stid);
	
	public void updateStudent(Student stid);



}
