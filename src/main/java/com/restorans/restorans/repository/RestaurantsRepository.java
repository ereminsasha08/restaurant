package com.restorans.restorans.repository;

import com.restorans.restorans.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantsRepository extends JpaRepository<Restaurant, Long> {
}
