package Lessons.main.Library.model;

public class Book {

    private String author;
    private int releaseDate;
    private String title;
    private int pages;
    private String publisher;
    private String isbn;

    public Book (String bookTitle, String bookAuthor, int bookReleaseDate,
          int bookPages, String bookPublisher, String bookIsbn) {
        this(bookTitle, bookAuthor, bookReleaseDate, bookPages, bookPublisher);
        isbn = bookIsbn;
    }

    public Book (String bookTitle, String bookAuthor, int bookReleaseDate,
          int bookPages, String bookPublisher) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.releaseDate = bookReleaseDate;
        this.pages = bookPages;
        this.publisher = bookPublisher;
    }

    public void printInfo () {
        String info = title + "; " + author + "; " + releaseDate
                + "; " + pages + "; " + publisher;
        if (isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
