package com.springBoot;


import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootJpa2Application.class, args);
	}
    @Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory e) {
		return e.getSessionFactory();
	}

}
