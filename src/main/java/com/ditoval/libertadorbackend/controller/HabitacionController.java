package com.ditoval.libertadorbackend.controller;

import com.ditoval.libertadorbackend.entity.Habitacion;
import com.ditoval.libertadorbackend.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService service;

    @PostMapping
    public Habitacion addHabitacion(@RequestBody Habitacion habitacion) {
        return service.addHabitacion(habitacion);
    }

    @GetMapping("/{id}")
    public Habitacion getHabitacion(@PathVariable int id) {
        return service.getHabitacion(id);
    }

    @GetMapping
    public List<Habitacion> getAllHabitaciones() {
        return service.getAllHabitaciones();
    }

    @PutMapping("/{id}")
    public Habitacion updateHabitacion(@PathVariable int id, @RequestBody Habitacion habitacion) {
        return service.updateHabitacion(id, habitacion);
    }

    @DeleteMapping("/{id}")
    public void deleteHabitacion(@PathVariable int id) {
        service.deleteHabitacion(id);
    }

    @GetMapping("/disponibles")
    public List<Habitacion> getHabitacionesDisponibles() {
        return service.getHabitacionesDisponibles();
    }
}
