package com.nexos.pruebaInventario.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CargoDTO {
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String nombre;

}
