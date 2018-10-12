package com.epam.task2.model;

import com.epam.task2.Data.DataShapes;
import com.epam.task2.entities.Rectangle;
import com.epam.task2.entities.Shape;


import java.util.Arrays;
import java.util.Comparator;

public class Shapes {
    private Shape[] shapes;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] sortByArea() {
        Shape[] temp = DataShapes.getShapes();
        Arrays.sort(temp, new AreaComparator());

        return temp;
    }

    public double getTotalArea() {
        Shape[] temp = new Shape[shapes.length];
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            area += shapes[i].calcArea();
        }

        return area;
    }

    public double getAreaBySameShapes(Class shapeClass) {
        Shape[] temp = new Shape[shapes.length];
        double areasBySameShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapeClass.getName() == shapes[i].getClass().getName()) {
                areasBySameShapes += shapes[i].calcArea();
            }
        }

        return areasBySameShapes;
    }

    public Shape[] sortByColor() {
        Shape[] temp = DataShapes.getShapes();
        Arrays.sort(temp, new Comparator<Shape>() {

            @Override
            public int compare(Shape o1, Shape o2) {
                return o1.shapeColor.compareTo(o2.shapeColor);
            }
        });

        return temp;
    }
}
