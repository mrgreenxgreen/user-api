package com.example.rest3.controllers;

import com.example.rest3.models.Users;
import com.example.rest3.repositories.Rest3Repository;
import com.example.rest3.services.Rest3services;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class rest3controller {

    @Autowired
    Rest3services rest3services;
    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers (){
        List<Users> usersData = rest3services.getAllUsers();
        return new ResponseEntity<>(usersData, HttpStatus.ACCEPTED);
    }

    @PostMapping("/user")
    public ResponseEntity<Users> addUser(@RequestBody Users users){
            try{
                Users _user = rest3services.addUser(users);
                return new ResponseEntity<>(_user,HttpStatus.CREATED);
            }catch(Exception e){
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }

    }


}
