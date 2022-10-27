package com.example.demo;

import org.springframework.test.context.ActiveProfilesResolver;

public class CustomActiveProfilesResolver implements ActiveProfilesResolver {

    @Override
    public String[] resolve(Class<?> testClass) {
        boolean inMemoryActived = true;
        if (inMemoryActived){
            return new String[] {"in-memory"};
        }else {
            return new String[]{};
        }

    }
}
