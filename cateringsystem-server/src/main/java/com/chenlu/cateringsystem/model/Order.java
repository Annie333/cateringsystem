package com.chenlu.cateringsystem.model;

import org.aspectj.weaver.ast.Var;
import org.hibernate.type.descriptor.sql.DecimalTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @ManyToOne
    @JoinColumn
    private VarcharTypeDescriptor order_custId; //User表User_id的外键
    private User user;

    @OneToMany
    @JoinColumn
    private VarcharTypeDescriptor order_food;//Food表Food_id的外键
    private Food food;

    @Column
    private DecimalTypeDescriptor order_allPrice;

    @Column
    private VarcharTypeDescriptor order_remarks;

    @Column
    private VarcharTypeDescriptor order_statement;

    @Column
    private VarcharTypeDescriptor order_type;

    @Column
    private VarcharTypeDescriptor order_address;

}
