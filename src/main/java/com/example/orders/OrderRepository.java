package com.example.orders;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderItem, Integer> {
    @Query("SELECT o FROM OrderItem o WHERE o.productName LIKE %:keyword% OR o.customerName LIKE %:keyword%")
    Iterable<OrderItem> searchOrders(String keyword);

}