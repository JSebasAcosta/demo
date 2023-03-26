package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "TRANSACTION")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ORIGEN", nullable = false)
    private int accountNumberSender;

    @Column(name = "AMOUNT", nullable = false)
    private int moneyAmountSend;

    @Column(name = "DESTINATION", nullable = false)
    private int accountNumberReceiver;
}
