package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Reserva;
import com.ditoval.libertadorbackend.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public Reserva addReserva(Reserva reserva) {
        reserva.setId(0); //SETEO DE ID EN NULO PARA EVITAR SOBREESCRITURA DE RESERVAS
        return repository.save(reserva);
    }

    public Reserva getReserva(int id) {
        return repository.findById(id).get();
    }

    public List<Reserva> getAllReservas() {
        return repository.findAll();
    }

    public Reserva updateReserva(int id, Reserva reserva) {
        reserva.setId(id);
        return repository.save(reserva);
    }

    public void deleteReserva(int id) {
        repository.deleteById(id);
    }
}
