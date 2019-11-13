package com.andy.neo4j.model.relationship;

import com.andy.neo4j.model.node.Animal;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * @ClassName AnimalRelationship
 * @Description 动物之间的关系
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:46
 * @Version 1.0
 */
@Data
@Builder
@RelationshipEntity(type = "eat")
public class AnimalRelationship {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Animal eatAnimal;

    @EndNode
    private Animal foodAnimal;

}
