package com.andy.neo4j.model.node;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * @ClassName Person
 * @Description person实体类
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:08
 * @Version 1.0
 */
@NodeEntity(label = "person")
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Index
    @Property(name = "name")
    private String name;

    @Property(name = "born")
    private int born;

    public Person() {
    }
}
