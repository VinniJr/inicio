package com.inicio.inicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inicio.inicio.model.Usuario;
import com.inicio.inicio.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Usuario findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Usuario save(Usuario post) {
		return repository.saveAndFlush(post);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public Usuario buscarClientePorCPF(String cpf) {
		return repository.buscarClientePorCPF(cpf);
	}

}
