package com.epam.task2.entities;

public abstract class Shape implements Drawable {
    public String shapeColor;

    public Shape (String colorShape) {
        this.shapeColor = colorShape;
    }
    public abstract double calcArea ();

    @Override
    public void draw () {
        System.out.println(toString() + ". Its area = " + calcArea());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" {color - " + this.shapeColor;
    }
}
