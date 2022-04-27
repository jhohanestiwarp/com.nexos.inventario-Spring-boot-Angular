package com.nexos.pruebaInventario.controllers;


import com.nexos.pruebaInventario.dto.UsuarioDTO;
import com.nexos.pruebaInventario.models.Usuario;

import com.nexos.pruebaInventario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "api/usuarios",method = RequestMethod.GET)
    public  ResponseEntity<List<Usuario>> getUsuario(){
        try {
            return ResponseEntity.ok(usuarioService.getUsuario());
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
    @RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
    public ResponseEntity<UsuarioDTO> createUser(@Valid @RequestBody Usuario usuario) {
        UsuarioDTO savedUser = usuarioService.create(usuario);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/usuarios/" + String.valueOf(savedUser.getId()));

        ResponseEntity<UsuarioDTO> response = new ResponseEntity<UsuarioDTO>(savedUser, headers, HttpStatus.CREATED);
        return response;
    }
}
