package org.example.controller;
import org.exemple.data.BasketDto;
import org.exemple.ports.api.BasketServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/basket")
public class BasketController {
    @Autowired
    private BasketServicePort basketServicePort;

    @PostMapping("/add")
    public BasketDto addBook(@RequestBody BasketDto bookDto) {
        return basketServicePort.saveBasket(bookDto);
    }

    @PutMapping("/update")
    public BasketDto updateBook(@RequestBody BasketDto bookDto) {
        return basketServicePort.updateBasket(bookDto);
    }

    @GetMapping("/get/{id}")
    public BasketDto getBookByID(@PathVariable long id) {
        return basketServicePort.getBasketById(id);
    }

    @GetMapping("/get")
    public List<BasketDto> getAllBooks() {
        return basketServicePort.getAllBasket();
    }
}
