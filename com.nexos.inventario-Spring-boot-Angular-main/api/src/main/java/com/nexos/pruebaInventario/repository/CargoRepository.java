
package com.nexos.pruebaInventario.repository;

import com.nexos.pruebaInventario.models.Cargo;
import com.nexos.pruebaInventario.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
    public List<Cargo> findAllByOrderByIdAsc();
}
