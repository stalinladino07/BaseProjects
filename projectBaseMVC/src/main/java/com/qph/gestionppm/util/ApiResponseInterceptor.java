package com.qph.gestionppm.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ApiResponseInterceptor implements HandlerInterceptor {

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // Se ejecuta antes de que el controlador maneje la solicitud
        System.out.println("PreHandle method is Calling");
        return true; // Si devuelve false, interrumpe la ejecución del controlador
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // Se ejecuta después de que el controlador maneje la solicitud, pero antes de que se envíe la respuesta al cliente
        System.out.println("PostHandle method is Calling" + response.getContentType());
        if (response.getContentType() != null && response.getContentType().startsWith("application/json")) {
            // Obtener el cuerpo de la respuesta
            String responseBody = response.getContentType();

            // Modificar el cuerpo de la respuesta según sea necesario
            // Por ejemplo, aquí simplemente agregamos "Modificado: " al principio del cuerpo de la respuesta
            String modifiedResponseBody = "Modificado: " + responseBody;

            // Escribir la respuesta modificada en el cuerpo de la respuesta
            response.setContentLength(modifiedResponseBody.length());
            response.getWriter().write(modifiedResponseBody);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) throws Exception {
        // Se ejecuta después de que se haya completado el procesamiento de la solicitud y se haya enviado la respuesta al cliente
        System.out.println("AfterCompletion method is Calling");
    }
}