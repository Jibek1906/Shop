package com.CandyShop.library.dto;

import com.CandyShop. library.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NegativeOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private double costPrice;
    private double salePrice;
    private int currentQuantity;
    private Category category;
    private String image;
    private boolean activated;
    private boolean deleted;
}