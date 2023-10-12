package Projects.Library.app;

import Projects.Library.io.DataReader;
import Projects.Library.model.Book;
import Projects.Library.model.Library;

public class LibraryControl {


    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;

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
                case PRINT_BOOKS:
                    printBooks();
                    break;
                default:
                    System.out.println("No such option, try again");
            }
        } while (option != EXIT);
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
        System.out.println(PRINT_BOOKS + " - display available books");


    }

}
