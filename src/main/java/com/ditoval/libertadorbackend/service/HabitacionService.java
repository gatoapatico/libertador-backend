package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Habitacion;
import com.ditoval.libertadorbackend.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository repository;

    public Habitacion addHabitacion(Habitacion habitacion) {
        habitacion.setId(0);
        return repository.save(habitacion);
    }

    public Habitacion getHabitacion(int id) {
        return repository.findById(id).get();
    }

    public List<Habitacion> getAllHabitaciones() {
        return repository.findAll();
    }

    public Habitacion updateHabitacion(int id, Habitacion habitacion) {
        habitacion.setId(id);
        return repository.save(habitacion);
    }

    public void deleteHabitacion(int id) {
        repository.deleteById(id);
    }

    public List<Habitacion> getHabitacionesDisponibles(Date checkin, Date checkout) {
        List<Habitacion> habitaciones = repository.findAll();

        habitaciones.removeIf(habitacion ->
                habitacion.fechasReservadas().stream()
                        .anyMatch(fechaReservada ->
                                !(checkin.after(fechaReservada) || checkout.before(fechaReservada)))
        );
        return habitaciones;
    }
}
