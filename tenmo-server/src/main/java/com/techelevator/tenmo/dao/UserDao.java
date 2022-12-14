package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.User;
import org.springframework.data.jdbc.repository.query.Query;

import java.util.List;

public interface UserDao {

    List<User> findAll();

//    Long findId(String username);

    List<String> findAllUsername();


    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);
}
