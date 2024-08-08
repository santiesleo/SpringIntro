package com.example.sprintintro;

import com.example.sprintintro.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/*Marca esta clase como la principal clase de configuración de la aplicación Spring Boot*/
@SpringBootApplication
public class SprintIntroApplication {

	/*Instancia de "Logger" para registrar mensajes*/
	private static final Logger log = Logger.getLogger(SprintIntroApplication.class.getName());

	public static void main(String[] args) {
		/*Carga el contexto de la aplicación desde el xml*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Obtiene el bean "UserRepository" del contexto*/
		UserRepository userRepository = context.getBean(UserRepository.class);
		/*Registra el número de usuarios en el "UserRepository"*/
		log.info("The number of users is: " + userRepository.getUsers().size());
	}

}
