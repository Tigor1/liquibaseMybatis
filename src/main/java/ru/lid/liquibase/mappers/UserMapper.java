package ru.lid.liquibase.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import ru.lid.liquibase.entity.User;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    void insertUser(@Param("email") String email,
                    @Param("firstName") String firstName,
                    @Param("lastName") String lastName,
                    @Param("password") String password,
                    @Param("username") String username);

    List<User> getUsers();
}
