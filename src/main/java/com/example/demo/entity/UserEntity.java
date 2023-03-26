package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCUMENT")
    private Integer UserID;

    @Column(name = "NAME")
    private String userName;

    @Column(name = "LAST_NAME")
    private String userLastName;

    @Column(name = "DATE_CREATED")
    private String creationDate;
}
