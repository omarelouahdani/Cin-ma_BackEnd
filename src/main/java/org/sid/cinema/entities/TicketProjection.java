package org.sid.cinema.entities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ticketProj",types = Ticket.class)
public interface TicketProjection {
	
	public Long getId();
	public String getNomClient();
	
	public double getPrixAchat();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
}
