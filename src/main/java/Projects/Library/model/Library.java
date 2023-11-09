package Projects.Library.model;

public class Library {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("Books limit in a library has been reached.");

        }
    }

    public void printBooks () {

        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
        if(publications[i] instanceof Book) {
            System.out.println(publications[i].toString());
            countBooks++;
            }
        }
        if(countBooks == 0) {
            System.out.println("There are no books in a library.");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("Magazines limit in a library has been reached.");

        }
    }


    public void printMagazines () {
        int countMagazines = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if(publications[i] instanceof Magazine) {
                System.out.println(publications[i].toString());
                countMagazines++;
            }
        }
        if(countMagazines == 0) {
            System.out.println("There are no magazines in a library.");
        }
    }

}
