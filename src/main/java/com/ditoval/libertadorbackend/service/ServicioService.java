package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Servicio;
import com.ditoval.libertadorbackend.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository repository;

    public Servicio addServicio(Servicio servicio) {
        servicio.setId(0); //SETEO DE ID EN NULO PARA EVITAR SOBREESCRITURA DE SERVICIOS
        return repository.save(servicio);
    }

    public Servicio getServicio(int id) {
        return repository.findById(id).get();
    }

    public List<Servicio> getAllServicios() {
        return repository.findAll();
    }

    public Servicio updateServicio(int id, Servicio servicio) {
        servicio.setId(id);
        return repository.save(servicio);
    }

    public void deleteServicio(int id) {
        repository.deleteById(id);
    }
}
