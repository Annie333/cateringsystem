package com.chenlu.cateringsystem.controller;

import com.chenlu.cateringsystem.model.Food;
import com.chenlu.cateringsystem.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Food")
@RestController
@CrossOrigin
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping("/saveFood")
    private Food saveFood(@RequestBody int food_id) {return foodService.save(food_id);}

    @GetMapping("/deleteFood")
    private void deleteFood(@PathVariable("food_id") int food_id){foodService.delete(food_id);}

    @PostMapping("/updateFood")
    private Food updateFood(@RequestBody int food_id) {return foodService.update(food_id);}
}
