package com.yale.bamboo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BambooApplication {
	public static void main(String[] args) {
		SpringApplication.run(BambooApplication.class, args);
	}

	@Bean
	public DataLoader dataLoader(){
		return new DataLoader();
	}
	@Slf4j
	static class DataLoader implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			log.info("Loading data...");
		}
	}

}
