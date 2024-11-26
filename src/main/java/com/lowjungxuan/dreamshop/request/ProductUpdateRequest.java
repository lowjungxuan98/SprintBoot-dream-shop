package com.lowjungxuan.dreamshop.request;

import com.lowjungxuan.dreamshop.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private String name;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
