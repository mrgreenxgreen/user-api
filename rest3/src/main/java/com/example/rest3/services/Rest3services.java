package com.example.rest3.services;

import com.example.rest3.models.Users;
import com.example.rest3.repositories.Rest3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Rest3services {

    @Autowired
    Rest3Repository rest3Repository;

    public List<Users> getAllUsers(){
        return rest3Repository.findAll();
    }

    public Users addUser(Users users){
        return rest3Repository.save(new Users(users.getUsername(),users.getPassword(),users.getEmail()));
    }

}
