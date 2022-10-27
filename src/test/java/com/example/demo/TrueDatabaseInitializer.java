package com.example.demo;

import org.junit.ClassRule;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

public class TrueDatabaseInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @ClassRule
    public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>(
            DockerImageName
                    .parse("public.ecr.aws/docker/library/postgres:10")
                    .asCompatibleSubstituteFor("postgres")
    )
            .withDatabaseName("test")
            .withUsername("username")
            .withPassword("password");

    public void initialize(
            ConfigurableApplicationContext configurableApplicationContext
    ) {
        postgreSQLContainer.start();
    }
}
