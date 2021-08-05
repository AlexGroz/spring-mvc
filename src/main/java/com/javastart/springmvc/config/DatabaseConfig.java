package com.javastart.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.javastart.springmvc.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class DatabaseConfig {
}
