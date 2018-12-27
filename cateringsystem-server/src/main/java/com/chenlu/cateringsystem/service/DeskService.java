package com.chenlu.cateringsystem.service;

import com.chenlu.cateringsystem.model.Desk;
import com.chenlu.cateringsystem.repository.DeskRepository;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;

    public Desk getDesk(int desk_no){
        return deskRepository.getOne(desk_no);
    }
    public Desk save(int desk_no){
        return deskRepository.save(desk_no);
    }
    public Desk delete(int desk_no){
        return deskRepository.delete(desk_no);
    }
    public Desk update(int desk_no){
        return deskRepository.update(desk_no);
    }

}
