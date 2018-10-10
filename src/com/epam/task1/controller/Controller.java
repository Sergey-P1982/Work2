package com.epam.task1.controller;

import java.util.Scanner;

import com.epam.task1.data.DataSource;
import com.epam.task1.entity.Book;
import com.epam.task1.model.Books;
import com.epam.task1.view.BooksView;


import java.util.Arrays;

public class Controller {
    private Books model = new Books();
    private BooksView view = new BooksView();
    Scanner scan = new Scanner(System.in);

    public void run() {
        model.setBooks(DataSource.getBooks());
        String moreMenu = "Y";
        do {


            view.printMenu();
            view.printMessage("Choose a menu item (1-5):");
            int menuItem = getMenuItem();
            while (menuItem > 5 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu? Y/N");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                System.out.print("Enter author name: ");
                String author = scan.next();
                searchByAuthor(author);
                break;
            case (2):
                System.out.print("Enter publisher name: ");
                String publisher = scan.next();
                searchByPublisher(publisher);
                break;
            case (3):
                System.out.print("Enter release year: ");
                int releasYear = scan.nextInt();
                searchByYearRelease(releasYear);
                break;
            case (4):
                sortByPublisher();
                break;
            case (5):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();

    }

    private void searchByAuthor(String author) {
        Book[] result = model.getByAuthor(author);
        if (result.length == 0) {
            view.printMessage("Not found any books by author " + author);
        } else {
            view.printBooks("Author - " + author + ":", result);

        }
    }

    private void searchByPublisher(String publisher) {
        Book[] result = model.getByPublisher(publisher);
        if (result.length == 0) {
            view.printMessage("No books published by " + publisher);
        } else {
            view.printBooks("Publisher - " + publisher + ": ", result);

        }
    }

    private void searchByYearRelease(int year) {
        Book[] result = model.getByYearRelease(year);
        if (result.length == 0) {
            view.printMessage("No books found after " + year);
        } else {
            view.printBooks("Books published after " + year + " :", result);

        }
    }


    private void sortByPublisher() {
        view.printBooks("Books after sorting by publisher: ", model.sortByPublisher());

    }
}


