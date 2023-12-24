package com.ditoval.libertadorbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numeroHabitacion;
    private String disponibilidad;

    @JsonIgnoreProperties("habitaciones")
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, String disponibilidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", numeroHabitacion='" + numeroHabitacion + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
