package com.example.eduassign.controller;

//src/main/java/com/example/demo/controller/UserController.java


import com.example.eduassign.entity.User;
import com.example.eduassign.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

 @Autowired
 private UserRepository userRepository;

 @PostMapping("/add")
 public User registerUser(@RequestBody User user) {
     return userRepository.save(user);
 }

 @PostMapping("/login")
 public String loginUser(@RequestBody User user) {
     User foundUser = userRepository.findByUsername(user.getUsername());
     if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
         return "Login Successful";
     } else {
         return "Invalid username or password";
     }
 }
 @GetMapping("/getalluser")
 public List<User> getalluser(){
	 return userRepository.findAll();
	 }
}
