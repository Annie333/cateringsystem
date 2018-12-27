package com.chenlu.cateringsystem.repository;

import com.chenlu.cateringsystem.model.Desk;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeskRepository extends JpaRepository<Desk, Integer> {
    Optional<Desk> findDeskByDesk_no(int desk_no);

    Desk save(int desk_no);

    Desk delete(int desk_no);

    Desk update(int desk_no);
}
