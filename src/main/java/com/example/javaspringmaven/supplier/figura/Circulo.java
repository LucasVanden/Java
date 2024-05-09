package com.example.javaspringmaven.supplier.figura;

public class Circulo extends Figura {
  private int radio;
  public Circulo() {
    this(2);
  }
  public Circulo(int radio) {
    super();
    this.radio = radio;
  }
  public int getRadio() {
    return radio;
  }
  public void setRadio(int radio) {
    this.radio = radio;
  }
  @Override
  public double area() {
    // TODO Auto-generated method stub
    return 2 * Math.PI * radio;
  }
}