
package org.example;

/**
 * A record to represent a book.
 */
public record Book(String title, String author, int yearPublished) {
    // The constructor and field initialization are automatically handled by the record feature.
}
