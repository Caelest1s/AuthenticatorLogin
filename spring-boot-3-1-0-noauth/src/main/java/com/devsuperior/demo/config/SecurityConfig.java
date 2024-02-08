package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // desabilita a proteção contra csrf que é um ataque quando grava dados na seção. Gera vulnerabilidade para acessar as informações de forma indevida
        // API REST não guarda state em seção, então não precisa preocupar com isto
        http.csrf(csrf -> csrf.disable());
        // configurar as permissões para os meus endpoints, para as minhas requisições
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }
}
