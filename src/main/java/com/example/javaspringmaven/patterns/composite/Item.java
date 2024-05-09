package com.example.javaspringmaven.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Item implements Producto {
    private String name;
    private Integer price;

    @Override
    public Integer getPrice() {
        return price;
    }
}