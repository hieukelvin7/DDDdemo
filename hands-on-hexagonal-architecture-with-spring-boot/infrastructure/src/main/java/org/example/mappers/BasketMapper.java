package org.example.mappers;

import org.example.entity.Basket;
import org.exemple.data.BasketDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BasketMapper {

    BasketMapper INSTANCE = Mappers.getMapper(BasketMapper.class);

    BasketDto basketToBasketDto(Basket basket);

    Basket basketDtoToBasket(BasketDto basketDto);

    List<BasketDto> basketListToBasketDtoList(List<Basket> basketList);

    List<Basket> BasketDtoListTobasketList(List<BasketDto> BasketDtoList);
}
