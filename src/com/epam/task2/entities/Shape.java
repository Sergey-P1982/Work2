package com.epam.task2.entities;

public abstract class Shape implements Drawable {
    public String shapeColor;

    public Shape (String colorShape) {
        this.shapeColor = colorShape;
    }
    public abstract double calcArea () ;

    @Override
    public String toString() {
        return "Shape is " + this.shapeColor;
    }
}
