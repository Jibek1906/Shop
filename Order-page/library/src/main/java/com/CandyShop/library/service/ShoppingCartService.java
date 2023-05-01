package com.CandyShop.library.service;

import com.CandyShop.library.model.Customer;
import com.CandyShop.library.model.Product;
import com.CandyShop.library.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);

}