package com.studio.service;

import java.util.List;

import com.studio.entity.CourseEntity;


public interface CourseService {
	
	public CourseEntity addCourse(CourseEntity customer);
	
	public List<CourseEntity> getAllcourses();
	
	public void deleteCourse(int customerId);

}
