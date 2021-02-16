package com.psouza.springwebdemo.repositories;

import com.psouza.springwebdemo.entities.OrderItem;
import com.psouza.springwebdemo.entities.User;
import com.psouza.springwebdemo.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
