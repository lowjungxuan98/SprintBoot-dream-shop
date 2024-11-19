package com.lowjungxuan.dreamshop.repository;

import com.lowjungxuan.dreamshop.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}