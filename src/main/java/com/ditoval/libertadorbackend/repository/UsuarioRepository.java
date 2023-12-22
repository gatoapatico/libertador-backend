package com.ditoval.libertadorbackend.repository;

import com.ditoval.libertadorbackend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.email = :email AND u.password = :password")
    Usuario getUsuarioLoggingData(@Param("email") String email, @Param("password") String password);
}
