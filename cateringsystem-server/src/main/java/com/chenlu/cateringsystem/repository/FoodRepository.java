package com.chenlu.cateringsystem.repository;

import com.chenlu.cateringsystem.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer>{
    Optional<Food>findFoodByFood_id(int food_id);

    Food save(int food_id);

    Food delete(int food_id);

    Food update(int food_id);
}
