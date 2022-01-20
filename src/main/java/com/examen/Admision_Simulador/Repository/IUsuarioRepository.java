package com.examen.Admision_Simulador.Repository;

import com.examen.Admision_Simulador.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);
}
