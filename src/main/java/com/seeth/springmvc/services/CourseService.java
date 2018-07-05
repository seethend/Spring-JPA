package com.seeth.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seeth.springmvc.models.Course;
import com.seeth.springmvc.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}

	public void insertCourse(Course course) {
		courseRepository.save(course);
	}

	public Course getCourseById(String courseId) {
		return courseRepository.findById(courseId).get();
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseById(String courseId) {
		courseRepository.deleteById(courseId);
	}

	
	

}
