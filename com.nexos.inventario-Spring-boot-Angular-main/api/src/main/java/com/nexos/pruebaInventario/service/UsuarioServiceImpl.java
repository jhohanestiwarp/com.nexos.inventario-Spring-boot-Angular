package com.nexos.pruebaInventario.service;

import com.nexos.pruebaInventario.dto.UsuarioDTO;
import com.nexos.pruebaInventario.models.Usuario;
import com.nexos.pruebaInventario.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuario() {
        return usuarioRepository.findAllByOrderByIdAsc();
    }

    @Override
    public UsuarioDTO create(Usuario usuario) {
        Usuario registro = usuarioRepository.save(usuario);
        return toDTO(registro);
    }


    private UsuarioDTO toDTO(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioDTO.class);
    }
}
