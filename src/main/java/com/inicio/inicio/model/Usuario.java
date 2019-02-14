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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1879779800609082107L;
	
	@Id
	@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
	@Column(name="id_usuario")
	private Long id;
	
	@Column(name="nome_usuario")
	private String nome;
	
	@Column(name="email_usuario")
	private String email;
	
	@Column(name="cpf_usuario")
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="data_cadastro_usuario")
	private Date dataCadastroUsuario;
	
	@Column(name="status_usuario")
	private String statusUsuario;
	
	@Column(name="senha_usuario")
	private String senhaUsuario;
	
	@ManyToMany
	@JoinTable(name="usuario_perfil",
		    joinColumns={@JoinColumn(name="id_usuario", referencedColumnName="id_usuario")},
		    inverseJoinColumns={@JoinColumn(name="id_perfil", referencedColumnName="id_perfil")})
	private List<Perfil> listaPerfil;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Date getDataCadastroUsuario() {
		return dataCadastroUsuario;
	}

	public void setDataCadastroUsuario(Date dataCadastroUsuario) {
		this.dataCadastroUsuario = dataCadastroUsuario;
	}

	public List<Perfil> getListaPerfil() {
		return listaPerfil;
	}

	public void setListaPerfil(List<Perfil> listaPerfil) {
		this.listaPerfil = listaPerfil;
	}

	public String getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
	
	
}
