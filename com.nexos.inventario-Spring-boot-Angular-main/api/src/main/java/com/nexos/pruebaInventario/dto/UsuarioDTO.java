package com.nexos.pruebaInventario.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class UsuarioDTO {
    @Getter @Setter
    private long id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private int edad;
    @Getter @Setter
    private int cargo_id;
    @Getter @Setter
    private String fecha_ingreso;
}
