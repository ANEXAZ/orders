package com.example.orders;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserOrder, Integer> {

}
