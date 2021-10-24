package com.codigoton.dinner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinnerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DinnerApplication.class, args);
	}

	public void run(String... args) {
		System.out.println("HOLA MUNDO");
	}
}
