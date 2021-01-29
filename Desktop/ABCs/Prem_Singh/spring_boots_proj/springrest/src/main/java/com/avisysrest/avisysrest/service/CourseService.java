package com.avisysrest.avisysrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.avisysrest.avisysrest.entity.Course;

@Service
public interface CourseService {

	public List<Course> getCourses();
   
	//public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);

	public  Course findYourEntityClassById(Long id);

	
	
}
