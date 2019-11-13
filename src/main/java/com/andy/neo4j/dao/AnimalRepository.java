package com.andy.neo4j.dao;

import com.andy.neo4j.model.node.Animal;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @ClassName AnimalRepository
 * @Description animalRepository
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:50
 * @Version 1.0
 */
public interface AnimalRepository extends Neo4jRepository<Animal,Long> {

    @Query("create (an:animal {name:{animal.name}})")
    Animal create(@Param("animal") Animal animal);

    @Query("match (an:animal) where an.name = {name} return an")
    Animal findOne(@Param("name") String name);

    @Query("match (an:animal) where an.name = {name} delete an")
    void delete(@Param("name") String name);

    @Query("match (an:animal) return an")
    List<Animal> queryAll();

}
