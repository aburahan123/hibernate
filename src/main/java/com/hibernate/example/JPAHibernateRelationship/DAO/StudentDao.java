package com.hibernate.example.JPAHibernateRelationship.DAO;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.example.JPAHibernateRelationship.pojo.Passport;
import com.hibernate.example.JPAHibernateRelationship.pojo.Student;

@Repository
public class StudentDao {

	@Autowired
	EntityManager em;
	
	@Transactional
	public void saveStudentWithPassport()
	{
		Passport passport =new Passport("20002");
		em.persist(passport);
		Student student =new Student("test3");
		student.setPassport(passport);
		em.persist(student);
		//em.flush();
	}
	
	@Transactional
	public void fetch()
	{
		Passport passport =em.find(Passport.class, 8L);
		
		Student st=passport.getStudent();
		st.setName("new name");
		em.flush();
		
		throw new RuntimeException();
		
	}
	
}
