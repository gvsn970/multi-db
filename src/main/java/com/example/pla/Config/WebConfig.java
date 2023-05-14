package com.example.pla.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class WebConfig {
 
 @Bean(name = "database1")
 @ConfigurationProperties(prefix = "spring.datasource")
 public DataSource dataSource1() {
	 System.err.println("db1");
  return DataSourceBuilder.create().build();
 }

 @Bean(name = "jdbcTemplate1")
 public JdbcTemplate jdbcTemplate1(@Qualifier("database1") DataSource ds) {
	 System.err.println(ds);
  return new JdbcTemplate(ds);
 }
 
 @Bean(name = "database2")
 @ConfigurationProperties(
		 prefix = "spring.second-db")
 public DataSource dataSource2() {
	 System.err.println("db2");
  return  DataSourceBuilder.create().build();
 }

 @Bean(name = "jdbcTemplate2")
 public JdbcTemplate jdbcTemplate2(@Qualifier("database2") DataSource ds) {
	 System.err.println(ds);
  return new JdbcTemplate(ds);
 }
}
