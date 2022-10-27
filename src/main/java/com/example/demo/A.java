package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "a")
public class A {

    public A(){}
    public A(UUID uuid, String content) {
        this.uuid = uuid;
        this.content = content;
    }
    @Id
    private UUID uuid;

    private String content;

    public UUID getUuid() {
        return uuid;
    }

    public String getContent() {
        return content;
    }
}
