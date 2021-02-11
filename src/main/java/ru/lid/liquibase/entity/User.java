package ru.lid.liquibase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "username", unique = true, nullable = false)
    private String userName;

//    @Column(name = "password", nullable = false)
    private String password;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;

//    @Column(name = "email")
    private String email;

    // Далее конструктор по умолчанию, геттеры и сеттеры
    // Или можете использовать Lombok
}