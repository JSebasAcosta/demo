package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "ACCOUNT")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountEntity {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "DATE_CREATED", nullable = false)
    private String date_created;

    @Column(name = "MONEY", nullable = false)
    private int money=0;

    //Llave foránea
    //@ManyToOne
    @Column(name = "USER")
    private int user;



}

