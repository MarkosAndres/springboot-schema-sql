package com.markos.liquibase.sqlfile.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.markos.liquibase.sqlfile")
@EnableJpaRepositories({"com.markos.liquibase.sqlfile.repository"})
@EntityScan("com.markos.liquibase.sqlfile.entity")
public class LiquibaseSqlFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseSqlFileApplication.class, args);
	}
}
