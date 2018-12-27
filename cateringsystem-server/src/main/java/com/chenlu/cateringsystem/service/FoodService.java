package com.chenlu.cateringsystem.service;

import com.chenlu.cateringsystem.model.Food;
import com.chenlu.cateringsystem.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public Food getFood(int food_id){
        return foodRepository.getOne(food_id);
    }
    public Food save(int food_id){
        return foodRepository.save(food_id);
    }
    public Food delete(int food_id){
        return foodRepository.delete(food_id);
    }
    public Food update(int food_id){
        return foodRepository.update(food_id);
    }
}
