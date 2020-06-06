package com.example.dao;

import com.example.model.User;
import com.example.model.UserAddress;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 */
@Repository
public class UserDAO {
    private List<User> users;

    @PostConstruct
    public void init() {
        UserAddress addressJK = new UserAddress("Warsaw", "Poland", "Krotka", "11-100");
        User userJK = new User("jkowalski", "Jan", "Kowalski", "jkowalski@gmil.com", addressJK);
        users = Arrays.asList(userJK);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "users=" + users +
                '}';
    }
}
