package com.CandyShop.library.service;

import com.CandyShop.library.dto.CategoryDto;
import com.CandyShop.library.model.Category;

import java.util.List;

public interface CategoryService {
    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();



    List<CategoryDto> getCategoryAndProduct();


}
