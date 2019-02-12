package com.inicio.inicio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "perfil")
public class Perfil implements Serializable{

	private static final long serialVersionUID = -6864496374836984383L;
	
	@Id
	@SequenceGenerator(name = "perfil_seq", sequenceName = "perfil_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfil_seq")
	@Column(name="id_perfil")
	private Long id;
	
	@Column(name="desc_perfil")
	private String descPerfil;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "Data é uma informação obrigatória.")
	@Column(name="data_cadastro_perfil", nullable = false)
	private Date dataCadastroUsuario;
	
	@Column(name="status_perfil")
	private String statusPerfil;
	
	@ManyToMany
	@JoinTable(name="usuario_perfil",
		    joinColumns={@JoinColumn(name="id_perfil", referencedColumnName="id_perfil")},
		    inverseJoinColumns={@JoinColumn(name="id_usuario", referencedColumnName="id_usuario")})
	private List<Usuario> listaUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescPerfil() {
		return descPerfil;
	}

	public void setDescPerfil(String descPerfil) {
		this.descPerfil = descPerfil;
	}

	public Date getDataCadastroUsuario() {
		return dataCadastroUsuario;
	}

	public void setDataCadastroUsuario(Date dataCadastroUsuario) {
		this.dataCadastroUsuario = dataCadastroUsuario;
	}


	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public String getStatusPerfil() {
		return statusPerfil;
	}

	public void setStatusPerfil(String statusPerfil) {
		this.statusPerfil = statusPerfil;
	}
	

}
