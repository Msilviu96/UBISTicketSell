package com.ubis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ubis.repository.TicketRepository;
import com.ubis.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(TicketRepository repository, UserRepository repository2) {
		return (args) -> {

		};
	}
}
