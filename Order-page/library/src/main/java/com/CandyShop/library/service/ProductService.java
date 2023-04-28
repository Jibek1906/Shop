package com.CandyShop.library.service;

import com.CandyShop.library.dto.ProductDto;
import com.CandyShop.library.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    Product save(MultipartFile imageProduct, ProductDto productDto);
    Product update(ProductDto productDto);
    void deleteById(Long id);
    void enableById(Long id);
}