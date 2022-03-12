package com.hibernate.example.JPAHibernateRelationship.pojo.inheritance;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee{
	
	long hourlySalary;

	public long getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(long hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public PartTimeEmployee(String name,long hourlySalary) {
		super(name);
		this.hourlySalary = hourlySalary;
	}

	public PartTimeEmployee() {
		
	}
	
	

}
