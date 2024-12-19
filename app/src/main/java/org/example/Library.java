
package org.example;

import java.util.ArrayList;

// Class to represent a library containing books
public class Library {
    private final ArrayList<Book> books;


    // Constructor to initialize the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library by title
    public boolean removeBook(String title) {
        return books.removeIf(book -> book.title().equals(title));
    }

    // Method to find a book in the library by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title().equals(title)) {
                return book;
            }
        }
        return null;
    }


    // Method to list only book titles with numbering
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + "." + book.title());
                counter++;
            }
        }
    }

    // Method to list book titles and years with numbering
    public void listBooksTitlesAndYears() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + "." + book.title() + " (" + book.yearPublished() + ")");
                counter++;
            }
        }
    }
}
