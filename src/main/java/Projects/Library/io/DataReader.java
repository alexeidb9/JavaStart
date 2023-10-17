package Projects.Library.io;

import Projects.Library.model.Book;
import Projects.Library.model.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook () {
        System.out.println("Title:");
        String title = sc.nextLine();
        System.out.println("Author:");
        String author = sc.nextLine();
        System.out.println("Publisher:");
        String publisher = sc.nextLine();
        System.out.println("ISBN:");
        String isbn = sc.nextLine();
        System.out.println("Release year:");
        int releaseDate = getInt();
        System.out.println("Number of pages:");
        int pages = getInt();

        return new Book(title,author,releaseDate, pages,publisher,isbn);
    }

    public Magazine readAndCreateMagazine () {
        System.out.println("Title:");
        String title = sc.nextLine();
        System.out.println("Publisher:");
        String publisher = sc.nextLine();
        System.out.println("Language:");
        String language = sc.nextLine();
        System.out.println("Release year:");
        int year = getInt();
        System.out.println("Month:");
        int month = getInt();
        System.out.println("Day");
        int day = getInt();

        return new Magazine(title,publisher,language,year,month,day);
    }

    public int getInt () {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public void close() {
        sc.close();
    }


}
