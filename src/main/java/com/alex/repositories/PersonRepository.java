package com.alex.repositories;

import comj.alex.model.Persoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persoana, Integer> {

    public Persoana findFirstByCnpAndNumeBetween(String cnp, String...nume);
}
