package com.CandyShop.library.service;

import com.CandyShop.library.model.ShoppingCart;

public interface OrderService {
    void saveOrder(ShoppingCart cart);

    void acceptOrder(Long id);

    void cancelOrder(Long id);
}
