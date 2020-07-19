package org.sid.cinema;

import org.sid.cinema.entities.Film;
import org.sid.cinema.entities.Salle;
import org.sid.cinema.entities.Ticket;
import org.sid.cinema.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CinemaBackendApplication implements CommandLineRunner {
    @Autowired
	private ICinemaInitService cinemaInitService;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CinemaBackendApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		restConfiguration.exposeIdsFor(Film.class);
		restConfiguration.exposeIdsFor(Salle.class);
		restConfiguration.exposeIdsFor(Ticket.class);
	    
	}

}
