package com.qph.gestionppm.dto;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorRespuesta {
	
	private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
