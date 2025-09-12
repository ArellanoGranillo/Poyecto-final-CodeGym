/*package com.codegym.jira.config;

import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(LiquibaseProperties.class)
public class LiquibaseConfig {

    @Bean
    @Profile("test")
    public LiquibaseProperties liquibaseProperties() {
        LiquibaseProperties properties = new LiquibaseProperties();
        properties.setEnabled(false);  // Deshabilita Liquibase completamente
        return properties;
    }
}*/