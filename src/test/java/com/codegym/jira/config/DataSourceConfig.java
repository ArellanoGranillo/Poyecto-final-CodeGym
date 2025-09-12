/*package com.codegym.jira.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:secrets.properties")
public class DataSourceConfig {

    @Value("${db.password}")  // ✅ Inyecta el valor correctamente
    private String dbPassword;

    @Bean
    @Profile("!test")
    public DataSource postgresqlDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5433/jira")
                .username("jira")
                .password(dbPassword)  // ✅ Usa la variable, NO el string entre comillas
                .build();
    }

    @Bean
    @Profile("test")
    public DataSource h2DataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE")
                .username("sa")
                .password("")
                .build();
    }
}*/