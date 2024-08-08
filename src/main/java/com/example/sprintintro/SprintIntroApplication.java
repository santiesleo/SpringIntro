package com.example.sprintintro;

import com.example.sprintintro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/*Marca esta clase como la principal clase de configuración de la aplicación Spring Boot*/
@SpringBootApplication
public class SprintIntroApplication implements CommandLineRunner {

	/*Instancia de "Logger" para registrar mensajes*/
	private static final Logger log = Logger.getLogger(SprintIntroApplication.class.getName());

	@Autowired
	/*
	La anotación @Autowired en Spring se utiliza para realizar la inyección automática de dependencias en un bean.
	Esto significa que Spring resolverá y suministrará automáticamente los objetos que un bean necesita para funcionar,
	sin que sea necesario crear manualmente esas instancias.*/
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SprintIntroApplication.class, args);
	}

	public void run(String... args) throws Exception {
		log.info("Users in repository: " + userRepository.getUsers().size());
	}
}
