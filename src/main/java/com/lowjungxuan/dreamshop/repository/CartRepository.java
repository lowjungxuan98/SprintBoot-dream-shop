package com.lowjungxuan.dreamshop.repository;

import com.lowjungxuan.dreamshop.model.Cart;
import com.lowjungxuan.dreamshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> user(User user);

    Cart findByUserId(Long userId);
}