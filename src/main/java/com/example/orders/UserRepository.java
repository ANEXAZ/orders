package com.example.orders;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<CreateOrder, Integer> {

}
