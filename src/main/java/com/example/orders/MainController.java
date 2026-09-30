package com.example.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController // This means that this class is a Controller
@RequestMapping(path="/orders") // This means URL's start with /orders (after Application path)
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserOrder> createOrder(@RequestBody UserOrder user){
       UserOrder newOrder = userRepository.save(user);
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newOrder.getId()).toUri();
       return ResponseEntity.created(location).body(newOrder);
    }

    @GetMapping(path="/all")
    public Iterable<UserOrder> getAllUsers() {
        return userRepository.findAll();
    }
}