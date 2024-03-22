package com.qph.gestionppm.modelo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer idUsuario;

	@Column(name="activo_usuario")
	private Boolean activoUsuario;

	@Column(name="apellido_usuario")
	private String apellidoUsuario;

	@Column(name="celular_usuario")
	private String celularUsuario;

	@Column(name="clave_usuario")
	private String claveUsuario;

	@Column(name="cliente_asociado")
	private Integer clienteAsociado;

	@Column(name="codigo_usuario")
	private String codigoUsuario;

	@Column(name="direccion_usuario")
	private String direccionUsuario;

	@Column(name="estado_usuario")
	private Boolean estadoUsuario;

	@Column(name="id_usuario_supervisor")
	private Integer idUsuarioSupervisor;

	@Column(name="link_firma")
	private String linkFirma;

	@Column(name="mail_usuario")
	private String mailUsuario;

	@Column(name="nombre_usuario")
	private String nombreUsuario;

	@Column(name="reset_clave")
	private Boolean resetClave;

	@Column(name="secu_usua")
	private Integer secuUsua;

	@Column(name="telefono_usuario")
	private String telefonoUsuario;

	@Column(name="tiene_supervisor")
	private Boolean tieneSupervisor;

	@Column(name="usuario_facturacion")
	private Boolean usuarioFacturacion;

	@Column(name="validacion_correo")
	private Boolean validacionCorreo;

	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="usuario")
//	private List<Cliente> clientes;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
    @JoinColumn(name = "area_departamento", referencedColumnName = "id_catalogo")
	private Catalogo area_departamento;
	
	@ManyToOne
    @JoinColumn(name = "cargo_usuario", referencedColumnName = "id_catalogo")
	private Catalogo cargo_usuario;

//
	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="ciudad" , referencedColumnName = "id_catalogo")
	private Catalogo ciudad;
//
//	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="pais" , referencedColumnName = "id_catalogo")
	private Catalogo pais;
//
//	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="tipo_usuario" , referencedColumnName = "id_catalogo")
	private Catalogo tipo_usuario;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;

	//bi-directional many-to-one association to Usuarioempresa
	@OneToMany(mappedBy="usuario")
	private List<Usuarioempresa> usuarioempresas;

