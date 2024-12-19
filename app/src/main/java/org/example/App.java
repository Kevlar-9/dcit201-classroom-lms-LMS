
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        library.addBook(new Book("A Contemporary Confessions for Modern Gnostics", "Dylan Pahman", 2024));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Third Policeman", "Flann O'Brien", 1967));
        library.addBook(new Book("Towards Colonial Freedom: Africa in the Struggle Against World Imperialism", "Kwame Nkrumah", 1969));


        String star = "******************************";

        // Displaying the list of books in the library
        System.out.println(star);
        System.out.println("       Books in the Library");
        System.out.println(star);
        library.listBooks();
        System.out.println();

        // Creating a patron and borrowing a book
        Patron patron = new Patron("Kwaku Oware", 1001);

        Book bookToBorrow = library.findBookByTitle("To Kill a Mockingbird");
        patron.borrowBook(bookToBorrow, library);
        System.out.println();

        // Displaying the list of borrowed books
        System.out.println(star);
        System.out.println("   Borrowed Books");
        System.out.println(star);
        patron.listBorrowedBooks();
        System.out.println();

        // Returning the borrowed book
        patron.returnBook(bookToBorrow, library);
        System.out.println();

        // Displaying the list of books in the library after operations
        System.out.println(star);
        System.out.println("Books in the Library After Operations");
        System.out.println(star);
        library.listBooks();
        System.out.println();

        // Displaying the detailed list of books with titles and years
        System.out.println(star);
        System.out.println("   Detailed List of Books");
        System.out.println(star);
        library.listBooksTitlesAndYears();
    }
}
