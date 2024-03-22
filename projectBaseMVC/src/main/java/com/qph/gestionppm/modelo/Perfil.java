package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_perfil")
	private Integer idPerfil;

	@Column(name="descripcion_perfil")
	private String descripcionPerfil;

	@Column(name="estado_perfil")
	private Boolean estadoPerfil;

	@Column(name="nombre_perfil")
	private String nombrePerfil;

	//bi-directional many-to-one association to Perfilmenu
	@OneToMany(mappedBy="perfil")
	private List<Perfilmenu> perfilmenus;

	//bi-directional many-to-one association to Rolmenupermiso
	@OneToMany(mappedBy="perfil")
	private List<Rolmenupermiso> rolmenupermisos;

	//bi-directional many-to-one association to Rolperfil
	@OneToMany(mappedBy="perfil")
	private List<Rolperfil> rolperfils;

	public Perfil() {
	}

	public Integer getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcionPerfil() {
		return this.descripcionPerfil;
	}

	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}

	public Boolean getEstadoPerfil() {
		return this.estadoPerfil;
	}

	public void setEstadoPerfil(Boolean estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}

	public String getNombrePerfil() {
		return this.nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

//	public List<Perfilmenu> getPerfilmenus() {
//		return this.perfilmenus;
//	}
//
//	public void setPerfilmenus(List<Perfilmenu> perfilmenus) {
//		this.perfilmenus = perfilmenus;
//	}
//
//	public Perfilmenu addPerfilmenus(Perfilmenu perfilmenus) {
//		getPerfilmenus().add(perfilmenus);
//		perfilmenus.setPerfil(this);
//
//		return perfilmenus;
//	}
//
//	public Perfilmenu removePerfilmenus(Perfilmenu perfilmenus) {
//		getPerfilmenus().remove(perfilmenus);
//		perfilmenus.setPerfil(null);
//
//		return perfilmenus;
//	}
//
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
//		rolmenupermiso.setPerfil(this);
//
//		return rolmenupermiso;
//	}
//
//	public Rolmenupermiso removeRolmenupermiso(Rolmenupermiso rolmenupermiso) {
//		getRolmenupermisos().remove(rolmenupermiso);
//		rolmenupermiso.setPerfil(null);
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
//		rolperfil.setPerfil(this);
//
//		return rolperfil;
//	}
//
//	public Rolperfil removeRolperfil(Rolperfil rolperfil) {
//		getRolperfils().remove(rolperfil);
//		rolperfil.setPerfil(null);
//
//		return rolperfil;
//	}

}