package com.jwt.services;



import com.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    private List<User> store=new ArrayList<>();

    public UserServices() {
        store.add(new User(UUID.randomUUID().toString(),"sunita","sunita@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"anurag","anurag@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"mini","mini@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"sanya","sanya@gmail.com"));

    }
    public  List<User>getUsers(){
        return this.store;
    }
}
