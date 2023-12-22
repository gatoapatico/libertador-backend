package com.ditoval.libertadorbackend.controller;

import com.ditoval.libertadorbackend.entity.Categoria;
import com.ditoval.libertadorbackend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public Categoria addCategoria(@RequestBody Categoria categoria) {
        return service.addCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable int id) {
        return service.getCategoria(id);
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return service.getAllCategorias();
    }

    @PutMapping("/{id}")
    public Categoria updateCategoria(@PathVariable int id, @RequestBody Categoria categoria) {
        return service.updateCategoria(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable int id) {
        service.deleteCategoria(id);
    }
}
