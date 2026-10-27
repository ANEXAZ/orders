package com.example.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface OrderRepository extends JpaRepository<OrderItem, Integer> {
    @Query("SELECT o FROM OrderItem o WHERE o.productName LIKE %:keyword% OR o.customerName LIKE %:keyword%")
    Iterable<OrderItem> searchOrders(String keyword);

}