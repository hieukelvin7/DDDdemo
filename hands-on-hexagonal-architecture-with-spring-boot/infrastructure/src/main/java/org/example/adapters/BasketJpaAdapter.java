package org.example.adapters;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Basket;
import org.example.mappers.BasketMapper;
import org.example.repository.BasketRepository;
import org.exemple.data.BasketDto;
import org.exemple.ports.spi.BasketPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Slf4j

public class BasketJpaAdapter implements BasketPersistencePort {

    @Autowired
    private  BasketRepository basketRepository;

    @Override
    public BasketDto saveBasket(BasketDto basketDto) {
        log.info("Save thanh cong");
        Basket basket = BasketMapper.INSTANCE.basketDtoToBasket(basketDto);

         Basket basketSave = basketRepository.save(basket);
        return BasketMapper.INSTANCE.basketToBasketDto(basketSave);

    }

    @Override
    public BasketDto updateBasket(BasketDto basket) {
        return saveBasket(basket);
    }

    @Override
    public BasketDto getBasketById(Long id) {
        Optional<Basket> basket = basketRepository.findById(id);

        if (basket.isPresent()) {
            return BasketMapper.INSTANCE.basketToBasketDto(basket.get());
        }

        return null;
    }

    @Override
    public List<BasketDto> getAllBasket() {
        List<Basket> bookList = basketRepository.findAll();

        return BasketMapper.INSTANCE.basketListToBasketDtoList(bookList);
    }
}
