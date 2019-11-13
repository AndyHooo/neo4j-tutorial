package com.andy.neo4j.model.node;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * @ClassName Animal
 * @Description 动物节点
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:44
 * @Version 1.0
 */
@NodeEntity(label = "animal")
@Builder
@Data
public class Animal {

    @Id
    @GeneratedValue
    private Long id;

    @Index(unique = true)
    @Property(name = "name")
    private String name;

}
