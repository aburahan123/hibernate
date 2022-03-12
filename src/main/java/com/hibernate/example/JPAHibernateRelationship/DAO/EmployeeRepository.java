package com.hibernate.example.JPAHibernateRelationship.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.example.JPAHibernateRelationship.pojo.inheritance.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	EntityManager em;
	
	
	public void insert(Employee e)
	{
		em.persist(e);
	}
	
	public List<Employee> retrieveAllEmployee()
	{
		return em.createQuery("select e from employee e",Employee.class).getResultList();
	}
}
