package com.epam.task2.controller;

import com.epam.task1.data.DataSource;
import com.epam.task2.Data.DataShapes;
import com.epam.task2.entities.Shape;
import com.epam.task2.model.Shapes;
import com.epam.task2.view.ShapesView;

import java.util.Scanner;

public class Controller {
    private Shapes model = new Shapes();
    private ShapesView view = new ShapesView();
    Scanner scan = new Scanner(System.in);

    public void run() {
        model.setShapes(DataShapes.getShapes());
        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (1-6):");
            int menuItem = getMenuItem();
            while (menuItem > 6 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu? Y/N");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();

    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                view.printShapes("All shapes:", model.getShapes());
                break;
            case (2):
                view.printResult("Total area = ", model.getTotalArea());
                break;
            case (4):
                view.printShapes("Sorting by area: ", model.sortByArea());
                break;
            case (5):
                view.printShapes("Sorting by color: ", model.sortByColor());
                break;
            case (6):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }
    }
}
