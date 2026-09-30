```java
/* 
@author: Jaysen Noell
@ Date: 9/28/2026
*/

package com.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Creates a HashMap to store books using the book ID as the key
        HashMap<Integer, Book> salesMap = new HashMap<>();

        // Stores the name of the CSV file containing the sales data
        String fileName = "sales.csv";

        // Opens the sales file for reading and creates a file for logging exceptions
        try (
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            FileWriter exceptionLog = new FileWriter("exception.log")
        ) {

            String line;

            // Reads and skips the header row of the CSV file
            reader.readLine();

            // Reads each line of the CSV file until there are no more lines
            while ((line = reader.readLine()) != null) {

                try {
                    // Splits the current row into separate values using commas
                    String[] parts = line.split(",", -1);

                    // Checks that the row contains exactly four pieces of data
                    if (parts.length != 4) {
                        exceptionLog.write("Invalid row: " + line + "\n");
                        continue;
                    }

                    // Checks for any missing or empty data fields
                    if (parts[0].trim().isEmpty()
                            || parts[1].trim().isEmpty()
                            || parts[2].trim().isEmpty()
                            || parts[3].trim().isEmpty()) {

                        exceptionLog.write("Missing data: " + line + "\n");
                        continue;
                    }

                    // Converts the book ID from text to an integer
                    int bookID = Integer.parseInt(parts[0].trim());

                    // Gets the book title and removes extra spaces
                    String title = parts[1].trim();

                    // Converts the quantity sold from text to an integer
                    int quantitySold = Integer.parseInt(parts[2].trim());

                    // Converts the price per unit from text to a double
                    double pricePerUnit = Double.parseDouble(parts[3].trim());

                    // Checks that quantity and price are not negative
                    if (quantitySold < 0 || pricePerUnit < 0) {
                        exceptionLog.write("Invalid numeric data: " + line + "\n");
                        continue;
                    }

                    // Checks whether this book ID already exists in the HashMap
                    if (salesMap.containsKey(bookID)) {

                        // Gets the existing Book object from the HashMap
                        Book existingBook = salesMap.get(bookID);

                        // Adds the new quantity to the book's existing quantity
                        existingBook.aggregateQty(quantitySold);

                    } else {

                        // Creates a new Book object for a book ID that has not been seen yet
                        Book newBook = new Book(
                                bookID,
                                title,
                                quantitySold,
                                pricePerUnit
                        );

                        // Adds the new Book object to the HashMap
                        salesMap.put(bookID, newBook);
                    }

                } catch (NumberFormatException e) {

                    // Logs the row if a number cannot be converted correctly
                    exceptionLog.write(
                            "Invalid number format: " + line + "\n"
                    );
                }
            }

        } catch (IOException e) {

            // Displays an error if the sales file cannot be read or the log cannot be created
            System.out.println("Error reading the sales file: " + e.getMessage());
            return;
        }

        // Prints the heading for the sales summary
        System.out.println("BOOK SALES SUMMARY");

        // Keeps track of the total revenue from all books
        double totalRevenue = 0;

        // Stores the book with the highest total revenue
        Book highestRevenueBook = null;

        // Stores the book with the highest total quantity sold
        Book highestQuantityBook = null;

        // Loops through every book stored in the HashMap
        for (Map.Entry<Integer, Book> entry : salesMap.entrySet()) {

            // Gets the Book object from the current HashMap entry
            Book book = entry.getValue();

            // Prints the information for the current book
            System.out.printf(
                    "ID: %d Title: %s Total Quantity Sold: %d Total Revenue: %.2f%n",
                    book.getBookID(),
                    book.getTitle(),
                    book.getTotalQuantitySold(),
                    book.getTotalRevenue()
            );

            // Adds the current book's revenue to the overall revenue
            totalRevenue += book.getTotalRevenue();

            // Checks if this book has the highest revenue so far
            if (highestRevenueBook == null
                    || book.getTotalRevenue() > highestRevenueBook.getTotalRevenue()) {

                // Updates the highest revenue book
                highestRevenueBook = book;
            }

            // Checks if this book has the highest quantity sold so far
            if (highestQuantityBook == null
                    || book.getTotalQuantitySold() > highestQuantityBook.getTotalQuantitySold()) {

                // Updates the highest quantity sold book
                highestQuantityBook = book;
            }
        }

        // Prints the total revenue from all books
        System.out.printf("%nTotal Revenue Across All Books: %.2f%n", totalRevenue);

        // Prints the book with the highest total revenue, if one exists
        if (highestRevenueBook != null) {
            System.out.printf(
                    "Book with Highest Revenue: %s (%.2f)%n",
                    highestRevenueBook.getTitle(),
                    highestRevenueBook.getTotalRevenue()
            );
        }

        // Prints the book with the highest quantity sold, if one exists
        if (highestQuantityBook != null) {
            System.out.printf(
                    "Book with Highest Quantity Sold: %s (%d)%n",
                    highestQuantityBook.getTitle(),
                    highestQuantityBook.getTotalQuantitySold()
            );
        }
    }
}
```
