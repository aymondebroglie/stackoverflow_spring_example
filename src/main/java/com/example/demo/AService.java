package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AService {

    private final ARepository aRepository;

    @Autowired
    public AService(ARepository aRepository) {
        this.aRepository = aRepository;
    }

    public A get(UUID uuid) {
        return aRepository.findById(uuid).orElseThrow();
    }

    public void set(A a) {
        aRepository.save(a);
    }
}
