package com.nexos.pruebaInventario.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@EqualsAndHashCode
public class MercanciaDTO {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private int producto_id;
    @Getter @Setter
    private Integer cantidad;
    @Getter @Setter
    private String fecha_ingreso;
    @Getter @Setter
    private int usuario_id;
}
