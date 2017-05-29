package com.ubis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ubis.entity.Account;
import com.ubis.entity.Event;
import com.ubis.entity.Ticket;
import com.ubis.service.EventService;
import com.ubis.service.TicketService;
import com.ubis.service.UserService;

@RestController
@RequestMapping("/ubis")

public class TicketController {

	// /buy_ticket POST
	// /list_events GET
	// /ticket_details GET
	// /cancel_ticket POST

	@Autowired
	TicketService ticketService;

	@Autowired
	EventService eventService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/ticket_details", method = RequestMethod.GET)
	public Ticket getTicket(@RequestParam Integer id) {
		return ticketService.findTicketById(id);

	}

	@RequestMapping(value = "/buy_ticket", method = RequestMethod.POST)
	public ResponseEntity<Object> buyTicket(HttpServletRequest request) {
		Integer eventId = Integer.valueOf(request.getParameter("eventId"));

		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername(); // get logged in username

		Event eventById = eventService.getEventById(eventId);
		Account userByUsername = userService.getUserByUsername(name);

		if (userByUsername == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User does not exist");
		}

		if (eventById == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Event does not exist");
		}

		ticketService.saveTicket(eventById, userByUsername);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	@RequestMapping(value = "/cancel_ticket", method = RequestMethod.POST)
	public ResponseEntity<Object> cancelTicket(HttpServletRequest request) {
		Integer ticketId = Integer.valueOf(request.getParameter("ticketId"));
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername(); // get logged in username

		Ticket findTicketById = ticketService.findTicketById(ticketId);
		Account userByUsername = userService.getUserByUsername(username);

		if (userByUsername == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User does not exist");
		}

		if (findTicketById == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ticket does not exist");
		}
		ticketService.deleteTicket(findTicketById);

		return ResponseEntity.status(HttpStatus.OK).body(null);

	}

	@RequestMapping(value = "/get_user_tickets", method = RequestMethod.GET)
	public List<Ticket> getUserTickets() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername(); // get logged in username

		return ticketService.findTicketsForUser(userService.getUserByUsername(name));
	}

}
