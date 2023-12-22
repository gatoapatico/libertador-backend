package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Categoria;
import com.ditoval.libertadorbackend.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria addCategoria(Categoria categoria) {
        categoria.setId(0); //SETEO DE ID EN NULO PARA EVITAR SOBREESCRITURA DE CATEGORIAS
        return repository.save(categoria);
    }

    public Categoria getCategoria(int id) {
        return repository.findById(id).get();
    }

    public List<Categoria> getAllCategorias() {
        return repository.findAll();
    }

    public Categoria updateCategoria(int id, Categoria categoria) {
        categoria.setId(id);
        return repository.save(categoria);
    }

    public void deleteCategoria(int id) {
        repository.deleteById(id);
    }
}
