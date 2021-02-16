package com.psouza.springwebdemo.repositories;

import com.psouza.springwebdemo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
