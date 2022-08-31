package com.crud.crudjdbctemplate.dao;

import com.crud.crudjdbctemplate.entity.User;

import java.util.List;

public interface UserRepository {
    User saveUser(User user);
    User updateUser(User user);
    User getById(int id);
    String deleteById(int id);
    List<User> allUsers();

}
