package com.bertoti.llama_with_tools;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LlamaWithToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlamaWithToolsApplication.class, args);
	}

	@Bean
    CommandLineRunner run(Assistant assistant) {
		return args -> {
			String response = assistant.chat("I want to view the passenger's info");
			System.out.println("AI Response: " + response);
		};
	}
}
