package com.ubis.service;

import java.util.List;

import com.ubis.entity.Event;


public interface EventService {
	public List<Event> listAllEvents();
	
	public Event getEventById(Integer id);
}
