package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rolmenupermiso database table.
 * 
 */
@Entity
@NamedQuery(name="Rolmenupermiso.findAll", query="SELECT r FROM Rolmenupermiso r")
public class Rolmenupermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idrolmenupermiso;

	private Timestamp createdat;

	private Integer createdby;

	private Boolean estado;

	private Timestamp updatedat;

	private Integer updatedby;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="id_catalogo")
	private Catalogo catalogo;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="id_menu")
	private Menu menu;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfil perfil;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;

	public Rolmenupermiso() {
	}

	public Integer getIdrolmenupermiso() {
		return this.idrolmenupermiso;
	}

	public void setIdrolmenupermiso(Integer idrolmenupermiso) {
		this.idrolmenupermiso = idrolmenupermiso;
	}

	public Timestamp getCreatedat() {
		return this.createdat;
	}

	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}

	public Integer getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Timestamp getUpdatedat() {
		return this.updatedat;
	}

	public void setUpdatedat(Timestamp updatedat) {
		this.updatedat = updatedat;
	}

	public Integer getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
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

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}