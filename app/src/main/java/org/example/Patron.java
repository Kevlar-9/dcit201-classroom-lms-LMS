package org.example;

import java.util.ArrayList;

// Class to represent a library patron (a person who borrows books)
public class Patron {
    // Name of the patron
    private final String name;
    // List to store the books borrowed by the patron
    private final ArrayList<Book> borrowedBooks;

    // Constructor to initialize the patron's name and borrowedBooks list
    public Patron(String name, int id) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    // Method for the patron to borrow a book from the library
    public void borrowBook(Book book, Library library) {
        // Attempt to remove the book from the library
        if (library.removeBook(book.title())) {
            // If successful, add the book to the patron's borrowedBooks list
            borrowedBooks.add(book);
            // Print confirmation message
            System.out.println(name + " borrowed : " + book.title());
        } else {
            // Print error message if the book is not available
            System.out.println("The Book is not available.");
        }
    }

    // Method for the patron to return a borrowed book to the library
    public void returnBook(Book book, Library library) {
        // Attempt to remove the book from the patron's borrowedBooks list
        if (borrowedBooks.remove(book)) {
            // If successful, add the book back to the library
            library.addBook(book);
            // Print confirmation message
            System.out.println(name + " returned : " + book.title());
        } else {
            // Print error message if the book is not found in the borrowedBooks list
            System.out.println("You don't have this book.");
        }
    }

    // Method to list all the books borrowed by the patron
    public void listBorrowedBooks() {
        // Check if the borrowedBooks list is empty
        if (borrowedBooks.isEmpty()) {
            // Print message if no books are borrowed
            System.out.println("No books borrowed.");
        } else {
            // Initialize a counter for numbering the list
            int counter = 1;
            // Loop through the borrowedBooks list and print each book's title with numbering
            for (Book book : borrowedBooks) {
                System.out.println(counter + ". " + book.title());
                counter++;
            }
        }
    }
}