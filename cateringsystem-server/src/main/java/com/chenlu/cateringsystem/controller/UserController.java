package com.chenlu.cateringsystem.controller;

import com.chenlu.cateringsystem.model.User;
import com.chenlu.cateringsystem.service.UserService;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/User")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    private User saveUser(@RequestBody VarcharTypeDescriptor user_id) {return userService.save(user_id);}

    @GetMapping("/deleteUser")
    private void deleteUser(@PathVariable("user_id") VarcharTypeDescriptor user_id){userService.delete(user_id);}

    @PostMapping("/updateUser")
    private User updateUser(@RequestBody VarcharTypeDescriptor user_id) {return userService.update(user_id);}
}
