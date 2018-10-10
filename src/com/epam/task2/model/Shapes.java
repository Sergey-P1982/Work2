package com.epam.task2.model;

import com.epam.task2.Data.DataShapes;
import com.epam.task2.entities.Shape;

import java.util.Arrays;

public class Shapes {
    private Shape[] shapes;

    public Shape[] getShapes() {
        return shapes;
    }
    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] sortByArea () {
        Shape[] temp = DataShapes.getShapes();
        Arrays.sort(temp, new AreaComparator());

        return temp;
    }

    public double getTotalArea () {
        Shape[] temp = new Shape[shapes.length];
        double area = 0;
        for (int i = 0; i< shapes.length; i++) {
            area +=shapes[i].calcArea() ;
            }

        return area;
    }

    public Shape[] sortByColor() {
        Shape[] temp = DataShapes.getShapes();
        Arrays.sort(temp, new ColorComparator());

        return temp;
    }
}