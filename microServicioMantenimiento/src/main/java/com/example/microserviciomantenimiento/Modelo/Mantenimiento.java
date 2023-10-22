package com.example.microserviciomantenimiento.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mantenimiento {
    @Id
    private int id_mantenimiento;
    @Column
    private String encargado;
    @ElementCollection
    @CollectionTable(name = "mantenimiento_monopatines", joinColumns = @JoinColumn(name = "mantenimiento_id"))
    @Column(name = "monopatin_id")
    private List<Long> monopatines;
}
