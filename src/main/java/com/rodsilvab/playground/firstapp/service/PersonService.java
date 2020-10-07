package com.rodsilvab.playground.firstapp.service;

import com.rodsilvab.playground.firstapp.dao.PersonDao;
import com.rodsilvab.playground.firstapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return this.personDao.addPerson(person);
    }
}
