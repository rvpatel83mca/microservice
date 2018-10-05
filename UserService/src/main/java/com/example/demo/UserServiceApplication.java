package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repositories.UserRepository;
import com.example.demo.to.User;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration

public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.deleteAll();
			User u1 = new User();
			u1.setFirstName("Rishit");
			u1.setLastName("Patel");
			repository.save(u1);
			
			u1 = new User();
			u1.setFirstName("Meet");
			u1.setLastName("Patel"); 
			repository.save(u1);
			
			u1 = new User();
			u1.setFirstName("Neha");
			u1.setLastName("Patel");
			repository.save(u1);

			
			// fetch all customers
			System.out.println("Customers found with findAll():");
			System.out.println("-------------------------------++" +repository.count());
			for (User customer : repository.findAll()) {
				System.out.println(customer.toString());
			}
			System.out.println("");
/*
			
			// fetch an individual customer by ID
			repository.findByFirstName("Jack")
				.ifPresent(customer -> {
					log.info("Customer found with findById(1L):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
			
			*/
		};
		
	}
}
