package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the perfilmenu database table.
 * 
 */
@Entity
@NamedQuery(name="Perfilmenu.findAll", query="SELECT p FROM Perfilmenu p")
public class Perfilmenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_perfil_menu")
	private Integer idPerfilMenu;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="id_menu")
	private Menu menu;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfil perfil;

	public Perfilmenu() {
	}

	public Integer getIdPerfilMenu() {
		return this.idPerfilMenu;
	}

	public void setIdPerfilMenu(Integer idPerfilMenu) {
		this.idPerfilMenu = idPerfilMenu;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}