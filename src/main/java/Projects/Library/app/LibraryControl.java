package Projects.Library.app;

import Projects.Library.io.DataReader;
import Projects.Library.model.Book;
import Projects.Library.model.Library;
import Projects.Library.model.Magazine;

public class LibraryControl {


    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();


    public void controlLoop () {
        int option = 0;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("No such option, try again");
            }
        } while (option != EXIT);
    }

    private void printMagazines() {
    library.printMagazines();
    }

    private void addMagazine() {
    Magazine magazine = dataReader.readAndCreateMagazine();
    library.addMagazine(magazine);
    }

    private void exit() {
        System.out.println("The end of program, good bye!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Choose option:");
        System.out.println(EXIT + " - exit");
        System.out.println(ADD_BOOK + " - add new book");
        System.out.println(ADD_MAGAZINE + " - add new magazine");
        System.out.println(PRINT_BOOKS + " - display available books");
        System.out.println(PRINT_MAGAZINES + " - display available magazines");


    }

}
