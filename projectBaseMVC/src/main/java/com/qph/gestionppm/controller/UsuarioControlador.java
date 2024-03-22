package com.qph.gestionppm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qph.gestionppm.modelo.Usuario;
import com.qph.gestionppm.service.UsuarioServicio;

@CrossOrigin(origins = "*", methods= {RequestMethod.OPTIONS,RequestMethod.GET,
        RequestMethod.POST,RequestMethod.DELETE})
@RestController
public class UsuarioControlador {
	
	@Autowired
    private UsuarioServicio usuarioServicio;

	@GetMapping("/users")
	public ResponseEntity<List<Usuario>> obtenerListaUsuarios() {
		List<Usuario> users= new ArrayList<>();
		users = usuarioServicio.obtenerListaUsuarios();
		return ResponseEntity.ok().body(users);
	}

}