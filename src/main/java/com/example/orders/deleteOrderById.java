package com.example.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class deleteOrderById {
    @Autowired
    private OrderRepository orderRepository;
    public void deleteOrderById(Integer id){
        boolean exists = orderRepository.existsById(id);
        if(!exists){
            throw new RuntimeException("Order Not Found");
        }
     orderRepository.deleteById(id);
    }
}
