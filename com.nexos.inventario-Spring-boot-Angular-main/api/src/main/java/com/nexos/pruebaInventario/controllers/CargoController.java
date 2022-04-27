package com.nexos.pruebaInventario.controllers;

import com.nexos.pruebaInventario.dto.CargoDTO;
import com.nexos.pruebaInventario.models.Cargo;
import com.nexos.pruebaInventario.repository.CargoRepository;
import com.nexos.pruebaInventario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @RequestMapping(value = "api/cargos",method = RequestMethod.GET)
    public ResponseEntity<List<Cargo>> getUsuario(){
        ResponseEntity<List<Cargo>> cargos = ResponseEntity.ok(cargoRepository.findAllByOrderByIdAsc());
        return cargos;
    }
}
