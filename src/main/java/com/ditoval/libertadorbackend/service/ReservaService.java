package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Habitacion;
import com.ditoval.libertadorbackend.entity.Reserva;
import com.ditoval.libertadorbackend.entity.Usuario;
import com.ditoval.libertadorbackend.repository.HabitacionRepository;
import com.ditoval.libertadorbackend.repository.ReservaRepository;
import com.ditoval.libertadorbackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private HabitacionRepository habitacionRepository;

    public Reserva addReserva(Reserva reserva) {
        Usuario usuario = usuarioRepository.findById(reserva.getUsuario().getId()).get();
        Habitacion habitacion = habitacionRepository.findById(reserva.getHabitacion().getId()).get();
        reserva.setId(0);
        reserva.setUsuario(usuario);
        reserva.setHabitacion(habitacion);
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
