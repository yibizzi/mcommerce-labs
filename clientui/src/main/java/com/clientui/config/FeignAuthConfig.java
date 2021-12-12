package com.clientui.config;


import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignAuthConfig {

    @Bean
    public BasicAuthRequestInterceptor mBasicAuthInterceptor(){
        return new BasicAuthRequestInterceptor("user", "password");
    }
}
