package com.example;


import com.example.dao.UserDAO;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainApplication {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");

        UserDAO dao = context.getBean(UserDAO.class);
        System.out.println(dao);

        UserService service = context.getBean(UserService.class);
        System.out.println("Searching for user: " + service.getByLogin("jjkowalski"));
    }
}
