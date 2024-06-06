package com.shivam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.shivam.component.JwtAuthenticationEntryPoint;
import com.shivam.component.JwtAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	@Autowired
	private JwtAuthenticationEntryPoint point;
	@Autowired
	private JwtAuthenticationFilter filter;

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf(csrf->csrf.disable())
//                .authorizeHttpRequests((authorize) ->
//                        //authorize.anyRequest().authenticated()
//                        authorize.requestMatchers(HttpMethod.GET, "/api/**").permitAll()
//                                .requestMatchers("/api/user/**").permitAll()
//                                .requestMatchers("/", "/index.html", "/css/**", "/js/**").permitAll()
//                                .requestMatchers("/","/ws/**").permitAll()
//                                .anyRequest().authenticated()
//
//                );
//
//        return http.build();
//    }
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/home/**").authenticated()
						.requestMatchers("/", "/ws/**").permitAll().requestMatchers("/app/**").permitAll()
						.requestMatchers("/all/**").permitAll().requestMatchers("/", "/index.html")
						.permitAll().requestMatchers("/api/user/**").permitAll().anyRequest().authenticated())
				.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
