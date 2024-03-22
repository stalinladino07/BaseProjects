package com.qph.gestionppm.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.qph.gestionppm.util.ApiResponseInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//    @Autowired
//    private ApiResponseInterceptor apiResponseInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(apiResponseInterceptor);
//    }
}
