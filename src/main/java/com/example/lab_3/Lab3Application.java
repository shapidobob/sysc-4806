package com.example.lab_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;


@SpringBootApplication
public class Lab3Application {


	private static final Logger log = LoggerFactory.getLogger(Lab3Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class);
	}

	/*
	@Bean
	public CommandLineRunner demo(BuddyRepository repository) {
		return (args) -> {
			// save a few buddies
			repository.save(new BuddyInfo("123123", "Bauer"));
			repository.save(new BuddyInfo("32432", "O'Brian"));
			repository.save(new BuddyInfo("3242", "Bauer"));
			repository.save(new BuddyInfo("65654", "Palmer"));
			repository.save(new BuddyInfo("523452", "Dessler"));

			// fetch all customers
			log.info("buddy found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(buddy -> {
				log.info(buddy.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			BuddyInfo buddy = repository.findById(1);
			log.info("buddy found with findById(1L):");
			log.info("--------------------------------");
			log.info(buddy.toString());
			log.info("");

			// fetch customers by last name
			log.info("buddy found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}*/

	/*
	@Bean
	public CommandLineRunner demo(AddressRepository repository) {
		return (args) -> {

			BuddyInfo buddy1 = new BuddyInfo("22342", "John");
			BuddyInfo buddy2 = new BuddyInfo("21343234", "jeff");
			BuddyInfo buddy3 = new BuddyInfo("32423", "steve");

			AddressBook book1 = new AddressBook();
			AddressBook book2 = new AddressBook();
			book1.addBuddy(buddy2);
			book2.addBuddy(buddy1);
			book2.addBuddy(buddy3);
			// save a few customers
			repository.save(book1);
			repository.save(book2);

			// fetch all customers
			log.info("buddy found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(buddy -> {
				log.info(buddy.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			Optional<AddressBook> book = repository.findById(1);
			log.info("buddy found with findById(1L):");
			log.info("--------------------------------");
			log.info(book.toString());
			log.info("");
		};
	}*/

}
