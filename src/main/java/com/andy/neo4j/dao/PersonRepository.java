package com.andy.neo4j.dao;

import com.andy.neo4j.model.node.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person,Long> {
}
