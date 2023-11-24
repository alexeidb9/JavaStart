package Projects.Library.io;

import Projects.Library.model.Book;
import Projects.Library.model.Magazine;
import Projects.Library.model.Publication;

public class ConsolePrinter {

    public void printMagazines (Publication[] publications) {
        int countMagazines = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                System.out.println(publication.toString());
                countMagazines++;
            }
        }
        if(countMagazines == 0) {
            printLine("There are no magazines in a library.");
        }
    }


    public void printBooks (Publication[] publications) {

        int countBooks = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                System.out.println(publication.toString());
                countBooks++;
            }
        }
        if(countBooks == 0) {
            printLine("There are no books in a library.");
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }

}
