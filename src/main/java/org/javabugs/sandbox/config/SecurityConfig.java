package org.javabugs.sandbox.config;

<<<<<<< HEAD

=======
>>>>>>> 4dcd6f143cbed4abc1a90a805ea41d0b2d00b86e
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
<<<<<<< HEAD
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf ->csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
                );

=======

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                //Para permitir login y registro en Swagger
                        .requestMatchers("/api/v1/auth/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .anyRequest().authenticated()
                );
>>>>>>> 4dcd6f143cbed4abc1a90a805ea41d0b2d00b86e
        return http.build();
    }
}
