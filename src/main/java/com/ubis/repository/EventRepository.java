package com.ubis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ubis.entity.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
