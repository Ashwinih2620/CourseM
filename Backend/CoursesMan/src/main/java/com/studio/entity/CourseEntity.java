package com.studio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
	private int courseId; //Make attribute Primary Key
	
	@Column(nullable = false,length=20)
	private String courseName;
	
	@Column(nullable = false,length=100)
	private String description;
	
	@Column(nullable = false)
	private int price;
	


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseEntity(int courseId, String courseName, String description, int price, boolean subscription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.price = price;

	}

	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	

	
}
