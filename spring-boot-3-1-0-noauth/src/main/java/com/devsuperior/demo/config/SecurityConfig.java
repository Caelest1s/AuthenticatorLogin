package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

// Definir componentes na forma de metódos
@Configuration
public class SecurityConfig {
    
    // o @Bean faz transformar o objeto em componente que poderá ser injetado em outros lugares
    // PasswordEncoder é um genérico do BCryptPasswordEncoder
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

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
