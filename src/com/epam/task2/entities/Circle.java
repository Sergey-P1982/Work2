package com.epam.task2.entities;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius= radius;

    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("A circle was drew");

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
