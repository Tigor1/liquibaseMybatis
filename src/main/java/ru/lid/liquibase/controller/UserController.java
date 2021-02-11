package ru.lid.liquibase.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lid.liquibase.entity.User;
import ru.lid.liquibase.mappers.UserMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserMapper userMapper;

    @GetMapping("/user/all")
    public List<User> allUsers() {
        return userMapper.getUsers();
    }
}
