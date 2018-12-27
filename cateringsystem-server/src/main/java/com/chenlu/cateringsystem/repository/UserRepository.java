package com.chenlu.cateringsystem.repository;

import com.chenlu.cateringsystem.model.User;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, VarcharTypeDescriptor> {
    Optional<User>findUserByUser_id(VarcharTypeDescriptor user_id);

    User save(VarcharTypeDescriptor user_id);

    User delete(VarcharTypeDescriptor user_id);

    User update(VarcharTypeDescriptor user_id);
}
