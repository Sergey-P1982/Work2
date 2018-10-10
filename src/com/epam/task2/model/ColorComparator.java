package com.epam.task2.model;

import com.epam.task2.entities.Shape;

import java.util.Comparator;

public class ColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape) o1).shapeColor;
        String color2 = ((Shape) o2).shapeColor;
        return color1.compareTo(color2);
    }
}

