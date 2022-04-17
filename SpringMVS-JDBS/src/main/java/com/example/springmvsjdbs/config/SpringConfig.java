package com.example.springmvsjdbs.config;

import com.example.springmvsjdbs.dao.StudentDao;
import com.example.springmvsjdbs.dao.StudentDaoImpl;
import com.example.springmvsjdbs.service.StudentService;
import com.example.springmvsjdbs.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.example.springmvsjdbs.dao", "com.example.springmvsjdbs.service"})
public class SpringConfig {
    @Bean
    public JdbcTemplate getJdbsTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/springMVS-JDBS");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }
}
