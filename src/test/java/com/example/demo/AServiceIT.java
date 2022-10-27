package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@IntegrationTest
class AServiceIT {

    @Autowired
    private AService aService;

    @Test
    void test() {
        A a = new A(UUID.randomUUID(), "content");
        aService.set(a);
        A newA = aService.get(a.getUuid());

        assertEquals(a.getContent(), newA.getContent());


    }

}
