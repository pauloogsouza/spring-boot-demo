package com.psouza.springwebdemo.repositories;

import com.psouza.springwebdemo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
