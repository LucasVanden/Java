package com.example.javaspringmaven.patterns.composite;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
class Box implements Producto {
    private String name;
    private List<Producto> productos;

    public Box(String name) {
        this.name = name;
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public Integer getPrice() {
        Integer totalPrice = 0;
        for (Producto producto : productos) {
            totalPrice += producto.getPrice();
        }
        return totalPrice;
    }
}