package com.example.sprintintro.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data /*Anotación Lombok para generar getters, setters, toString, equals y hashCode*/
@AllArgsConstructor /*Genera un constructor con todos los campos*/
@NoArgsConstructor /*Genera un constructor sin argumentos*/
public class User {
    private int id;
    private String username;
    private int age;

}
