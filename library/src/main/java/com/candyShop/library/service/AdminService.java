package com.candyShop.library.service;

import com.candyShop.library.dto.AdminDto;
import com.candyShop.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}