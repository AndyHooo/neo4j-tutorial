package com.andy.neo4j.model.node;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @ClassName Food
 * @Description food节点
 * @Author hudaqiang507
 * @Date 2019/11/13 下午5:36
 * @Version 1.0
 */
@NodeEntity("food")
@Data
@Builder
public class Food {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "name")
    private String name;

}
