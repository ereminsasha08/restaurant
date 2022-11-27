package com.restorans.restorans.service;

import com.restorans.restorans.entity.Restaurant;
import com.restorans.restorans.repository.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantsService {

    @Autowired
    RestaurantsRepository repository;
    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public  Restaurant get(Long id){
        return repository.findById(id).orElse(null);
    }
}
