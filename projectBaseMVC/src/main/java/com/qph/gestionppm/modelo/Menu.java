package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the menu database table.
 * 
 */
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_menu")
	private Integer idMenu;

	@Column(name="estado_menu")
	private Boolean estadoMenu;

	@Column(name="id_menu_padre")
	private Integer idMenuPadre;

	@Column(name="nombre_menu")
	private String nombreMenu;

	@Column(name="nombre_pagina_menu")
	private String nombrePaginaMenu;

	@Column(name="orden_menu")
	private Integer ordenMenu;

	//bi-directional many-to-one association to Perfilmenu
	@OneToMany(mappedBy="menu")
	private List<Perfilmenu> perfilmenus;

	//bi-directional many-to-one association to Rolmenupermiso
	@OneToMany(mappedBy="menu")
	private List<Rolmenupermiso> rolmenupermisos;

	public Menu() {
	}

	public Integer getIdMenu() {
		return this.idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public Boolean getEstadoMenu() {
		return this.estadoMenu;
	}

	public void setEstadoMenu(Boolean estadoMenu) {
		this.estadoMenu = estadoMenu;
	}

	public Integer getIdMenuPadre() {
		return this.idMenuPadre;
	}

	public void setIdMenuPadre(Integer idMenuPadre) {
		this.idMenuPadre = idMenuPadre;
	}

	public String getNombreMenu() {
		return this.nombreMenu;
	}

	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}

	public String getNombrePaginaMenu() {
		return this.nombrePaginaMenu;
	}

	public void setNombrePaginaMenu(String nombrePaginaMenu) {
		this.nombrePaginaMenu = nombrePaginaMenu;
	}

	public Integer getOrdenMenu() {
		return this.ordenMenu;
	}

	public void setOrdenMenu(Integer ordenMenu) {
		this.ordenMenu = ordenMenu;
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
//		perfilmenus.setMenu(this);
//
//		return perfilmenus;
//	}
//
//	public Perfilmenu removePerfilmenus(Perfilmenu perfilmenus) {
//		getPerfilmenus().remove(perfilmenus);
//		perfilmenus.setMenu(null);
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
//		rolmenupermiso.setMenu(this);
//
//		return rolmenupermiso;
//	}
//
//	public Rolmenupermiso removeRolmenupermiso(Rolmenupermiso rolmenupermiso) {
//		getRolmenupermisos().remove(rolmenupermiso);
//		rolmenupermiso.setMenu(null);
//
//		return rolmenupermiso;
//	}

}