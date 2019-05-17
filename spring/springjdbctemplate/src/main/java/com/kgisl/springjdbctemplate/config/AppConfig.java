package com.kgisl.springjdbctemplate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
// @ComponentScan("com.kgisl.springjdbctemplate")
@ComponentScan(basePackages="com.kgisl.springjdbctemplate")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment environment;

	private final String URL = "url";
	private final String USER = "root";
	private final String DRIVER = "driver";
	private final String PASSWORD = "";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		// driverManagerDataSource.setUsername(environment.getProperty(USER));
		// driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("");
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDataSource;
	}
}