package com.example.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration(classes = InMemoryConfiguration.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.demo",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {
                Configuration.class, ContextConfiguration.class
        }))
@SpringBootTest
@Profile(value = "in-memory")
public @interface InMemoryTest {
}
