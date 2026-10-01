package com.example.orders;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //This class is a Controller
@RequestMapping(path = "/orders") // This is URL's start with /orders (after Application path)
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public ResponseEntity<OrderItem> createOrder(@RequestBody OrderItem user) {
        OrderItem newOrder = orderRepository.save(user);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(newOrder);
    }

    @GetMapping
    public Iterable<OrderItem> getAllUserOrders() {
        return orderRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getUserById(@PathVariable("id") Long id) {
        return orderRepository.findById(Math.toIntExact(id)).map(user -> ResponseEntity.ok().body(user)).orElse(ResponseEntity.notFound().build());
    }
}