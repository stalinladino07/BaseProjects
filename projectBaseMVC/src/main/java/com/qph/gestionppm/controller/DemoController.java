package com.qph.gestionppm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qph.gestionppm.modelo.Rol;
import com.qph.gestionppm.service.impl.DemoServicioImpl;

@RestController
public class DemoController {

	@Autowired
	private DemoServicioImpl demoService;

	@GetMapping("/demo")
	public String metodo() {
		Rol obj = new Rol();
		obj.setDescripcionRol("test");
		System.out.println("Controler");
		return "Stalin";
	}

	@GetMapping("/simulateNullPointerException")
	public String simulateNullPointerException() {
		demoService.throwNullPointerException();
		return "Operación completada con éxito";
	}

	@GetMapping("/simulateIllegalArgumentException")
	public Object simulateIllegalArgumentException() {
		demoService.throwIllegalArgumentException();
		return "Operación completada con éxito";
	}

	@GetMapping("/simulateCustomException")
	public Object simulateCustomException() throws Exception {
		demoService.throwCustomException();
		return "Operación completada con éxito";
	}
}