package com.ditoval.libertadorbackend.entity;

import jakarta.persistence.*;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcionBreve;
    @Column(columnDefinition = "TEXT")
    private String descripcionLarga;
    private double precio;

    public Categoria() {
    }

    public Categoria(String nombre, String descripcionBreve, String descripcionLarga, double precio) {
        super();
        this.nombre = nombre;
        this.descripcionBreve = descripcionBreve;
        this.descripcionLarga = descripcionLarga;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcionBreve='" + descripcionBreve + '\'' +
                ", descripcionLarga='" + descripcionLarga + '\'' +
                ", precio=" + precio +
                '}';
    }
}
