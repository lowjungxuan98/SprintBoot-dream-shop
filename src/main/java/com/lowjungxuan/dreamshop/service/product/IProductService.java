package com.lowjungxuan.dreamshop.service.product;

import com.lowjungxuan.dreamshop.dto.ProductDto;
import com.lowjungxuan.dreamshop.model.Product;
import com.lowjungxuan.dreamshop.request.AddProductRequest;
import com.lowjungxuan.dreamshop.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest product, Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByName(String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
