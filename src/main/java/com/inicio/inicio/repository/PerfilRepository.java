package com.inicio.inicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inicio.inicio.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
