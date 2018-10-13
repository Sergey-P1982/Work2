package com.epam.task2.entities;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle (String color, double a, double b) {
        super(color);
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public double calcArea() {
        return sideA*sideB;
    }

    @Override
    public void draw() {
        super.draw();

    }

    @Override
    public String toString() {
        return super.toString() +
                ", sideA=" + sideA +
                ", sideB=" + sideB + '}';
    }
}
