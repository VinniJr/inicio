package com.inicio.inicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inicio.inicio.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
	

	@Query(value ="SELECT pf.* from usuario usu join usuario_perfil upf on upf .id_usuario = usu.id_usuario join perfil pf "
			+ "on upf.id_perfil = pf.id_perfil where usu.cpf_usuario = :cpf", nativeQuery=true)
    public Perfil perfilUsuario(@Param("cpf") String cpf);
}
