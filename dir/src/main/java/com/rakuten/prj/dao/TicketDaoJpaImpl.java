/**
 * 
 */
package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Tickets;

/**
 * @author athreya
 *
 */
@Repository
public class TicketDaoJpaImpl implements TicketDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void raiseTicket(Tickets t) {
		em.persist(t);
	}

	@Override
	public List<Tickets> showAllTickets() {
		String jpql = "from Tickets";
		TypedQuery<Tickets> query = em.createQuery(jpql, Tickets.class);
		return query.getResultList();
	}

	@Override
	public List<Tickets> showOpenTickets() {
		String jpql = "from Tickets where resolvedByEmployee is NULL";
		TypedQuery<Tickets> query = em.createQuery(jpql, Tickets.class);
		return query.getResultList();
	}

	@Override
	public Tickets getTicket(int ticketId) {
		return em.find(Tickets.class, ticketId);
	}

}
