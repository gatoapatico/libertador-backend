package com.ditoval.libertadorbackend.controller;

import com.ditoval.libertadorbackend.entity.Servicio;
import com.ditoval.libertadorbackend.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private ServicioService service;

    @PostMapping
    public Servicio addServicio(@RequestBody Servicio servicio) {
        return service.addServicio(servicio);
    }

    @GetMapping("/{id}")
    public Servicio getServicio(@PathVariable int id) {
        return service.getServicio(id);
    }

    @GetMapping
    public List<Servicio> getAllServicios() {
        return service.getAllServicios();
    }

    @PutMapping("/{id}")
    public Servicio updateServicio(@PathVariable int id, @RequestBody Servicio servicio) {
        return service.updateServicio(id, servicio);
    }

    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable int id) {
        service.deleteServicio(id);
    }
}
