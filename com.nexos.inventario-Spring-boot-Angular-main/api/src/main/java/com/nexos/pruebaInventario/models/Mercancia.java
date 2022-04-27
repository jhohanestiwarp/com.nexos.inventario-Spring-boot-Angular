package com.nexos.pruebaInventario.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="usuario")
@ToString
@EqualsAndHashCode
public class Mercancia {
    @Id
    @Getter
    @Setter
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="producto_id")
    private Integer producto_id;
    @Getter @Setter @Column(name="cantidad")
    private Integer cantidad;

    @Getter @Setter @Column(name="fecha_ingreso")
    private String fecha_ingreso;

    @Getter @Setter @Column(name="usuario_id")
    private Integer usuario_id;

}