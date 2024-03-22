package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rol")
	private Integer idRol;

	@Column(name="descripcion_rol")
	private String descripcionRol;

	@Column(name="estado_rol")
	private Boolean estadoRol;

	@Column(name="nombre_rol")
	private String nombreRol;

	//bi-directional many-to-one association to Rolmenupermiso
	@OneToMany(mappedBy="rol")
	private List<Rolmenupermiso> rolmenupermisos;

	//bi-directional many-to-one association to Rolperfil
	@OneToMany(mappedBy="rol")
	private List<Rolperfil> rolperfils;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="rol")
	private List<Usuario> usuarios;

	public Rol() {
	}

	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getDescripcionRol() {
		return this.descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public Boolean getEstadoRol() {
		return this.estadoRol;
	}

	public void setEstadoRol(Boolean estadoRol) {
		this.estadoRol = estadoRol;
	}

	public String getNombreRol() {
		return this.nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

//	public List<Rolmenupermiso> getRolmenupermisos() {
//		return this.rolmenupermisos;
//	}
//
//	public void setRolmenupermisos(List<Rolmenupermiso> rolmenupermisos) {
//		this.rolmenupermisos = rolmenupermisos;
//	}
//
//	public Rolmenupermiso addRolmenupermiso(Rolmenupermiso rolmenupermiso) {
//		getRolmenupermisos().add(rolmenupermiso);
//		rolmenupermiso.setRol(this);
//
//		return rolmenupermiso;
//	}
//
//	public Rolmenupermiso removeRolmenupermiso(Rolmenupermiso rolmenupermiso) {
//		getRolmenupermisos().remove(rolmenupermiso);
//		rolmenupermiso.setRol(null);
//
//		return rolmenupermiso;
//	}
//
//	public List<Rolperfil> getRolperfils() {
//		return this.rolperfils;
//	}
//
//	public void setRolperfils(List<Rolperfil> rolperfils) {
//		this.rolperfils = rolperfils;
//	}
//
//	public Rolperfil addRolperfil(Rolperfil rolperfil) {
//		getRolperfils().add(rolperfil);
//		rolperfil.setRol(this);
//
//		return rolperfil;
//	}
//
//	public Rolperfil removeRolperfil(Rolperfil rolperfil) {
//		getRolperfils().remove(rolperfil);
//		rolperfil.setRol(null);
//
//		return rolperfil;
//	}
//
//	public List<Usuario> getUsuarios() {
//		return this.usuarios;
//	}
//
//	public void setUsuarios(List<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}
//
//	public Usuario addUsuario(Usuario usuario) {
//		getUsuarios().add(usuario);
//		usuario.setRol(this);
//
//		return usuario;
//	}
//
//	public Usuario removeUsuario(Usuario usuario) {
//		getUsuarios().remove(usuario);
//		usuario.setRol(null);
//
//		return usuario;
//	}

}