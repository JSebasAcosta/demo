package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserEntity {
    @Id
    @Column(name = "DOCUMENT",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int document;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LAST_NAME", nullable = false)
    private String last_name;

    @Column(name = "DATE_CREATED", nullable = false)
    private String date_created;
}
