package com.example.crudcompanyspringboot;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String phone;

    private LocalDateTime created_at;
    @PrePersist
    private void asignarFechaCreacion() {
        created_at = LocalDateTime.now();
    }
}
