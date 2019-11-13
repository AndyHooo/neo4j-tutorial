package com.andy.neo4j.service.impl;

import com.andy.neo4j.dao.AnimalRelationshipRepository;
import com.andy.neo4j.dao.AnimalRepository;
import com.andy.neo4j.model.node.Animal;
import com.andy.neo4j.model.relationship.AnimalRelationship;
import com.andy.neo4j.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AnimalServiceImpl
 * @Description AnimalServiceImpl
 * @Author hudaqiang507
 * @Date 2019/11/13 下午6:13
 * @Version 1.0
 */
@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private AnimalRelationshipRepository animalRelationshipRepository;


    @Transactional
    @Override public void createFoodChain(String eatAnimalName, String foodAnimalName) {

        Animal eatAnimal = animalRepository.findOne(eatAnimalName);
        if(eatAnimal == null){
            eatAnimal = Animal.builder().name(eatAnimalName).build();
            animalRepository.save(eatAnimal);
        }

        Animal foodAnimal = animalRepository.findOne(foodAnimalName);
        if(foodAnimal == null) {
            foodAnimal = Animal.builder().name(foodAnimalName).build();
            animalRepository.save(foodAnimal);
        }

        AnimalRelationship animalRelationship = AnimalRelationship.builder().eatAnimal(eatAnimal).foodAnimal(foodAnimal).build();
        animalRelationshipRepository.save(animalRelationship);
    }

    @Override public void delete(String name) {
        animalRepository.delete(name);
    }

}
