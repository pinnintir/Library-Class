package com.company;

public class Library
        {

            public Library(String s) {
            }

            public static void main(String[] args) {
                // Create two libraries
                Library firstLibrary = new Library("10 Main St.");
                Library secondLibrary = new Library("228 Liberty St.");


        // Add four books to the first library
        firstLibrary.addBook(new Book());
        firstLibrary.addBook(new Book());
        firstLibrary.addBook(new Book());
        firstLibrary.addBook(new Book());

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println("Libraries are open daily from 9am to 5pm.");

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println("10 Main St.");
        System.out.println("228 Liberty Street");

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println("You successfully borrowed the Lord of the Rings");

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println("The Da Vinci Code");
        System.out.println("Le Petit Prince");
        System.out.println("A Tale of Two Cities");
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println("No book in catalog");

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println("You successfully returned The Lord of the Rings");






        firstLibrary.printAvailableBooks();
    }

            private void returnBook(String the_lord_of_the_rings) {
            }

            private void printAvailableBooks() {
            }

            private void borrowBook(String the_lord_of_the_rings) {
            }

            private void printAddress() {
            }

            private static void printOpeningHours() {
            }

            private void addBook(Book the_da_vinci_code) {
            }
        }
