package com.avisysrest.avisysrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avisysrest.avisysrest.dao.CourseDAO;
import com.avisysrest.avisysrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
@Autowired
private CourseDAO courseDao;

	public CourseServiceImpl() {

		/*
		 * list = new ArrayList<>(); list.add(new Course(111, "java course",
		 * "this course for javadev")); list.add(new Course(112, "Python course",
		 * "this course for python dev")); list.add(new Course(113, "C++ course",
		 * "this course for C++ dev")); list.add(new Course(114, "Django course",
		 * "this course for django dev"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
 
//	@Override
//	public Course getCourse(long courseId) {
//		/*
//		 * Course c = null; for (Course course : list) { if (course.getId() == courseId)
//		 * { c = course; break; }
//		 *  
//		 * }
//		 */
//		return courseDao.getOne( courseId);
//	}

	
	@Override
	    public Course findYourEntityClassById(Long id) {
	      return courseDao.findById(id).get();
	    }
	
	@Override
	public Course addCourse(Course course) {
	
		courseDao.save(course);
		return course;
	}

	
	

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//			   e.setTitle(course.getTitle());
//			   e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
	
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	
		Course entity=courseDao.getOne(parseLong); 
	  courseDao.delete(entity);
	}

}
