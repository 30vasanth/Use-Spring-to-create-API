package net.cerditcardmanagement.springboot;

import net.cerditcardmanagement.springboot.model.Cardtype;
import net.cerditcardmanagement.springboot.repository.CardtypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private CardtypeRepository cardtypeRepository;



}
