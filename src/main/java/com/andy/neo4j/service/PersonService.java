package com.andy.neo4j.service;

import com.andy.neo4j.model.node.Person;

public interface PersonService {

    Person add(Person person);

    void delete(Person person);

    Person findOne(Long id);

    Iterable<Person> findAll();
}
