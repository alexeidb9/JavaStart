package Projects.Library.app;

import Projects.Library.io.DataReader;
import Projects.Library.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.8";

        DataReader dr = new DataReader();

        Book[] books = new Book[1000];

        books[0] = dr.readAndCreateBook();
        books[1] = dr.readAndCreateBook();
        dr.close();


        System.out.println(appName);
        System.out.println("Books available in the library: ");
        books[0].printInfo();
        books[1].printInfo();


    }

}
