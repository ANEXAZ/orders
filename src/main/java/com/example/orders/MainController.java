package com.example.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/orders") // This means URL's start with /orders (after Application path)
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserOrder> createOrder(@RequestBody UserOrder user){
       UserOrder savedOrder = userRepository.save(user);
       return ResponseEntity.ok(savedOrder);
    }

    @GetMapping(path="/all")
    public Iterable<UserOrder> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}