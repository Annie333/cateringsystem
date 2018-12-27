package com.chenlu.cateringsystem.model;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "Desk")
public class Desk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int desk_no;

    @Column
    private VarcharTypeDescriptor desk_type;

    @Column
    private int desk_accomadatingNumber;

    @Column
    private VarcharTypeDescriptor desk_statement;

    @OneToOne
    @JoinColumn
    private int desk_orderId; //Order表order_id的外键
    private Order order;
}
