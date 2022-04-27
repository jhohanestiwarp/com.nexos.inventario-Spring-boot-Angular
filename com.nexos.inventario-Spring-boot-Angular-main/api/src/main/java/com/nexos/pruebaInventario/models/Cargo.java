package com.nexos.pruebaInventario.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="cargo")
@ToString
@EqualsAndHashCode
public class Cargo {
    @Id
    @Getter
    @Setter
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter
    @JsonBackReference
    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Usuario> usuario = new HashSet<>();

}