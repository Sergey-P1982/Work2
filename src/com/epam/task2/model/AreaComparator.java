package com.epam.task2.model;

import com.epam.task2.entities.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Double area1 = ((Shape) o1).calcArea();
        Double area2 = ((Shape) o2).calcArea();
        return area1.compareTo(area2);
    }
}

