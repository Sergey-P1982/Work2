package com.epam.task2.view;

import com.epam.task2.entities.Shape;

public class ShapesView {

    public void printMenu() {

        System.out.println("Welcome to the shapes menu:");
        System.out.println("1. Print data set.");
        System.out.println("2. Calculate the total area of all figures in the data set.");
        System.out.println("3. Calculate the total area of figures of a given type.");
        System.out.println("4. Sorting shapes by increasing the area.");
        System.out.println("5. Sorting shapes by color.");
        System.out.println("6. Exit.");
    }

    public void printSubMenu() {

        System.out.println("Welcome to the shape area submenu:");
        System.out.println("1. Calculate of the total area of all rectangles.");
        System.out.println("2. Calculate of the total area of all triangles.");
        System.out.println("3. Calculate of the total area of all circles.");
        System.out.println("4. Exit to common shape's menu.");
    }

    public void printShapes(String message, Shape[] shapes) {
        System.out.println(message);
        for (Shape shape : shapes) {
            shape.draw();

        }
    }

    public void printMessage(String message) {
        System.out.println(message);

    }

    public void printResult(String message, double result) {
        System.out.println(message + result);

    }
}