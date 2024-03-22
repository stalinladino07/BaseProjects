package com.qph.gestionppm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class GestionPPPMApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionPPPMApplication.class, args);
	}

}
