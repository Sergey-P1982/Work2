package com.epam.task1.data;

import com.epam.task1.entity.Book;

public class DataSource {
    public static Book[] getBooks() {
        return new Book[]{
                new Book("Title1", "Shevchenko", "BXV", 1970, 320, 450.0),
                new Book("Title2", "Shevchuk", "BX", 2011, 420, 480.0),
                new Book("Title3", "Ivanov", "XV", 2012, 520, 150.0),
                new Book("Title4", "Petrenko", "BV", 2013, 620, 450.0),
                new Book("Title5", "Sidorenko", "AXV", 2014, 120, 350.0),
                new Book("Title6", "Petrov", "DXV", 2015, 220, 450.0),
                new Book("Title7", "Tkachenko", "TXV", 2016, 250, 750.0),
                new Book("Title8", "Ivanenko", "KXV", 2017, 360, 950.0),
                new Book("Title9", "Shevchenko", "BBV", 2018, 770, 250.0),
                new Book("Title10", "Tarasenko", "AAV", 2018, 680, 1450.0),
        };
    }
}
