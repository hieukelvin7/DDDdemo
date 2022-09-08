package org.exemple.ports.api;

import org.exemple.data.BasketDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BasketServicePort {
    BasketDto saveBasket(BasketDto basket);
    BasketDto updateBasket(BasketDto basket);
   BasketDto getBasketById(Long id);
    List<BasketDto> getAllBasket();

}
