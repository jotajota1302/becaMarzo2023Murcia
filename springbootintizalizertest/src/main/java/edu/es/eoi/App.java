package edu.es.eoi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Value("${message.hello}")
	private String message;
	
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
				
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(message);
		
		
	}
	
	
	

}
