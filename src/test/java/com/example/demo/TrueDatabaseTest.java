package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration(initializers = TrueDatabaseInitializer.class, classes = TrueDatabaseConfiguration.class)
@EnableAutoConfiguration
@SpringBootTest
@Sql(statements = "CREATE TABLE a (\n" +
        "    uuid UUID PRIMARY KEY NOT NULL,\n" +
        "    content VARCHAR(255) NOT NULL\n" +
        ");\n")
@ComponentScan(basePackages = "com.example.demo")
@Transactional
@Profile("!in-memory")
public @interface TrueDatabaseTest {
}
