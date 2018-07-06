package com.seeth.springmvc.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	private String id;
	private String name;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
	}

	public Course(String id, String name, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", topic=" + topic + "]";
	}
	
	
}
