package com.ditoval.libertadorbackend.controller;

import com.ditoval.libertadorbackend.entity.Usuario;
import com.ditoval.libertadorbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        return service.addUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        return service.getUsuario(id);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return service.getAllUsuarios();
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        return service.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable int id) {
        service.deleteUsuario(id);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Map<String, Object> body) {
        String email = (String) body.get("email");
        String password = (String) body.get("password");
        return service.login(email, password);
    }
}
