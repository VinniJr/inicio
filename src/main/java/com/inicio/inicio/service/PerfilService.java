package com.inicio.inicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inicio.inicio.model.Perfil;
import com.inicio.inicio.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	private PerfilRepository repository;
	
	public List<Perfil> findAll() {
		return repository.findAll();
	}
	
	public Perfil findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Perfil save(Perfil post) {
		return repository.saveAndFlush(post);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
