package com.learn.operators;

class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    { // Object init
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowed() {
        if ( isBorrowed ) {
            System.out.println("Book is already Borrowed");
        } else {
            isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if ( isBorrowed ) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoy, Please give a review.");
        } else {
            System.out.println("This book is already in the library");
        }
    }

 public static void main(String[] args) {
  Book designOfThings = new Book("1","Design","Author");
  Book myBook = new Book("2");
     System.out.println(Book.getTotalNoOfBooks());
  designOfThings.borrowed();
  myBook.borrowed();
  designOfThings.borrowed();
  designOfThings.returnBook();
  designOfThings.returnBook();

 }
}
