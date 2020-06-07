package com.example.service;

import com.example.dao.UserDAO;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class UserService {
    private UserDAO dao;

    @Autowired
    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public User getByLogin(String login) {
        return dao.getUsers().stream()
                .filter((user) -> user.getLogin().equals(login))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found for login: " + login));
    }

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }
}
