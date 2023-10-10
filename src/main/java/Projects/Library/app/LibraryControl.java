package Projects.Library.app;

import Projects.Library.io.DataReader;
import Projects.Library.model.Book;
import Projects.Library.model.Library;

import static java.lang.System.exit;

public class LibraryControl {


    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();


    public void controlLoop () {
        int option = 0;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case exit:
                    exit();
                    break;
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                default:
                    System.out.println("No such option, try again");
            }
        } while (option != exit);
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
        System.out.println(exit + " - exit");
        System.out.println(addBook + " - add new book");
        System.out.println(printBooks+ " - display available books");


    }

}
