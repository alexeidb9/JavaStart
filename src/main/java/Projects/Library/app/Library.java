package Projects.Library.app;

import Projects.Library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.7";

        Book[] book = new Book[1000];


        book[0] = new Book("Hustle Harder","50 cent", 2021, 205, "Pinguin", "12345667889");
        book[1] = new Book("Letting Go", "David Hawkins", 1998, 225, "Pinguin", "12345667889");
        book[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Books available in the library: ");
        book[0].printInfo();
        book[2].printInfo();


    }

}
