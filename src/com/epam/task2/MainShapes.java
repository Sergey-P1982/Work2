package com.epam.task2;

import com.epam.task2.controller.Controller;

public class MainShapes {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
    }
}
//OUTPUT:
//    Welcome to the shape's menu:
//        1. Print data set.
//        2. Calculate the total area of all figures in the data set.
//        3. Calculate the total area of figures of a given type.
//        4. Sorting shapes by increasing the area.
//        5. Sorting shapes by color.
//        6. Exit.
//        Choose a menu item (1-6):
//        1
//        All shapes:
//        Rectangle{sideA=5.0, sideB=3.0, shapeColor='red'}
//        Rectangle{sideA=4.0, sideB=4.0, shapeColor='white'}
//        Rectangle{sideA=8.0, sideB=6.0, shapeColor='green'}
//        Triangle{base=15.0, height=5.0, shapeColor='blue'}
//        Triangle{base=10.0, height=20.0, shapeColor='black'}
//        Triangle{base=9.0, height=6.0, shapeColor='red'}
//        Circle{radius=6.0, shapeColor='pink'}
//        Circle{radius=15.0, shapeColor='yellow'}
//        Circle{radius=8.0, shapeColor='brown'}
//        Circle{radius=2.0, shapeColor='beige'}
//        Back to menu? Y/N
//        y
//        Welcome to the shape's menu:
//        1. Print data set.
//        2. Calculate the total area of all figures in the data set.
//        3. Calculate the total area of figures of a given type.
//        4. Sorting shapes by increasing the area.
//        5. Sorting shapes by color.
//        6. Exit.
//        Choose a menu item (1-6):
//        2
//        Total area = 1277.083983031042
//        Back to menu? Y/N
//        y
//        Welcome to the shape's menu:
//        1. Print data set.
//        2. Calculate the total area of all figures in the data set.
//        3. Calculate the total area of figures of a given type.
//        4. Sorting shapes by increasing the area.
//        5. Sorting shapes by color.
//        6. Exit.
//        Choose a menu item (1-6):
//        3
//        Welcome to the area's submenu:
//        1. Calculate of the total area of all rectangles.
//        2. Calculate of the total area of all triangles.
//        3. Calculate of the total area of all circles.
//        4. Exit to shape's menu.
//        Choose a menu item (1-3):
//        1
//        Total area of all rectangles = 79.0
//        Back to submenu? Y/N
//        y
//        Welcome to the area's submenu:
//        1. Calculate of the total area of all rectangles.
//        2. Calculate of the total area of all triangles.
//        3. Calculate of the total area of all circles.
//        4. Exit to shape's menu.
//        Choose a menu item (1-3):
//        2
//        Total area of all triangles = 164.5
//        Back to submenu? Y/N
//        y
//        Welcome to the area's submenu:
//        1. Calculate of the total area of all rectangles.
//        2. Calculate of the total area of all triangles.
//        3. Calculate of the total area of all circles.
//        4. Exit to shape's menu.
//        Choose a menu item (1-3):
//        3
//        Total area of all circles = 1033.583983031042
//        Back to submenu? Y/N
//        n
//        Back to menu? Y/N
//        y
//        Welcome to the shape's menu:
//        1. Print data set.
//        2. Calculate the total area of all figures in the data set.
//        3. Calculate the total area of figures of a given type.
//        4. Sorting shapes by increasing the area.
//        5. Sorting shapes by color.
//        6. Exit.
//        Choose a menu item (1-6):
//        4
//        Sorting by area:
//        Circle{radius=2.0, shapeColor='beige'}
//        Rectangle{sideA=5.0, sideB=3.0, shapeColor='red'}
//        Rectangle{sideA=4.0, sideB=4.0, shapeColor='white'}
//        Triangle{base=9.0, height=6.0, shapeColor='red'}
//        Triangle{base=15.0, height=5.0, shapeColor='blue'}
//        Rectangle{sideA=8.0, sideB=6.0, shapeColor='green'}
//        Triangle{base=10.0, height=20.0, shapeColor='black'}
//        Circle{radius=6.0, shapeColor='pink'}
//        Circle{radius=8.0, shapeColor='brown'}
//        Circle{radius=15.0, shapeColor='yellow'}
//        Back to menu? Y/N
//        y
//        Welcome to the shape's menu:
//        1. Print data set.
//        2. Calculate the total area of all figures in the data set.
//        3. Calculate the total area of figures of a given type.
//        4. Sorting shapes by increasing the area.
//        5. Sorting shapes by color.
//        6. Exit.
//        Choose a menu item (1-6):
//        5
//        Sorting by color:
//        Circle{radius=2.0, shapeColor='beige'}
//        Triangle{base=10.0, height=20.0, shapeColor='black'}
//        Triangle{base=15.0, height=5.0, shapeColor='blue'}
//        Circle{radius=8.0, shapeColor='brown'}
//        Rectangle{sideA=8.0, sideB=6.0, shapeColor='green'}
//        Circle{radius=6.0, shapeColor='pink'}
//        Rectangle{sideA=5.0, sideB=3.0, shapeColor='red'}
//        Triangle{base=9.0, height=6.0, shapeColor='red'}
//        Rectangle{sideA=4.0, sideB=4.0, shapeColor='white'}
//        Circle{radius=15.0, shapeColor='yellow'}
//        Back to menu? Y/N
//        n
//
//        Process finished with exit code 0