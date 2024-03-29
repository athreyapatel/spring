/**
 * 
 */
package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Tickets;

/**
 * @author athreya
 *
 */
public interface TicketDao {
	void raiseTicket(Tickets t);
	List<Tickets> showOpenTickets();
	List<Tickets> showAllTickets();
	Tickets getTicket(int ticketId);
}
