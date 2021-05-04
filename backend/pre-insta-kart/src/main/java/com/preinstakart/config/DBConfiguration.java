package com.preinstakart.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Database Configuration
 */
@Configuration
public class DBConfiguration {

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public HikariDataSource clubAttributeDataSource() {
    return DataSourceBuilder.create().type(HikariDataSource.class).build();
  }
}
