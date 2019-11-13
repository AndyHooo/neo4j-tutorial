package com.andy.neo4j.service;

public interface AnimalService {

    void createFoodChain(String eatAnimalName,String foodAnimalName);

    void delete(String name);
}
