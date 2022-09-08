package org.example.configuration;

import org.example.adapters.BasketJpaAdapter;
import org.exemple.ports.api.BasketServicePort;
import org.exemple.ports.spi.BasketPersistencePort;
import org.exemple.service.BasketServicePortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketConfig {

    @Bean
    public BasketPersistencePort basketPersistence(){
        return new BasketJpaAdapter();
    }

    @Bean
    public BasketServicePort basketService(){
        return new BasketServicePortImpl(basketPersistence());
    }
}
