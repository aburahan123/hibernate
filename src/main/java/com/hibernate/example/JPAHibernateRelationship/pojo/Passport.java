package com.hibernate.example.JPAHibernateRelationship.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	
	@Column(nullable=false)
	String passportNumber;

	@OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Passport() {
		
	}

	public Passport( String passportNumber) {
		this.passportNumber = passportNumber;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getPassportNumber() {
		return passportNumber;
	}




	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}




	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + "]";
	}

	
	
	
	
}
