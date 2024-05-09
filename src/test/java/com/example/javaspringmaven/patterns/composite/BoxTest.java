package com.example.javaspringmaven.patterns.composite;

import org.junit.jupiter.api.Test;

public class BoxTest {
  @Test
  void testGetPrice() {
    
    Producto item1 = new Item("Phone", 500);
    Producto item2 = new Item("Laptop", 1200);

    Box box1 = new Box("Box 1");
    box1.addProducto(item1);
    box1.addProducto(item2);

    Producto item3 = new Item("Tablet", 300);

    Box box2 = new Box("Box 2");
    box2.addProducto(item3);
    box2.addProducto(box1); // Adding another box inside this box

    System.out.println("Total Price of Box 1: $" + box1.getPrice());
    System.out.println("Total Price of Box 2: $" + box2.getPrice());
  }
}
