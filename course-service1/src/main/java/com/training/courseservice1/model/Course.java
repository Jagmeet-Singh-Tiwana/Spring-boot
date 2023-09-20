package com.training.courseservice1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseID;
	private String courseName;
	private int credit;
	
	public Course(String courseName, int credit) {
		super();
		this.courseName = courseName;
		this.credit = credit;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public long getCourseID() {
		return courseID;
	}
	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}
//	public Course(String courseName) {
//		super();
//		this.courseName = courseName;
//	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
  
}
