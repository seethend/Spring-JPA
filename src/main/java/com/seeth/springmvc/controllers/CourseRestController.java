package com.seeth.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seeth.springmvc.models.Course;
import com.seeth.springmvc.services.CourseService;

@RestController
@RequestMapping(value="/topics/{topicId}")
public class CourseRestController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value="/courses")
	public List<Course> showAllCourses(@PathVariable String topicId){
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping(value="/course/{courseId}")
	public Course getCourseById(@PathVariable String courseId){
		return courseService.getCourseById(courseId);
	}
	
}
