package com.pack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void insertStudent(Student st) {
		sessionFactory.getCurrentSession().save(st);
           
		
	}


	@Override
	public List<Student> fetchAllStudent() {
		Query query=sessionFactory.getCurrentSession().createQuery("select s from Student s");
        List stlist=query.list();
        
		return stlist;
	}


	@Override
	public void deleteStudent(Integer stid) {
         Student st=(Student)sessionFactory.getCurrentSession().get(Student.class, stid);
         sessionFactory.getCurrentSession().delete(st);
	}
	@Override
	public Student fetchStudentById(Integer stid) {
		Student s=(Student)sessionFactory.getCurrentSession().get(Student.class, stid);
		return s;
	}


	@Override
	public void updateStudent(Student stid) {
		sessionFactory.getCurrentSession().update(stid);
		
	}


	

}
