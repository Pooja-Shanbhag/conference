package com.test.conference.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

//  @Bean
//  public DataSource buildDataSource(){
//    DataSourceBuilder builder = DataSourceBuilder.create();
//    builder.url("jdbc:postgresql://localhost:5432/conference_app");
//    builder.username("postgres");
//    builder.password("Welcome");
//    System.out.println("This config is from my custom config");
//    return builder.build();
//  }

}
