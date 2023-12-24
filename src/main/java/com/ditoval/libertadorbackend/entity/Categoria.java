package com.ditoval.libertadorbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private List<Imagen> imagenes = new ArrayList<>();

    @JsonIgnoreProperties("categoria")
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Habitacion> habitaciones;

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

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcionBreve='" + descripcionBreve + '\'' +
                ", descripcionLarga='" + descripcionLarga + '\'' +
                ", precio=" + precio +
                ", imagenes=" + imagenes +
                ", habitaciones=" + habitaciones +
                '}';
    }
}
