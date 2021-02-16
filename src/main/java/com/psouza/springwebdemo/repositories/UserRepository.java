package com.psouza.springwebdemo.repositories;

import com.psouza.springwebdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
