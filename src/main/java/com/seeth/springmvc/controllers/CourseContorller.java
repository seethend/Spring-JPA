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
@RequestMapping(value="/topics/{topicId}")
public class CourseContorller {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value="/inscourse",method=RequestMethod.GET)
	public String getInsertCourse(ModelMap model){
		return "inscourse";
	}
	
	@RequestMapping(value="/inscourse",method=RequestMethod.POST)
	public String postInsertCourse(ModelMap model, @PathVariable String topicId, @ModelAttribute Course course){
		course.setTopic(new Topic(topicId,""));
		courseService.insertCourse(course);
		model.addAttribute("success", "Inserted: "+course);
		return "inscourse";
	}
	
	@RequestMapping(value="/updcourse/{courseId}",method=RequestMethod.GET)
	public String getUpdateCourse(ModelMap model,@PathVariable String courseId){
		model.addAttribute("id", courseId);
		return "updcourse";
	}
	
	@RequestMapping(value="/updcourse/{courseId}",method=RequestMethod.POST)
	public String postUpdateCourse(ModelMap model, @PathVariable String topicId, @ModelAttribute Course course, @PathVariable String courseId){
		course.setTopic(new Topic(topicId,""));
		System.out.println(course);
		courseService.updateCourse(course);
		model.addAttribute("success", "Updated: "+course);
		return "updcourse";
	}
	
	@RequestMapping(value="/delcourse/{courseId}")
	public String deleteCourseById(ModelMap model, @PathVariable String courseId, @PathVariable String topicId){
		courseService.deleteCourseById(courseId);
		model.addAttribute("success", "deleted Course with id: "+courseId);
		return "delcourse";
	}
	

}
