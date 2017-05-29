package com.ubis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ubis.entity.Account;
import com.ubis.entity.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
	@Query("SELECT max(t.id) FROM Ticket t")
	Integer getMaxId();
	
	@Query("SELECT t FROM Ticket t WHERE t.account = ?1")
	List<Ticket> findTicketsForUSer(Account user);
}
