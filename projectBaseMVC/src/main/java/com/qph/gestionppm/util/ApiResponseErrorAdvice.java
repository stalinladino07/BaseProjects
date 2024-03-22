package com.qph.gestionppm.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.qph.gestionppm.dto.ErrorRespuesta;

@RestControllerAdvice
public class ApiResponseErrorAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorRespuesta> handleException(Exception e) {
		String exceptionClassName = e.getClass().getName();
		ErrorRespuesta error = new ErrorRespuesta();
		error.setStatus(1);
		error.setMessage(exceptionClassName);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorRespuesta> handleNullPointerException(NullPointerException e) {
		// Maneja la NullPointerException y devuelve una respuesta personalizada
		String exceptionClassName = e.getClass().getName();
		ErrorRespuesta error = new ErrorRespuesta();
		error.setStatus(1);
		error.setMessage(exceptionClassName);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorRespuesta> handleIllegalArgumentException(IllegalArgumentException e) {

		String exceptionClassName = e.getClass().getName();
		ErrorRespuesta error = new ErrorRespuesta();
		error.setStatus(1);
		error.setMessage(exceptionClassName);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

}
