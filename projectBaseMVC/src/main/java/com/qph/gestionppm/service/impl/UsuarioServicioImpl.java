package com.qph.gestionppm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qph.gestionppm.modelo.Usuario;
import com.qph.gestionppm.repository.UsuarioRepositorio;
import com.qph.gestionppm.service.UsuarioServicio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuario> obtenerListaUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepositorio.findAll();
		
	}
	
	
}
