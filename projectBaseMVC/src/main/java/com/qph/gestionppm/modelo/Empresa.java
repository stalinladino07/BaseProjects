package com.qph.gestionppm.modelo;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa")
	private Integer idEmpresa;

	@Column(name="cedula_ruc_pasaporte")
	private String cedulaRucPasaporte;

	@Column(name="clave_correo")
	private String claveCorreo;

	@Column(name="correo_empresa")
	private String correoEmpresa;

	private String direccion;

	private String establecimiento;

	@Column(name="estado_empresa")
	private Boolean estadoEmpresa;

	@Column(name="nombre_comercial")
	private String nombreComercial;

	@Column(name="pagina_web")
	private String paginaWeb;

	@Column(name="path_logo_empresa")
	private String pathLogoEmpresa;

	@Column(name="razon_social")
	private String razonSocial;

	@Column(name="representante_legal")
	private String representanteLegal;

	private String telefono;

	//bi-directional many-to-one association to Catalogo
//	@OneToMany(mappedBy="empresa")
//	private List<Catalogo> catalogos;

	//bi-directional many-to-one association to Organigrama
//	@OneToMany(mappedBy="empresa")
//	private List<Organigrama> organigramas;
//
//	//bi-directional many-to-one association to Puntosemision
//	@OneToMany(mappedBy="empresa")
//	private List<Puntosemision> puntosemisions;
//
//	//bi-directional many-to-one association to Tarifario
//	@OneToMany(mappedBy="empresa")
//	private List<Tarifario> tarifarios;
//
//	//bi-directional many-to-one association to Tiponotificacion
//	@OneToMany(mappedBy="empresa")
//	private List<Tiponotificacion> tiponotificacions;
//
	//bi-directional many-to-one association to Usuarioempresa
	@OneToMany(mappedBy="empresa")
	private List<Usuarioempresa> usuarioempresas;

	public Empresa() {
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getCedulaRucPasaporte() {
		return this.cedulaRucPasaporte;
	}

	public void setCedulaRucPasaporte(String cedulaRucPasaporte) {
		this.cedulaRucPasaporte = cedulaRucPasaporte;
	}

	public String getClaveCorreo() {
		return this.claveCorreo;
	}

	public void setClaveCorreo(String claveCorreo) {
		this.claveCorreo = claveCorreo;
	}

	public String getCorreoEmpresa() {
		return this.correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Boolean getEstadoEmpresa() {
		return this.estadoEmpresa;
	}

	public void setEstadoEmpresa(Boolean estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getPaginaWeb() {
		return this.paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getPathLogoEmpresa() {
		return this.pathLogoEmpresa;
	}

	public void setPathLogoEmpresa(String pathLogoEmpresa) {
		this.pathLogoEmpresa = pathLogoEmpresa;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRepresentanteLegal() {
		return this.representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

//	public List<Catalogo> getCatalogos() {
//		return this.catalogos;
//	}
//
//	public void setCatalogos(List<Catalogo> catalogos) {
//		this.catalogos = catalogos;
//	}

//	public Catalogo addCatalogo(Catalogo catalogo) {
//		getCatalogos().add(catalogo);
//		catalogo.setEmpresa(this);
//
//		return catalogo;
//	}
//
//	public Catalogo removeCatalogo(Catalogo catalogo) {
//		getCatalogos().remove(catalogo);
//		catalogo.setEmpresa(null);
//
//		return catalogo;
//	}

//	public List<Organigrama> getOrganigramas() {
//		return this.organigramas;
//	}
//
//	public void setOrganigramas(List<Organigrama> organigramas) {
//		this.organigramas = organigramas;
//	}
//
//	public Organigrama addOrganigrama(Organigrama organigrama) {
//		getOrganigramas().add(organigrama);
//		organigrama.setEmpresa(this);
//
//		return organigrama;
//	}
//
//	public Organigrama removeOrganigrama(Organigrama organigrama) {
//		getOrganigramas().remove(organigrama);
//		organigrama.setEmpresa(null);
//
//		return organigrama;
//	}
//
//	public List<Puntosemision> getPuntosemisions() {
//		return this.puntosemisions;
//	}
//
//	public void setPuntosemisions(List<Puntosemision> puntosemisions) {
//		this.puntosemisions = puntosemisions;
//	}
//
//	public Puntosemision addPuntosemision(Puntosemision puntosemision) {
//		getPuntosemisions().add(puntosemision);
//		puntosemision.setEmpresa(this);
//
//		return puntosemision;
//	}
//
//	public Puntosemision removePuntosemision(Puntosemision puntosemision) {
//		getPuntosemisions().remove(puntosemision);
//		puntosemision.setEmpresa(null);
//
//		return puntosemision;
//	}
//
//	public List<Tarifario> getTarifarios() {
//		return this.tarifarios;
//	}
//
//	public void setTarifarios(List<Tarifario> tarifarios) {
//		this.tarifarios = tarifarios;
//	}
//
//	public Tarifario addTarifario(Tarifario tarifario) {
//		getTarifarios().add(tarifario);
//		tarifario.setEmpresa(this);
//
//		return tarifario;
//	}
//
//	public Tarifario removeTarifario(Tarifario tarifario) {
//		getTarifarios().remove(tarifario);
//		tarifario.setEmpresa(null);
//
//		return tarifario;
//	}
//
//	public List<Tiponotificacion> getTiponotificacions() {
//		return this.tiponotificacions;
//	}
//
//	public void setTiponotificacions(List<Tiponotificacion> tiponotificacions) {
//		this.tiponotificacions = tiponotificacions;
//	}
//
//	public Tiponotificacion addTiponotificacion(Tiponotificacion tiponotificacion) {
//		getTiponotificacions().add(tiponotificacion);
//		tiponotificacion.setEmpresa(this);
//
//		return tiponotificacion;
//	}
//
//	public Tiponotificacion removeTiponotificacion(Tiponotificacion tiponotificacion) {
//		getTiponotificacions().remove(tiponotificacion);
//		tiponotificacion.setEmpresa(null);
//
//		return tiponotificacion;
//	}
//
//	public List<Usuarioempresa> getUsuarioempresas() {
//		return this.usuarioempresas;
//	}
//
//	public void setUsuarioempresas(List<Usuarioempresa> usuarioempresas) {
//		this.usuarioempresas = usuarioempresas;
//	}
//
//	public Usuarioempresa addUsuarioempresa(Usuarioempresa usuarioempresa) {
//		getUsuarioempresas().add(usuarioempresa);
//		usuarioempresa.setEmpresa(this);
//
//		return usuarioempresa;
//	}
//
//	public Usuarioempresa removeUsuarioempresa(Usuarioempresa usuarioempresa) {
//		getUsuarioempresas().remove(usuarioempresa);
//		usuarioempresa.setEmpresa(null);
//
//		return usuarioempresa;
//	}

}