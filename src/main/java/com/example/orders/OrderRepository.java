package com.example.orders;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderItem, Integer> {

}
