package org.sid.cinema.dao;

import org.sid.cinema.entities.Categorie;
import org.sid.cinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CategoryRepository extends JpaRepository<Categorie	, Long> {

}
