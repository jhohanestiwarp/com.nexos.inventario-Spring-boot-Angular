package com.nexos.pruebaInventario.service;


import com.nexos.pruebaInventario.dto.UsuarioDTO;
import com.nexos.pruebaInventario.models.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> getUsuario();
    public UsuarioDTO create(Usuario usuario);
}
