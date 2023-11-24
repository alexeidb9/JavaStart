package Projects.Library.app;

import Projects.Library.exception.NoSuchOptionException;
import Projects.Library.io.ConsolePrinter;
import Projects.Library.io.DataReader;
import Projects.Library.model.Book;
import Projects.Library.model.Library;
import Projects.Library.model.Magazine;
import Projects.Library.model.Publication;

import java.io.Console;
import java.sql.Struct;
import java.util.InputMismatchException;

public class LibraryControl {

    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);
    private Library library = new Library();


    public void controlLoop () {
        Option option;

        do {
            printOptions();
            option = getOption();
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
                    printer.printLine("No such option, try again");
            }
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage());
            } catch (InputMismatchException e) {
                printer.printLine("Input value is not a number, try again: ");
            }
        }
        return option;

    }

    private void printMagazines() {
     Publication[] publications = library.getPublications();
     printer.printMagazines(publications);
    }

    private void addMagazine() {
    try {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    } catch (InputMismatchException e) {
        printer.printLine("Couldn't create a magazine, wrong input data");
    } catch (ArrayIndexOutOfBoundsException e) {
        printer.printLine("Reached max limit, couldn't add more magazines");
    }
    }

    private void exit() {
        printer.printLine("The end of program, good bye!");
        dataReader.close();
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch (InputMismatchException e) {
            printer.printLine("Couldn't create a book, wrong input data");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Reached max limit, couldn't add more books");
        }
    }

    private void printOptions() {
        printer.printLine("Choose option:");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }


    }

}
