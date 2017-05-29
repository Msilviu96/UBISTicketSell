package com.ubis.service;

import java.util.List;

import com.ubis.entity.Account;
import com.ubis.entity.Event;
import com.ubis.entity.Ticket;

public interface TicketService {

	public List<Ticket> findAll();

	public Ticket findTicketById(Integer id);
	
	public void saveTicket(Event eventById, Account userByUsername);

	public List<Ticket> findTicketsForUser(Account account);

	public void deleteTicket(Ticket findTicketById);

}
