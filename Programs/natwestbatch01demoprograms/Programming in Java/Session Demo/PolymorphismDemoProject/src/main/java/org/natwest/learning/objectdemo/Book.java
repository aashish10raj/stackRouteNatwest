package org.natwest.learning.objectdemo;

class ToStringImpl{
    public static void main(String[] args) {
        Book book1=new Book(1123, "Origin", "Dan Brown", 2500.00);
        Book book2=new Book(2234, "The Alchemist", "Paul Coehlo", 3500.00);
        Book book3=new Book(3323, "3 Mistakes of my Life", "Chetan Bhagat", 1500.00);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}

public class Book {
    int isbnNumber;
    String bookName;
    String Author;
    double price;

    public Book(int isbnNumber, String bookName, String author, double price) {
        this.isbnNumber = isbnNumber;
        this.bookName = bookName;
        Author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber=" + isbnNumber +
                ", bookName='" + bookName + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }
}
