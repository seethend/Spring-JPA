package com.seeth.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.seeth.springmvc.models.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
