package com.hibernate.example.JPAHibernateRelationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.example.JPAHibernateRelationship.DAO.EmployeeRepository;
import com.hibernate.example.JPAHibernateRelationship.DAO.StudentDao;
import com.hibernate.example.JPAHibernateRelationship.pojo.inheritance.Employee;
import com.hibernate.example.JPAHibernateRelationship.pojo.inheritance.FullTimeEmployee;
import com.hibernate.example.JPAHibernateRelationship.pojo.inheritance.PartTimeEmployee;

@SpringBootApplication
public class JpaHibernateRelationshipApplication implements CommandLineRunner{

	@Autowired
	StudentDao dao;
	@Autowired
	EmployeeRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//dao.fetch();
		//dao.saveStudentWithPassport();
		FullTimeEmployee f= new FullTimeEmployee("Jack", 10000l);
		repo.insert(f);
		
		PartTimeEmployee p= new PartTimeEmployee("Jill", 100l);
		repo.insert(p);
	}

}
