package com.ubis.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.ubis.entity.Account;
import com.ubis.entity.Event;
import com.ubis.entity.Ticket;
import com.ubis.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> findAll() {
		Iterable<Ticket> findAll = ticketRepository.findAll();
		return Lists.newArrayList(findAll);
	}

	@Override
	public Ticket findTicketById(Integer id) {
		return ticketRepository.findOne(id);
	}

	@Override
	public void saveTicket(Event eventById, Account userByUsername) {
		Ticket ticket = new Ticket();
		ticket.setId(ticketRepository.getMaxId() + 1);
		ticket.setEvent(eventById);
		ticket.setAccount(userByUsername);
		ticket.setBuytime(new Date());
		ticketRepository.save(ticket);

	}

	@Override
	public List<Ticket> findTicketsForUser(Account user) {
		return ticketRepository.findTicketsForUSer(user);
	}

	@Override
	public void deleteTicket(Ticket findTicketById) {
		ticketRepository.delete(findTicketById);
	}

}
