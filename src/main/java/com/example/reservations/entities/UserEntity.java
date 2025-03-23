package com.example.reservations.entities;

import com.example.reservations.entities.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record UserEntity(
        
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
    String name,
    String email,
    String password,
    @Enumerated(EnumType.STRING) Role role
        ) {

}
