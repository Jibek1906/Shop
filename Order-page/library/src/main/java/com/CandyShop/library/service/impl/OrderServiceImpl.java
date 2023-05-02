package com.CandyShop.library.service.impl;

import com.CandyShop.library.model.CartItem;
import com.CandyShop.library.model.Order;
import com.CandyShop.library.model.OrderDetail;
import com.CandyShop.library.model.ShoppingCart;
import com.CandyShop.library.repository.CartItemRepository;
import com.CandyShop.library.repository.OrderDetailRepository;
import com.CandyShop.library.repository.OrderRepository;
import com.CandyShop.library.repository.ShoppingCartRepository;
import com.CandyShop.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ShoppingCartRepository cartRepository;
    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public void saveOrder(ShoppingCart cart) {
        Order order = new Order();
        order.setOrderStatus("PENDING");
        order.setOrderDate(new Date());
        order.setCustomer(cart.getCustomer());
        order.setTotalPrice(cart.getTotalPrices());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        for (CartItem item : cart.getCartItem()){
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrder(order);
            orderDetail.setQuantity(item.getQuantity());
            orderDetail.setProduct(item.getProduct());
            orderDetail.setUnitPrice(item.getProduct().getCostPrice());
            orderDetailRepository.save(orderDetail);
            orderDetailList.add(orderDetail);
            cartItemRepository.delete(item);
        }
        order.setOrderDetailList(orderDetailList);
        cart.setCartItem(new HashSet<>());
        cart.setTotalItems(0);
        cart.setTotalPrices(0);
        cartRepository.save(cart);
        orderRepository.save(order);
    }

    @Override
    public void acceptOrder(Long id) {
        Order order = orderRepository.getById(id);
        order.setDeliveryDate(new Date());
        order.setOrderStatus("SHIPPING");
        orderRepository.save(order);

    }

    @Override
    public void cancelOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
