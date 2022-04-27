package com.nexos.pruebaInventario.models;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;


@Entity
@Table(name="usuario")
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
    @Getter @Setter @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Length(min = 1, message = "Names cannot be empty")
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="edad")
    private Integer edad;

    @Getter @Setter
    @ManyToOne(targetEntity = Cargo.class)
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @Getter @Setter @Column(name="fecha_ingreso")
    private String fecha_ingreso;

}
