package com.robick.sem8.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.robick.sem8.project.model.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

}
