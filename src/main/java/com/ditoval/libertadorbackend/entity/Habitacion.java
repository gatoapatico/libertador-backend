package com.ditoval.libertadorbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "habitacion_id")
    @JsonIgnoreProperties("habitacion")
    private List<Reserva> reservas = new ArrayList<>();

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

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", numeroHabitacion='" + numeroHabitacion + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", categoria=" + categoria +
                ", reservas=" + reservas +
                '}';
    }

    public List<Date> fechasReservadas() {
        List<Date> fechas = new ArrayList<>();
        if(reservas != null) {
            for(Reserva reserva : reservas) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(reserva.getCheckIn());
                while (!calendar.getTime().after(reserva.getCheckOut())) {
                    fechas.add(calendar.getTime());
                    calendar.add(Calendar.DATE, 1);
                }
            }
        }
        return fechas;
    }

    private String formatearFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }

    public List<String> getFechasReservadas() {
        List<Date> fechas = fechasReservadas();
        List<String> fechasFormateadas = new ArrayList<>();
        for(Date fecha : fechas) {
            fechasFormateadas.add(formatearFecha(fecha));
        }
        return fechasFormateadas;
    }
}
