package com.cursojava.curso.controllers;

import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControllers {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable String id){
        User u1= new User();
        u1.setId(Long.parseLong(id));
        u1.setName("Martin");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPhone("4435166989");
        return u1;
    }

    @RequestMapping(value = "users")
    public List<User> updateUser(){
        List<User> l= new ArrayList<User>();

        User u1= new User();
        u1.setId(1221L);
        u1.setName("Martin1");
        u1.setLastname("Corona");
        u1.setEmail("alexis@gamil.com");
        u1.setPassword("ksmkwsms");
        u1.setRole("user");
        u1.setPhone("4435166989");

        User u2= new User();
        u2.setId(122L);
        u2.setName("Martin2");
        u2.setLastname("Corona");
        u2.setEmail("alexis@gamil.com");
        u2.setPassword("ksmkwsms");
        u2.setRole("user");
        u2.setPhone("4435166989");

        User u3= new User();
        u3.setId(901L);
        u3.setName("Martin3");
        u3.setLastname("Corona");
        u3.setEmail("alexis@gamil.com");
        u3.setPassword("ksmkwsms");
        u3.setRole("user");
        u3.setPhone("4435166989");

        User u4= new User();
        u4.setId(1230L);
        u4.setName("Martin4");
        u4.setLastname("Corona");
        u4.setEmail("alexis@gamil.com");
        u4.setPassword("ksmkwsms");
        u4.setRole("user");
        u4.setPhone("4435166989");

        l.add(u1);
        l.add(u2);
        l.add(u3);
        l.add(u4);
        return l;
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
