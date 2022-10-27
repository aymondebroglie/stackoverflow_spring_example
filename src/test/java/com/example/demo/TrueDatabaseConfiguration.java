package com.example.demo;

import org.hibernate.id.AbstractUUIDGenerator;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;


@Configuration
public class TrueDatabaseConfiguration {

    @Bean
    public DataSource dataSource() {
        var builder = DataSourceBuilder.create();
        builder.driverClassName("org.postgresql.Driver");
        builder.url(TrueDatabaseInitializer.postgreSQLContainer.getJdbcUrl());
        builder.username("username");
        builder.password("password");
        return builder.build();
    }
}
