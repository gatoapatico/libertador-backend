package com.ditoval.libertadorbackend.controller;

import com.ditoval.libertadorbackend.entity.Reserva;
import com.ditoval.libertadorbackend.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://libertadorhotel.netlify.app/")
@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @PostMapping
    public Reserva addReserva(@RequestBody Reserva reserva) {
        return service.addReserva(reserva);
    }

    @GetMapping("/{id}")
    public Reserva getReserva(@PathVariable int id) {
        return service.getReserva(id);
    }

    @GetMapping
    public List<Reserva> getAllReservas() {
        return service.getAllReservas();
    }

    @PutMapping("/{id}")
    public Reserva updateReserva(@PathVariable int id, @RequestBody Reserva reserva) {
        return service.updateReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteReserva(@PathVariable int id) {
        service.deleteReserva(id);
    }
}
