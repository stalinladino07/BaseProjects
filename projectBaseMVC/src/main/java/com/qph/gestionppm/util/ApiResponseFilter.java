//package com.qph.gestionppm.util;
//
//import java.io.IOException;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@WebFilter("/*")
//public class ApiResponseFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest request,
//                        ServletResponse response,
//                        FilterChain chain) throws IOException, ServletException
//    {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
// 
//        System.out.println("Request URI is: " + req.getRequestURI());
//        System.out.println("responses: " +res);
//        chain.doFilter(request, response);
//        System.out.println("Response Status Code is: " + res.getStatus());
//    }
//
//    // Métodos restantes de la interfaz Filter
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // Método de inicialización
//    }
//
//    @Override
//    public void destroy() {
//        // Método de destrucción
//    }
//}