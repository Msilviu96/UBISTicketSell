package com.ubis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubis.entity.Event;
import com.ubis.service.EventService;
import com.ubis.service.TicketService;
import com.ubis.service.UserService;

@RestController
@RequestMapping("/ubis")
public class EventController {

	@Autowired
	TicketService ticketService;

	@Autowired
	EventService eventService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/list_events", method = RequestMethod.GET)
	public List<Event> listEvents() {
		return eventService.listAllEvents();
	}
}
