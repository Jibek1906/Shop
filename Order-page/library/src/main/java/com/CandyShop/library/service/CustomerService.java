package com.CandyShop.library.service;

import com.CandyShop.library.dto.CustomerDto;
import com.CandyShop.library.model.Customer;

public interface CustomerService {

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);
}