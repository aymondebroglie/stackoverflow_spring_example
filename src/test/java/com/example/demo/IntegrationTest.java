package com.example.demo;


import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ActiveProfiles(resolver = CustomActiveProfilesResolver.class )
@TrueDatabaseTest
@InMemoryTest
public @interface IntegrationTest {
}
