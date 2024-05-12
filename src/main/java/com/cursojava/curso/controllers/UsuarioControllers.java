package com.cursojava.curso.controllers;

import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioControllers {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable String id){
        User u1= new User();
        u1.setId(id);
        u1.setName("Martin");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPhone("4435166989");
        return u1;
    }

    @RequestMapping(value = "user1")
    public User updateUser(){
        User u1= new User();
        u1.setName("Martin");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPhone("4435166989");
        return u1;
    }

    @RequestMapping(value = "user12")
    public User deleteUser(){
        User u1= new User();
        u1.setName("Martin");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPhone("4435166989");
        return u1;
    }

    @RequestMapping(value = "user45")
    public User findUser(){
        User u1= new User();
        u1.setName("Martin");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPhone("4435166989");
        return u1;
    }

}
