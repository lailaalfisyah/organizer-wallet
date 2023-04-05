package com.laila.organizerwallet.config;

import com.laila.organizerwallet.filter.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        List<RequestMatcher> whiteLists = new ArrayList<>();
        whiteLists.add(new AntPathRequestMatcher("/auth/**", HttpMethod.POST.name()));
        whiteLists.add(new AntPathRequestMatcher("/**", HttpMethod.OPTIONS.name()));
        whiteLists.add(new AntPathRequestMatcher("/v3/api-docs"));
        whiteLists.add(new AntPathRequestMatcher("/swagger-resources/**"));
        whiteLists.add(new AntPathRequestMatcher("/swagger-ui/**"));
        whiteLists.add(new AntPathRequestMatcher("/webjars/**"));

        http
                .cors()
                .and()
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeHttpRequests()
                .requestMatchers(whiteLists.toArray(new RequestMatcher[]{}))
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

//        http.authorizeHttpRequests().requestMatchers("/**").permitAll();
//        http.cors().and().csrf().disable();

        return http.build();
    }
}
