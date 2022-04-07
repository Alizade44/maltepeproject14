package tr.edu.maltepe.oop;


public class Book {
    // Add the missing implementation to this class!
    private String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }


    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }


    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }


    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }


    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
