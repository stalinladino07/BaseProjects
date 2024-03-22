package com.qph.gestionppm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.qph.gestionppm.dto.ApiResponse;
import com.qph.gestionppm.modelo.Rol;
import com.qph.gestionppm.repository.RolRepositorio;
import com.qph.gestionppm.service.RolServicio;

@Service
public class RolServicioImpl implements RolServicio{
	
	@Autowired
	private RolRepositorio rolRepositorio;

	@Override
	public List<Rol> obtenerTodos() {
		// TODO Auto-generated method stub
		 return rolRepositorio.findAll(Sort.by(Sort.Direction.ASC, "idRol"));
	}

	@Override
	public Optional<Rol> obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		 return rolRepositorio.findById(id);
	}

	@Override
	public Rol crear(Rol rol) {
		// TODO Auto-generated method stub
		   return rolRepositorio.save(rol);
	}

	@Override
	public ApiResponse modificar(Integer id, Rol rol) {
		  ApiResponse resp = new ApiResponse();
	        if (rolRepositorio.existsById(id)) {
	        	rol.setIdRol(id);
	        	rolRepositorio.save(rol);
	          //  resp.setStatus(HttpStatus.OK.toString());
	            resp.setMessage("Producto actualizado correctamente");
	            return resp;
	        } else {
	        //    resp.setStatus(HttpStatus.BAD_REQUEST.toString());
	            resp.setMessage("No se encontró el ID: " + id);
	            return resp;
	        }
	}

	@Override
	public void eliminar(Integer Id) {
		// TODO Auto-generated method stub
		
	}
	
}
