/**
 * 
 */
package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.service.TicketsService;

/**
 * @author athreya
 *
 */
public class ResolveTicketClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketsService.class);
		ctx.register(EmployeeDaoJpaImpl.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		TicketsService ts = ctx.getBean("ticketsService", TicketsService.class);

		System.out.println("ALL TICKETS \n");

		System.out.println(ts.getTickets());

		System.out.println("\n\n OPEN TICKETS \n");

		System.out.println(ts.getOpenTickets());

		ts.resolveTicket(3, 102, "Replaced Trackpad");

		System.out.println("\n\n TICKET RESOLVED!!");

		System.out.println("\n\n OPEN TICKETS \n");

		System.out.println(ts.getOpenTickets());

	}

}
