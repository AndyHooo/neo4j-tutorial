package com.andy.neo4j.service.impl;

import com.andy.neo4j.dao.PersonRepository;
import com.andy.neo4j.model.node.Person;
import com.andy.neo4j.service.PersonService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PersonServiceImpl
 * @Description TODO
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:14
 * @Version 1.0
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override public Person add(Person person) {
        return personRepository.save(person);
    }

    @Override public void delete(Person person) {
        personRepository.delete(person);
    }

    @Override public Person findOne(Long id) {
        return personRepository.findById(id).get();
    }

    @Override public List<Person> findAll() {
        return Lists.newArrayList(personRepository.findAll());
    }
}
