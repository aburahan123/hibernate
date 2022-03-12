package com.hibernate.example.JPAHibernateRelationship.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;


	@Column(nullable=false)
	String courseName;

	@OneToMany(mappedBy="course")
	List<Review> reviews =new ArrayList<Review>();
	
	@ManyToMany
	@JoinTable(name="student_course",
	joinColumns =@JoinColumn(name="student_id"),
	inverseJoinColumns = @JoinColumn(name="course_id"))
	List<Student> students =new ArrayList<Student>();
	
	public List<Student> getStudent() {
		return students;
	}

	public void setStudent(List<Student> students) {
		this.students = students;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review)
	{
		this.reviews.add(review);
	}
	public void deleteReview(Review review)
	{
		this.reviews.remove(review);
	}
	public Course() {
		
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}

}
