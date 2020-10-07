package com.rodsilvab.playground.firstapp.api;

import com.rodsilvab.playground.firstapp.model.Person;
import com.rodsilvab.playground.firstapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;
    
    @Autowired
    public PersonController(@RequestBody PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
