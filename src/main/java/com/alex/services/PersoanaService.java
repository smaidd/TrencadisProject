package com.alex.services;

import com.alex.repositories.PersonRepository;
import comj.alex.model.Persoana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersoanaService {

    @Autowired
    PersonRepository personRepository;

    public Persoana gerPersoana(Object x){
        return personRepository.getOne(1);
    }


    public void savePerson(){}
}
