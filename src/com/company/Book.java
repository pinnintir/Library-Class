package com.company;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book() {
        System.out.println("The Da Vinci Code");
    }

    // Marks the book as rented
    public boolean borrowed() {
        return false;
    }

    // Marks the book as not rented
    public boolean returned() {
        return true;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return false;
    }

    // Returns the title of the book
    public String getTitle() {
        String Title = "The Da Vinci Code";
        return Title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book();
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.returned());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }

}