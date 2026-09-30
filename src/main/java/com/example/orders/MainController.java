package com.example.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController //This class is a Controller
@RequestMapping(path="/orders") // This is URL's start with /orders (after Application path)
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<CreateOrder> createOrder(@RequestBody CreateOrder user){
       CreateOrder newOrder = userRepository.save(user);
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newOrder.getId()).toUri();
       return ResponseEntity.created(location).body(newOrder);
    }

    @GetMapping
    public Iterable<CreateOrder> getAllUserOrders() {
        return userRepository.findAll();
    }

    @RestController
    public class DatabaseController {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @GetMapping("/databases")
        public List<String> getAllDatabases() {
            return jdbcTemplate.queryForList("SHOW DATABASES;", String.class);
        }
    }
}