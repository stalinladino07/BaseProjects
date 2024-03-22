package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the usuarioempresa database table.
 * 
 */
@Entity
@NamedQuery(name="Usuarioempresa.findAll", query="SELECT u FROM Usuarioempresa u")
public class Usuarioempresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario_empresa")
	private Integer idUsuarioEmpresa;

	private Boolean estado;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Usuarioempresa() {
	}

	public Integer getIdUsuarioEmpresa() {
		return this.idUsuarioEmpresa;
	}

	public void setIdUsuarioEmpresa(Integer idUsuarioEmpresa) {
		this.idUsuarioEmpresa = idUsuarioEmpresa;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}