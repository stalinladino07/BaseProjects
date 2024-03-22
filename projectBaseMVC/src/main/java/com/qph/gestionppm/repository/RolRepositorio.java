package com.qph.gestionppm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import com.qph.gestionppm.modelo.Rol;

@Component
public interface RolRepositorio extends JpaRepository<Rol, Integer>, JpaSpecificationExecutor<Rol> {
   
}
			