package com.example.sprintintro.repositories;

import com.example.sprintintro.Model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*Clase que maneja una lista de usuarios*/
@Repository
/*La anotación @Repository en Spring se utiliza para marcar una clase como un componente de acceso a datos (DAO - Data Access Object).
Esta anotación indica a Spring que la clase es responsable de interactuar con la base de datos o con cualquier otro mecanismo de persistencia,
y permite que Spring maneje las excepciones específicas de la capa de persistencia.*/
public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<User>();
    }

    public void add(User user) {
        users.add(user);

    }

    public List<User> getUsers() {
        return users;
    }

    /*Método de inicialización que agrega un usuario por defecto*/
    @PostConstruct
    /*
    La anotación @PostConstruct en Spring Boot se utiliza para marcar un método que debe ejecutarse una vez que el contenedor de Spring
    ha terminado de inyectar las dependencias y está a punto de poner el bean en servicio. Es un método de callback que se ejecuta después
    de que el bean ha sido inicializado, lo que lo hace ideal para cualquier configuración adicional que necesite realizarse después de que
    el bean ha sido creado y todas las dependencias han sido inyectadas.
    /*
     */
    private void init() {
        User user = new User();
        user.setUsername("Jhon Doe");
        users.add(user);
    }
}
