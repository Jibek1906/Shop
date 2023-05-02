package com.CandyShop.library.service.impl;

import com.CandyShop.library.model.City;
import com.CandyShop.library.repository.CityRepository;
import com.CandyShop.library.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
