package com.inicio.inicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inicio.inicio.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query("SELECT usu FROM Usuario usu WHERE cpf = :cpf")
	public Usuario buscarClientePorCPF(@Param("cpf") String cpf);

}
