package com.chenlu.cateringsystem.model;

import org.hibernate.type.descriptor.sql.DecimalTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private VarcharTypeDescriptor user_id;

    @Column
    private VarcharTypeDescriptor user_password;

    @Column
    private VarcharTypeDescriptor user_address;

    @Column
    private VarcharTypeDescriptor user_contact;

    @Column
    private VarcharTypeDescriptor user_type;

    @Column
    private VarcharTypeDescriptor staff_name;

    @Column
    private VarcharTypeDescriptor staff_position;

    @Column
    private DecimalTypeDescriptor staff_salary;

    @Column
    private VarcharTypeDescriptor staff_sex;

    @Column
    private Date staff_birth;

}
