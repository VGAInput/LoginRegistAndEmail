package edu.vga.LoginRegistAndEmail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoginRegistAndEmailApplication {

	static {
		log.info("\nWe are getting started.");
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginRegistAndEmailApplication.class, args);
	}

}
