package com.ubis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.ubis.entity.Event;
import com.ubis.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;

	@Override
	public List<Event> listAllEvents() {
		return Lists.newArrayList(eventRepository.findAll());
	}

	@Override
	public Event getEventById(Integer id) {
		return eventRepository.findOne(id);
	}

}
