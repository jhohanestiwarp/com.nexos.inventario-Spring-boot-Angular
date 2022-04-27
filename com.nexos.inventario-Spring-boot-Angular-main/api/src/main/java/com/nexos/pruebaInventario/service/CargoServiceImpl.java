package com.nexos.pruebaInventario.service;

import com.nexos.pruebaInventario.dto.CargoDTO;
import com.nexos.pruebaInventario.models.Cargo;
import com.nexos.pruebaInventario.repository.CargoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CargoServiceImpl{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    CargoRepository cargoRepository;


    public List<CargoDTO> getcargo() {
        return cargoRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private CargoDTO toDTO(Cargo cargo) {

        return modelMapper.map(cargo, CargoDTO.class);
    }

}
