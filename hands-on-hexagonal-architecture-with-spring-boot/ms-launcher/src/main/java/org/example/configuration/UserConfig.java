package org.example.configuration;

import org.example.adapters.UserJpaAdapter;
import org.exemple.ports.api.UserServicePort;
import org.exemple.ports.spi.UserPersistencePort;
import org.exemple.service.UserServicePortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig {
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
    @Bean
    public UserPersistencePort userPersistence(){
        return new UserJpaAdapter();
    }

    @Bean
    public UserServicePort userService(){
        return new UserServicePortImpl(userPersistence());
    }
}
