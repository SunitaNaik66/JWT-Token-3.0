package com.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                .username("sunita")
                .password(passwordEncoder().encode("sunita"))  // "{noop}" is needed to avoid password encoding issues
                .roles("ADMIN")
                .build();

        UserDetails user1 = User.builder()
                .username("sunita1")
                .password(passwordEncoder().encode("sunita1"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, user1);  // Add both users
    }

    @Bean
    public PasswordEncoder passwordEncoder(){


        return new BCryptPasswordEncoder();
    }
}
