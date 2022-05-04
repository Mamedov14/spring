package com.example.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.example.school.repository",
        "com.example.school.service"})
public class MainConfiguration {
    @Bean
    public JdbcTemplate getJdbsTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/school");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }
}
