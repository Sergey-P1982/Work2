package com.epam.task2.data;

import com.epam.task2.entities.Circle;
import com.epam.task2.entities.Rectangle;
import com.epam.task2.entities.Shape;
import com.epam.task2.entities.Triangle;

public class DataShapes {
    public static Shape[] getShapes () {
        return new Shape[] {new Rectangle("red", 5.0, 3.0), new Rectangle("white", 4.0, 4.0),
                new Rectangle("green", 8.0, 6.0), new Triangle("blue", 15.0, 5.0),
                 new Triangle("black", 10.0, 20.0), new Triangle("red", 9.0, 6.0),
                  new Circle("pink", 6.0), new Circle("yellow", 15.0),
                    new Circle("brown", 8.0), new Circle("beige", 2.0)};
    }
}
