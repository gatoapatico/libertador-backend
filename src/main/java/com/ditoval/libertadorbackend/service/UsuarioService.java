package com.ditoval.libertadorbackend.service;

import com.ditoval.libertadorbackend.entity.Usuario;
import com.ditoval.libertadorbackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario addUsuario(Usuario usuario) {
        usuario.setId(0);   //SETEO DE ID EN NULO PARA EVITAR SOBREESCRITURA DE USUARIOS
        return repository.save(usuario);
    }

    public Usuario getUsuario(int id) {
        return repository.findById(id).get();
    }

    public List<Usuario> getAllUsuarios() {
        return repository.findAll();
    }

    public Usuario updateUsuario(int id, Usuario usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }

    public void deleteUsuario(int id) {
        repository.deleteById(id);
    }
}
