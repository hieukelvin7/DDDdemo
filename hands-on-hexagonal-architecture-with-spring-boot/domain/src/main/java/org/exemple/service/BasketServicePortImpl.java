package org.exemple.service;

import org.exemple.data.BasketDto;
import org.exemple.ports.api.BasketServicePort;
import org.exemple.ports.spi.BasketPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BasketServicePortImpl implements BasketServicePort {

    private BasketPersistencePort basketPersistencePort;

    @Autowired
    public BasketServicePortImpl(BasketPersistencePort basketPersistencePort){
        this.basketPersistencePort = basketPersistencePort;
    }


    @Override
    public BasketDto saveBasket(BasketDto basket) {
        return basketPersistencePort.saveBasket(basket);
    }

    @Override
    public BasketDto updateBasket(BasketDto basket) {
        return basketPersistencePort.updateBasket(basket);
    }

    @Override
    public BasketDto getBasketById(Long id) {
        return basketPersistencePort.getBasketById(id);
    }

    @Override
    public List<BasketDto> getAllBasket() {
        return basketPersistencePort.getAllBasket();
    }
}
