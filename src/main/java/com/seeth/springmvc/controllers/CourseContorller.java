package com.seeth.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seeth.springmvc.models.Course;
import com.seeth.springmvc.models.Topic;
import com.seeth.springmvc.services.CourseService;

@Controller
public class CourseContorller {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value="/topics/{topicId}/inscourse",method=RequestMethod.GET)
	public String getInsertCourse(ModelMap model){
		return "inscourse";
	}
	
	@RequestMapping(value="/topics/{topicId}/inscourse",method=RequestMethod.POST)
	public String postInsertCourse(ModelMap model, @PathVariable String topicId, @ModelAttribute Course course){
		course.setTopic(new Topic(topicId,""));
		courseService.insertCourse(course);
		return "inscourse";
	}
	
	

}
