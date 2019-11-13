package com.andy.controller;

import com.andy.neo4j.model.node.Person;
import com.andy.neo4j.service.AnimalService;
import com.andy.neo4j.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Neo4jController
 * @Description TODO
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/neo4j")
public class Neo4jController {

    @Autowired
    private PersonService personService;

    @Autowired
    private AnimalService animalService;

    @RequestMapping("/add")
    public String addPerson() {
        Person person = new Person();
        person.setName("omni");
        person.setBorn(1991);
        personService.add(person);
        return "success";
    }

    @RequestMapping("/query")
    public Person query() {
        return personService.findOne(0L);
    }

    @RequestMapping("/chain/{eat}/{food}")
    public String foodChain(@PathVariable("eat") String eat, @PathVariable("food")String food) {
        animalService.createFoodChain(eat,food);
        return "success";
    }

    @RequestMapping("/delete/animal/{name}")
    public String deleteAnimal(@PathVariable("name") String name) {
        animalService.delete(name);
        return "success";
    }
}
