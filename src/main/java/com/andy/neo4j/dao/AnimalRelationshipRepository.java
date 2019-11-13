package com.andy.neo4j.dao;

import com.andy.neo4j.model.relationship.AnimalRelationship;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AnimalRelationshipRepository extends Neo4jRepository<AnimalRelationship,Long> {



}
