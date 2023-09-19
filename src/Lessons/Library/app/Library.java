package Lessons.Library.app;

import Lessons.Library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("Hustle Harder","50 cent", 2021, 205, "Pinguin", "12345667889");
        Book book2 = new Book("Letting Go", "David Hawkins", 1998, 225, "Pinguin", "12345667889");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Books available in the library: ");
        book1.printInfo();
        book3.printInfo();


    }

}
