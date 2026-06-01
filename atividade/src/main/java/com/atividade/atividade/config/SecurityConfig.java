package com.atividade.atividade.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->auth
                        .requestMatchers(HttpMethod.GET,"/produtos").permitAll()
                        .requestMatchers(HttpMethod.POST,"/produtos").permitAll()
                        .anyRequest().authenticated()
                )
                .sessionManagement(sessios ->sessios.sessionCreationPolicy(SessionCreationPolicy.STATELESS )
                );
                return http.build();




    }
}
