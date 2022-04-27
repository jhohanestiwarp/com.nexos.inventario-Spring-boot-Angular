package com.nexos.pruebaInventario.repository;

import com.nexos.pruebaInventario.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public List<Usuario> findAllByOrderByIdAsc();
}
