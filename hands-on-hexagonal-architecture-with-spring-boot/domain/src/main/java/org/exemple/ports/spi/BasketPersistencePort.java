package org.exemple.ports.spi;

import org.exemple.data.BasketDto;

import java.util.List;

public interface BasketPersistencePort {
    BasketDto saveBasket(BasketDto basket);
    BasketDto updateBasket(BasketDto basket);
    BasketDto getBasketById(Long id);
    List<BasketDto> getAllBasket();
}
