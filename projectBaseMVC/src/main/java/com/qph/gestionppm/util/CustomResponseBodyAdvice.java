package com.qph.gestionppm.util;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.qph.gestionppm.dto.ApiResponse;

import jakarta.servlet.http.HttpServletResponse;

@ControllerAdvice
public class CustomResponseBodyAdvice implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		// Retorna true si deseas aplicar la modificación a este tipo de respuesta
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
			ApiResponse<Object> resp = new ApiResponse<Object>();
			HttpServletResponse servletResponse = ((ServletServerHttpResponse) response).getServletResponse();
			int statusCode = servletResponse.getStatus();
			String message = HttpStatus.valueOf(servletResponse.getStatus()).getReasonPhrase();
			resp.setMessage(message);
			resp.setStatus(statusCode);
			resp.setData(body);
			return resp;
	}
}
