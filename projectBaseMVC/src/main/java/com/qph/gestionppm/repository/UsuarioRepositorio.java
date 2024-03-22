package com.qph.gestionppm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import com.qph.gestionppm.modelo.Usuario;

@Component
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>, JpaSpecificationExecutor<Usuario> {
   
}
			