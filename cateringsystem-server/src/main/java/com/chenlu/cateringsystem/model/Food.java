package com.chenlu.cateringsystem.model;

import org.aspectj.weaver.ast.Var;
import org.hibernate.type.descriptor.sql.DecimalTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int food_id;
    @Column
    private  VarcharTypeDescriptor food_name;

    @Column
    private DecimalTypeDescriptor food_price;

    @Column
    private  int food_number;

}
