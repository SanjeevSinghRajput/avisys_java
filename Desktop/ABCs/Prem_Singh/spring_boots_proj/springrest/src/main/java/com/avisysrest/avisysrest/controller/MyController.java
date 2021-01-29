package com.avisysrest.avisysrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avisysrest.avisysrest.entity.Course;
import com.avisysrest.avisysrest.service.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService service;

	// Rest api method for retrieve all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {

		return this.service.getCourses();

	}

	// Rest api method for retrieve course id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.service.findYourEntityClassById(Long.parseLong(courseId));

	}

	// Rest api method for add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);

	}

	// Rest api method for update the course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.service.updateCourse(course);

	}

	// Resftul api methods for delete data
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.service.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
