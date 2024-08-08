package com.example.sprintintro.repositories;

import com.example.sprintintro.Model.User;

import java.util.ArrayList;
import java.util.List;

/*Clase que maneja una lista de usuarios*/
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
    private void init() {
        User user = new User();
        user.setUsername("Jhon Doe");
        users.add(user);
    }
}
