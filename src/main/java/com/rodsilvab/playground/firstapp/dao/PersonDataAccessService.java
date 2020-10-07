package com.rodsilvab.playground.firstapp.dao;

import com.rodsilvab.playground.firstapp.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class PersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        try{
            DB.add(new Person(id, person.getName()));
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
