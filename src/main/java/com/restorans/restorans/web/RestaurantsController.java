package com.restorans.restorans.web;

import com.restorans.restorans.entity.Restaurant;
import com.restorans.restorans.service.RestaurantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/restaurants")
@RestController
public class RestaurantsController {

    @Autowired
    RestaurantsService restaurantsService;

    @GetMapping
    public List<Restaurant> getAll(){
        return restaurantsService.getAll();
    }

    @GetMapping("/{id}")
    public Restaurant get(@PathVariable Long id){
        return restaurantsService.get(id);
    }

}
