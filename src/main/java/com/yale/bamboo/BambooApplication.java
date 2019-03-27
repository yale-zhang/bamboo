package com.yale.bamboo;

import com.yale.bamboo.common.Caller.AsyncCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BambooApplication {
	public static void main(String[] args) {
		SpringApplication.run(BambooApplication.class, args);
	}

	@Autowired
	AsyncCaller caller;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			caller.rightWayToCall();
			Thread.sleep(1000);
			System.out.println("++++++++++++++++");
			Thread.sleep(1000);
			caller.wrongWayToCall();
		};
	}

	/*@Bean
	public DataLoader dataLoader(){
		return new DataLoader();
	}
	@Slf4j
	static class DataLoader implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			log.info("Loading data...");
		}
	}*/

}
