package com.fooddonation.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.fooddonation.model.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Long> {
}
