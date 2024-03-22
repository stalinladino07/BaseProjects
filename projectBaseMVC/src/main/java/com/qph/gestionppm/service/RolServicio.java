package com.qph.gestionppm.service;

import java.util.List;
import java.util.Optional;

import com.qph.gestionppm.dto.ApiResponse;
import com.qph.gestionppm.modelo.Rol;


public interface RolServicio {

	List<Rol> obtenerTodos();
	Optional<Rol> obtenerPorId(Integer id);
	Rol crear(Rol rol);
	ApiResponse modificar(Integer id,Rol rol);
	void eliminar(Integer id);
	

}
