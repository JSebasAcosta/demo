package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCUMENT")
    private int document;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "DATE_CREATED")
    private String date_created;
}
