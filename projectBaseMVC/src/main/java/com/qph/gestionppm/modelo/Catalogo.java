package com.qph.gestionppm.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the catalogo database table.
 * 
 */
@Entity
@NamedQuery(name="Catalogo.findAll", query="SELECT c FROM Catalogo c")
public class Catalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_catalogo")
	private Integer idCatalogo;

	@Column(name="codigo_catalogo")
	private String codigoCatalogo;

	@Column(name="descripcion_catalogo")
	private String descripcionCatalogo;

	private Boolean eliminado;

	@Column(name="estado_catalogo")
	private Boolean estadoCatalogo;

	@Column(name="id_catalogo_padre")
	private Integer idCatalogoPadre;

	@Column(name="nombre_catalgo")
	private String nombreCatalgo;
//
//	//bi-directional many-to-one association to Asignacionsolicitude
//	@OneToMany(mappedBy="catalogo1")
//	private List<Asignacionsolicitude> asignacionsolicitudes1;
//
//	//bi-directional many-to-one association to Asignacionsolicitude
//	@OneToMany(mappedBy="catalogo2")
//	private List<Asignacionsolicitude> asignacionsolicitudes2;
//
//	//bi-directional many-to-one association to Empresa
//	@ManyToOne
//	@JoinColumn(name="id_empresa")
//	private Empresa empresa;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo1")
//	private List<Cliente> clientes1;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo2")
//	private List<Cliente> clientes2;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo3")
//	private List<Cliente> clientes3;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo4")
//	private List<Cliente> clientes4;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo5")
//	private List<Cliente> clientes5;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo6")
//	private List<Cliente> clientes6;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo7")
//	private List<Cliente> clientes7;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo8")
//	private List<Cliente> clientes8;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo9")
//	private List<Cliente> clientes9;
//
//	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="catalogo10")
//	private List<Cliente> clientes10;
//
//	//bi-directional many-to-one association to Costosublineanegocio
//	@OneToMany(mappedBy="catalogo1")
//	private List<Costosublineanegocio> costosublineanegocios1;
//
//	//bi-directional many-to-one association to Costosublineanegocio
//	@OneToMany(mappedBy="catalogo2")
//	private List<Costosublineanegocio> costosublineanegocios2;
//
//	//bi-directional many-to-one association to Costosublineanegocio
//	@OneToMany(mappedBy="catalogo3")
//	private List<Costosublineanegocio> costosublineanegocios3;
//
//	//bi-directional many-to-one association to Rolmenupermiso
//	@OneToMany(mappedBy="catalogo")
//	private List<Rolmenupermiso> rolmenupermisos;
//
//	//bi-directional many-to-one association to Tarifario
//	@OneToMany(mappedBy="catalogo1")
//	private List<Tarifario> tarifarios1;
//
//	//bi-directional many-to-one association to Tarifario
//	@OneToMany(mappedBy="catalogo2")
//	private List<Tarifario> tarifarios2;

	/*
	@OneToMany(mappedBy="catalogo1")
	private List<Usuario> usuarios1;

	@OneToMany(mappedBy="catalogo2")
	private List<Usuario> usuarios2;

	@OneToMany(mappedBy="catalogo3")
	private List<Usuario> usuarios3;

	@OneToMany(mappedBy="catalogo4")
	private List<Usuario> usuarios4;

	@OneToMany(mappedBy="catalogo5")
	private List<Usuario> usuarios5;*/
	
	public Catalogo() {
	}

	public Integer getIdCatalogo() {
		return this.idCatalogo;
	}

	public void setIdCatalogo(Integer idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getCodigoCatalogo() {
		return this.codigoCatalogo;
	}

	public void setCodigoCatalogo(String codigoCatalogo) {
		this.codigoCatalogo = codigoCatalogo;
	}

	public String getDescripcionCatalogo() {
		return this.descripcionCatalogo;
	}

	public void setDescripcionCatalogo(String descripcionCatalogo) {
		this.descripcionCatalogo = descripcionCatalogo;
	}

	public Boolean getEliminado() {
		return this.eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	public Boolean getEstadoCatalogo() {
		return this.estadoCatalogo;
	}

	public void setEstadoCatalogo(Boolean estadoCatalogo) {
		this.estadoCatalogo = estadoCatalogo;
	}

	public Integer getIdCatalogoPadre() {
		return this.idCatalogoPadre;
	}

	public void setIdCatalogoPadre(Integer idCatalogoPadre) {
		this.idCatalogoPadre = idCatalogoPadre;
	}

	public String getNombreCatalgo() {
		return this.nombreCatalgo;
	}

	public void setNombreCatalgo(String nombreCatalgo) {
		this.nombreCatalgo = nombreCatalgo;
	}

//	public List<Asignacionsolicitude> getAsignacionsolicitudes1() {
//		return this.asignacionsolicitudes1;
//	}
//
//	public void setAsignacionsolicitudes1(List<Asignacionsolicitude> asignacionsolicitudes1) {
//		this.asignacionsolicitudes1 = asignacionsolicitudes1;
//	}
//
//	public Asignacionsolicitude addAsignacionsolicitudes1(Asignacionsolicitude asignacionsolicitudes1) {
//		getAsignacionsolicitudes1().add(asignacionsolicitudes1);
//		asignacionsolicitudes1.setCatalogo1(this);
//
//		return asignacionsolicitudes1;
//	}
//
//	public Asignacionsolicitude removeAsignacionsolicitudes1(Asignacionsolicitude asignacionsolicitudes1) {
//		getAsignacionsolicitudes1().remove(asignacionsolicitudes1);
//		asignacionsolicitudes1.setCatalogo1(null);
//
//		return asignacionsolicitudes1;
//	}
//
//	public List<Asignacionsolicitude> getAsignacionsolicitudes2() {
//		return this.asignacionsolicitudes2;
//	}
//
//	public void setAsignacionsolicitudes2(List<Asignacionsolicitude> asignacionsolicitudes2) {
//		this.asignacionsolicitudes2 = asignacionsolicitudes2;
//	}
//
//	public Asignacionsolicitude addAsignacionsolicitudes2(Asignacionsolicitude asignacionsolicitudes2) {
//		getAsignacionsolicitudes2().add(asignacionsolicitudes2);
//		asignacionsolicitudes2.setCatalogo2(this);
//
//		return asignacionsolicitudes2;
//	}
//
//	public Asignacionsolicitude removeAsignacionsolicitudes2(Asignacionsolicitude asignacionsolicitudes2) {
//		getAsignacionsolicitudes2().remove(asignacionsolicitudes2);
//		asignacionsolicitudes2.setCatalogo2(null);
//
//		return asignacionsolicitudes2;
//	}
//
//	public Empresa getEmpresa() {
//		return this.empresa;
//	}
//
//	public void setEmpresa(Empresa empresa) {
//		this.empresa = empresa;
//	}
//
//	public List<Cliente> getClientes1() {
//		return this.clientes1;
//	}
//
//	public void setClientes1(List<Cliente> clientes1) {
//		this.clientes1 = clientes1;
//	}
//
//	public Cliente addClientes1(Cliente clientes1) {
//		getClientes1().add(clientes1);
//		clientes1.setCatalogo1(this);
//
//		return clientes1;
//	}
//
//	public Cliente removeClientes1(Cliente clientes1) {
//		getClientes1().remove(clientes1);
//		clientes1.setCatalogo1(null);
//
//		return clientes1;
//	}
//
//	public List<Cliente> getClientes2() {
//		return this.clientes2;
//	}
//
//	public void setClientes2(List<Cliente> clientes2) {
//		this.clientes2 = clientes2;
//	}
//
//	public Cliente addClientes2(Cliente clientes2) {
//		getClientes2().add(clientes2);
//		clientes2.setCatalogo2(this);
//
//		return clientes2;
//	}
//
//	public Cliente removeClientes2(Cliente clientes2) {
//		getClientes2().remove(clientes2);
//		clientes2.setCatalogo2(null);
//
//		return clientes2;
//	}
//
//	public List<Cliente> getClientes3() {
//		return this.clientes3;
//	}
//
//	public void setClientes3(List<Cliente> clientes3) {
//		this.clientes3 = clientes3;
//	}
//
//	public Cliente addClientes3(Cliente clientes3) {
//		getClientes3().add(clientes3);
//		clientes3.setCatalogo3(this);
//
//		return clientes3;
//	}
//
//	public Cliente removeClientes3(Cliente clientes3) {
//		getClientes3().remove(clientes3);
//		clientes3.setCatalogo3(null);
//
//		return clientes3;
//	}
//
//	public List<Cliente> getClientes4() {
//		return this.clientes4;
//	}
//
//	public void setClientes4(List<Cliente> clientes4) {
//		this.clientes4 = clientes4;
//	}
//
//	public Cliente addClientes4(Cliente clientes4) {
//		getClientes4().add(clientes4);
//		clientes4.setCatalogo4(this);
//
//		return clientes4;
//	}
//
//	public Cliente removeClientes4(Cliente clientes4) {
//		getClientes4().remove(clientes4);
//		clientes4.setCatalogo4(null);
//
//		return clientes4;
//	}
//
//	public List<Cliente> getClientes5() {
//		return this.clientes5;
//	}
//
//	public void setClientes5(List<Cliente> clientes5) {
//		this.clientes5 = clientes5;
//	}
//
//	public Cliente addClientes5(Cliente clientes5) {
//		getClientes5().add(clientes5);
//		clientes5.setCatalogo5(this);
//
//		return clientes5;
//	}
//
//	public Cliente removeClientes5(Cliente clientes5) {
//		getClientes5().remove(clientes5);
//		clientes5.setCatalogo5(null);
//
//		return clientes5;
//	}
//
//	public List<Cliente> getClientes6() {
//		return this.clientes6;
//	}
//
//	public void setClientes6(List<Cliente> clientes6) {
//		this.clientes6 = clientes6;
//	}
//
//	public Cliente addClientes6(Cliente clientes6) {
//		getClientes6().add(clientes6);
//		clientes6.setCatalogo6(this);
//
//		return clientes6;
//	}
//
//	public Cliente removeClientes6(Cliente clientes6) {
//		getClientes6().remove(clientes6);
//		clientes6.setCatalogo6(null);
//
//		return clientes6;
//	}
//
//	public List<Cliente> getClientes7() {
//		return this.clientes7;
//	}
//
//	public void setClientes7(List<Cliente> clientes7) {
//		this.clientes7 = clientes7;
//	}
//
//	public Cliente addClientes7(Cliente clientes7) {
//		getClientes7().add(clientes7);
//		clientes7.setCatalogo7(this);
//
//		return clientes7;
//	}
//
//	public Cliente removeClientes7(Cliente clientes7) {
//		getClientes7().remove(clientes7);
//		clientes7.setCatalogo7(null);
//
//		return clientes7;
//	}
//
//	public List<Cliente> getClientes8() {
//		return this.clientes8;
//	}
//
//	public void setClientes8(List<Cliente> clientes8) {
//		this.clientes8 = clientes8;
//	}
//
//	public Cliente addClientes8(Cliente clientes8) {
//		getClientes8().add(clientes8);
//		clientes8.setCatalogo8(this);
//
//		return clientes8;
//	}
//
//	public Cliente removeClientes8(Cliente clientes8) {
//		getClientes8().remove(clientes8);
//		clientes8.setCatalogo8(null);
//
//		return clientes8;
//	}
//
//	public List<Cliente> getClientes9() {
//		return this.clientes9;
//	}
//
//	public void setClientes9(List<Cliente> clientes9) {
//		this.clientes9 = clientes9;
//	}
//
//	public Cliente addClientes9(Cliente clientes9) {
//		getClientes9().add(clientes9);
//		clientes9.setCatalogo9(this);
//
//		return clientes9;
//	}
//
//	public Cliente removeClientes9(Cliente clientes9) {
//		getClientes9().remove(clientes9);
//		clientes9.setCatalogo9(null);
//
//		return clientes9;
//	}
//
//	public List<Cliente> getClientes10() {
//		return this.clientes10;
//	}
//
//	public void setClientes10(List<Cliente> clientes10) {
//		this.clientes10 = clientes10;
//	}
//
//	public Cliente addClientes10(Cliente clientes10) {
//		getClientes10().add(clientes10);
//		clientes10.setCatalogo10(this);
//
//		return clientes10;
//	}
//
//	public Cliente removeClientes10(Cliente clientes10) {
//		getClientes10().remove(clientes10);
//		clientes10.setCatalogo10(null);
//
//		return clientes10;
//	}
//
//	public List<Costosublineanegocio> getCostosublineanegocios1() {
//		return this.costosublineanegocios1;
//	}
//
//	public void setCostosublineanegocios1(List<Costosublineanegocio> costosublineanegocios1) {
//		this.costosublineanegocios1 = costosublineanegocios1;
//	}
//
//	public Costosublineanegocio addCostosublineanegocios1(Costosublineanegocio costosublineanegocios1) {
//		getCostosublineanegocios1().add(costosublineanegocios1);
//		costosublineanegocios1.setCatalogo1(this);
//
//		return costosublineanegocios1;
//	}
//
//	public Costosublineanegocio removeCostosublineanegocios1(Costosublineanegocio costosublineanegocios1) {
//		getCostosublineanegocios1().remove(costosublineanegocios1);
//		costosublineanegocios1.setCatalogo1(null);
//
//		return costosublineanegocios1;
//	}
//
//	public List<Costosublineanegocio> getCostosublineanegocios2() {
//		return this.costosublineanegocios2;
//	}
//
//	public void setCostosublineanegocios2(List<Costosublineanegocio> costosublineanegocios2) {
//		this.costosublineanegocios2 = costosublineanegocios2;
//	}
//
//	public Costosublineanegocio addCostosublineanegocios2(Costosublineanegocio costosublineanegocios2) {
//		getCostosublineanegocios2().add(costosublineanegocios2);
//		costosublineanegocios2.setCatalogo2(this);
//
//		return costosublineanegocios2;
//	}
//
//	public Costosublineanegocio removeCostosublineanegocios2(Costosublineanegocio costosublineanegocios2) {
//		getCostosublineanegocios2().remove(costosublineanegocios2);
//		costosublineanegocios2.setCatalogo2(null);
//
//		return costosublineanegocios2;
//	}
//
//	public List<Costosublineanegocio> getCostosublineanegocios3() {
//		return this.costosublineanegocios3;
//	}
//
//	public void setCostosublineanegocios3(List<Costosublineanegocio> costosublineanegocios3) {
//		this.costosublineanegocios3 = costosublineanegocios3;
//	}
//
//	public Costosublineanegocio addCostosublineanegocios3(Costosublineanegocio costosublineanegocios3) {
//		getCostosublineanegocios3().add(costosublineanegocios3);
//		costosublineanegocios3.setCatalogo3(this);
//
//		return costosublineanegocios3;
//	}
//
//	public Costosublineanegocio removeCostosublineanegocios3(Costosublineanegocio costosublineanegocios3) {
//		getCostosublineanegocios3().remove(costosublineanegocios3);
//		costosublineanegocios3.setCatalogo3(null);
//
//		return costosublineanegocios3;
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
//		rolmenupermiso.setCatalogo(this);
//
//		return rolmenupermiso;
//	}
//
//	public Rolmenupermiso removeRolmenupermiso(Rolmenupermiso rolmenupermiso) {
//		getRolmenupermisos().remove(rolmenupermiso);
//		rolmenupermiso.setCatalogo(null);
//
//		return rolmenupermiso;
//	}
//
//	public List<Tarifario> getTarifarios1() {
//		return this.tarifarios1;
//	}
//
//	public void setTarifarios1(List<Tarifario> tarifarios1) {
//		this.tarifarios1 = tarifarios1;
//	}
//
//	public Tarifario addTarifarios1(Tarifario tarifarios1) {
//		getTarifarios1().add(tarifarios1);
//		tarifarios1.setCatalogo1(this);
//
//		return tarifarios1;
//	}
//
//	public Tarifario removeTarifarios1(Tarifario tarifarios1) {
//		getTarifarios1().remove(tarifarios1);
//		tarifarios1.setCatalogo1(null);
//
//		return tarifarios1;
//	}
//
//	public List<Tarifario> getTarifarios2() {
//		return this.tarifarios2;
//	}
//
//	public void setTarifarios2(List<Tarifario> tarifarios2) {
//		this.tarifarios2 = tarifarios2;
//	}
//
//	public Tarifario addTarifarios2(Tarifario tarifarios2) {
//		getTarifarios2().add(tarifarios2);
//		tarifarios2.setCatalogo2(this);
//
//		return tarifarios2;
//	}
//
//	public Tarifario removeTarifarios2(Tarifario tarifarios2) {
//		getTarifarios2().remove(tarifarios2);
//		tarifarios2.setCatalogo2(null);
//
//		return tarifarios2;
//	}
/*
	public List<Usuario> getUsuarios1() {
		return this.usuarios1;
	}

	public void setUsuarios1(List<Usuario> usuarios1) {
		this.usuarios1 = usuarios1;
	}

	public Usuario addUsuarios1(Usuario usuarios1) {
		getUsuarios1().add(usuarios1);
		usuarios1.setCatalogo1(this);

		return usuarios1;
	}

	public Usuario removeUsuarios1(Usuario usuarios1) {
		getUsuarios1().remove(usuarios1);
		usuarios1.setCatalogo1(null);

		return usuarios1;
	}

	public List<Usuario> getUsuarios2() {
		return this.usuarios2;
	}

	public void setUsuarios2(List<Usuario> usuarios2) {
		this.usuarios2 = usuarios2;
	}

	public Usuario addUsuarios2(Usuario usuarios2) {
		getUsuarios2().add(usuarios2);
		usuarios2.setCatalogo2(this);

		return usuarios2;
	}

	public Usuario removeUsuarios2(Usuario usuarios2) {
		getUsuarios2().remove(usuarios2);
		usuarios2.setCatalogo2(null);

		return usuarios2;
	}

	public List<Usuario> getUsuarios3() {
		return this.usuarios3;
	}

	public void setUsuarios3(List<Usuario> usuarios3) {
		this.usuarios3 = usuarios3;
	}

	public Usuario addUsuarios3(Usuario usuarios3) {
		getUsuarios3().add(usuarios3);
		usuarios3.setCatalogo3(this);

		return usuarios3;
	}

	public Usuario removeUsuarios3(Usuario usuarios3) {
		getUsuarios3().remove(usuarios3);
		usuarios3.setCatalogo3(null);

		return usuarios3;
	}

	public List<Usuario> getUsuarios4() {
		return this.usuarios4;
	}

	public void setUsuarios4(List<Usuario> usuarios4) {
		this.usuarios4 = usuarios4;
	}

	public Usuario addUsuarios4(Usuario usuarios4) {
		getUsuarios4().add(usuarios4);
		usuarios4.setCatalogo4(this);

		return usuarios4;
	}

	public Usuario removeUsuarios4(Usuario usuarios4) {
		getUsuarios4().remove(usuarios4);
		usuarios4.setCatalogo4(null);

		return usuarios4;
	}

	public List<Usuario> getUsuarios5() {
		return this.usuarios5;
	}

	public void setUsuarios5(List<Usuario> usuarios5) {
		this.usuarios5 = usuarios5;
	}

	public Usuario addUsuarios5(Usuario usuarios5) {
		getUsuarios5().add(usuarios5);
		usuarios5.setCatalogo5(this);

		return usuarios5;
	}

	public Usuario removeUsuarios5(Usuario usuarios5) {
		getUsuarios5().remove(usuarios5);
		usuarios5.setCatalogo5(null);

		return usuarios5;
	}*/

}