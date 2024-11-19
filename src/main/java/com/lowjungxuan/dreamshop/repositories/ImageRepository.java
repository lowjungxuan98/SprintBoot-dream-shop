package com.lowjungxuan.dreamshop.repositories;

import com.lowjungxuan.dreamshop.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}