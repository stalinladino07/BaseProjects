package com.qph.gestionppm.dto;

public class ErrorResponse extends Exception {

    public ErrorResponse(String message) {
        super(message);
    }

    public ErrorResponse(String message, Throwable cause) {
        super(message, cause);
    }
}