package com.epam.task2.entities;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        super.draw();

    }

    @Override
    public String toString() {
        return super.toString() +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}

