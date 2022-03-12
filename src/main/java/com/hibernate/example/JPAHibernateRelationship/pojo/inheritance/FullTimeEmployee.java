package com.hibernate.example.JPAHibernateRelationship.pojo.inheritance;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee{
	
	long salary;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public FullTimeEmployee(String name,long salary) {
		super(name);
		this.salary = salary;
	}

	public FullTimeEmployee() {
		
	}
	
	

}
