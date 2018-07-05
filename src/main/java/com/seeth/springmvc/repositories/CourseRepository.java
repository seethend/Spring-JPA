package com.seeth.springmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seeth.springmvc.models.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);

}
