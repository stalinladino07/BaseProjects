package com.qph.gestionppm.service.impl;

import org.springframework.stereotype.Service;

import com.qph.gestionppm.dto.ErrorResponse;

@Service
public class DemoServicioImpl {
	
    public void throwNullPointerException() {
        // Genera una NullPointerException
        throw new NullPointerException("Simulando una NullPointerException");
    }

    public void throwIllegalArgumentException() {
        // Genera una IllegalArgumentException
        throw new IllegalArgumentException("Simulando una IllegalArgumentException");
    }

    public void throwCustomException() {
        // Genera una excepción personalizada
    	Integer resp = 100/0;
        //throw new ErrorResponse("Simulando una CustomException");
    }
}
