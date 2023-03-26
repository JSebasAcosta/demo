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
    private int accountNumber;

    @Column(name = "TYPE", nullable = false)
    private String accountType;

    @Column(name = "DATE_CREATED", nullable = false)
    private String creationDate;

    @Column(name = "MONEY", nullable = false)
    private int accountFunds=0;

    //Llave foránea
    @ManyToOne
    @JoinColumn(name = "USER")
    private int user;



}

