package com.CandyShop.library.service;

import com.CandyShop.library.dto.AdminDto;
import com.CandyShop.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}