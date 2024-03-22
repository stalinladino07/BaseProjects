package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the rolperfil database table.
 * 
 */
@Entity
@NamedQuery(name="Rolperfil.findAll", query="SELECT r FROM Rolperfil r")
public class Rolperfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rol_perfil")
	private Integer idRolPerfil;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfil perfil;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;

	public Rolperfil() {
	}

	public Integer getIdRolPerfil() {
		return this.idRolPerfil;
	}

	public void setIdRolPerfil(Integer idRolPerfil) {
		this.idRolPerfil = idRolPerfil;
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