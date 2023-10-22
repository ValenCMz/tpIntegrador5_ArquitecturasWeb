package com.example.microserviciomonopatin.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Monopatin {
    @Id
    private int id_monopatin;
    @Column
    private String ubicacion;
    @Column
    private double tiempoDeUso;
    @Column
    private double kmsRecorridos;
    @Column
    private boolean disponible;
    public Monopatin(int id_monopatin, String ubicacion, double tiempoDeUso, double kmsRecorridos, boolean disponible) {
        this.id_monopatin = id_monopatin;
        this.ubicacion = ubicacion;
        this.tiempoDeUso = tiempoDeUso;
        this.kmsRecorridos = kmsRecorridos;
        this.disponible = disponible;
    }

    public Monopatin() {

    }

    public int getId_monopatin() {
        return id_monopatin;
    }

    public void setId_monopatin(int id_monopatin) {
        this.id_monopatin = id_monopatin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(double tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    public double getKmsRecorridos() {
        return kmsRecorridos;
    }

    public void setKmsRecorridos(double kmsRecorridos) {
        this.kmsRecorridos = kmsRecorridos;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
