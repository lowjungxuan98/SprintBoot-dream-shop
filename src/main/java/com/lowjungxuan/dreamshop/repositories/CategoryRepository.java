package com.lowjungxuan.dreamshop.repositories;

import com.lowjungxuan.dreamshop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}