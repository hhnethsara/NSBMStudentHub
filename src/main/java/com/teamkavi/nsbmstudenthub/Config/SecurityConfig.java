package com.teamkavi.nsbmstudenthub.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disabled for testing with Postman
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/students/**").hasRole("ADMIN") // Only admins can manage students
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()); // Uses Basic Auth for simplicity in tutorials

        return http.build();
    }
}