//	public Catalogo getArea_departamento() {
//		return area_departamento;
//	}
//
//	public void setArea_departamento(Catalogo area_departamento) {
//		this.area_departamento = area_departamento;
//	}

	public Usuario() {
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Boolean getActivoUsuario() {
		return this.activoUsuario;
	}

	public void setActivoUsuario(Boolean activoUsuario) {
		this.activoUsuario = activoUsuario;
	}

	public String getApellidoUsuario() {
		return this.apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getCelularUsuario() {
		return this.celularUsuario;
	}

	public void setCelularUsuario(String celularUsuario) {
		this.celularUsuario = celularUsuario;
	}

	public String getClaveUsuario() {
		return this.claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public Integer getClienteAsociado() {
		return this.clienteAsociado;
	}

	public void setClienteAsociado(Integer clienteAsociado) {
		this.clienteAsociado = clienteAsociado;
	}

	public String getCodigoUsuario() {
		return this.codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getDireccionUsuario() {
		return this.direccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	public Boolean getEstadoUsuario() {
		return this.estadoUsuario;
	}

	public void setEstadoUsuario(Boolean estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public Integer getIdUsuarioSupervisor() {
		return this.idUsuarioSupervisor;
	}

	public void setIdUsuarioSupervisor(Integer idUsuarioSupervisor) {
		this.idUsuarioSupervisor = idUsuarioSupervisor;
	}

	public String getLinkFirma() {
		return this.linkFirma;
	}

	public void setLinkFirma(String linkFirma) {
		this.linkFirma = linkFirma;
	}

	public String getMailUsuario() {
		return this.mailUsuario;
	}

	public void setMailUsuario(String mailUsuario) {
		this.mailUsuario = mailUsuario;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Boolean getResetClave() {
		return this.resetClave;
	}

	public void setResetClave(Boolean resetClave) {
		this.resetClave = resetClave;
	}

	public Integer getSecuUsua() {
		return this.secuUsua;
	}

	public void setSecuUsua(Integer secuUsua) {
		this.secuUsua = secuUsua;
	}

	public String getTelefonoUsuario() {
		return this.telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Boolean getTieneSupervisor() {
		return this.tieneSupervisor;
	}

	public void setTieneSupervisor(Boolean tieneSupervisor) {
		this.tieneSupervisor = tieneSupervisor;
	}

	public Boolean getUsuarioFacturacion() {
		return this.usuarioFacturacion;
	}

	public void setUsuarioFacturacion(Boolean usuarioFacturacion) {
		this.usuarioFacturacion = usuarioFacturacion;
	}

	public Boolean getValidacionCorreo() {
		return this.validacionCorreo;
	}

	public void setValidacionCorreo(Boolean validacionCorreo) {
		this.validacionCorreo = validacionCorreo;
	}

	public Catalogo getArea_departamento() {
		return area_departamento;
	}

	public void setArea_departamento(Catalogo area_departamento) {
		this.area_departamento = area_departamento;
	}

	public Catalogo getCargo_usuario() {
		return cargo_usuario;
	}

	public void setCargo_usuario(Catalogo cargo_usuario) {
		this.cargo_usuario = cargo_usuario;
	}

	public Catalogo getCiudad() {
		return ciudad;
	}

	public void setCiudad(Catalogo ciudad) {
		this.ciudad = ciudad;
	}

	public Catalogo getPais() {
		return pais;
	}

	public void setPais(Catalogo pais) {
		this.pais = pais;
	}

	public Catalogo getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(Catalogo tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	

//	public List<Cliente> getClientes() {
//		return this.clientes;
//	}
//
//	public void setClientes(List<Cliente> clientes) {
//		this.clientes = clientes;
//	}
//
//	public Cliente addCliente(Cliente cliente) {
//		getClientes().add(cliente);
//		cliente.setUsuario(this);
//
//		return cliente;
//	}
//
//	public Cliente removeCliente(Cliente cliente) {
//		getClientes().remove(cliente);
//		cliente.setUsuario(null);
//
//		return cliente;
//	}

//	public Catalogo getAreaDepartamento() {
//		return this.area_departamento;
//	}
//
//	public void setAreaDepartamento(Catalogo area_departamento) {
//		this.area_departamento = area_departamento;
//	}

//	public Catalogo getCatalogo2() {
//		return this.catalogo2;
//	}
//
//	public void setCatalogo2(Catalogo catalogo2) {
//		this.catalogo2 = catalogo2;
//	}
//
//	public Catalogo getCatalogo3() {
//		return this.catalogo3;
//	}
//
//	public void setCatalogo3(Catalogo catalogo3) {
//		this.catalogo3 = catalogo3;
//	}
//
//	public Catalogo getCatalogo4() {
//		return this.catalogo4;
//	}
//
//	public void setCatalogo4(Catalogo catalogo4) {
//		this.catalogo4 = catalogo4;
//	}
//
//	public Catalogo getCatalogo5() {
//		return this.catalogo5;
//	}
//
//	public void setCatalogo5(Catalogo catalogo5) {
//		this.catalogo5 = catalogo5;
//	}

//	public Rol getRol() {
//		return this.rol;
//	}
//
//	public void setRol(Rol rol) {
//		this.rol = rol;
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
//		usuarioempresa.setUsuario(this);
//
//		return usuarioempresa;
//	}
//
//	public Usuarioempresa removeUsuarioempresa(Usuarioempresa usuarioempresa) {
//		getUsuarioempresas().remove(usuarioempresa);
//		usuarioempresa.setUsuario(null);
//
//		return usuarioempresa;
//	}

}