package com.chenlu.cateringsystem.service;

import com.chenlu.cateringsystem.model.User;
import com.chenlu.cateringsystem.repository.UserRepository;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(VarcharTypeDescriptor user_id){
        return userRepository.getOne(user_id);
    }
    public User save(VarcharTypeDescriptor user_id){
        return userRepository.save(user_id);
    }
    public User delete(VarcharTypeDescriptor user_id){
        return userRepository.delete(user_id);
    }
    public User update(VarcharTypeDescriptor user_id){
        return userRepository.update(user_id);
    }

}
