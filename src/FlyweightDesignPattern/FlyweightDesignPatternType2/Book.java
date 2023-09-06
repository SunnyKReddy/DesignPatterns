package FlyweightDesignPattern.FlyweightDesignPatternType2;

public class Book {
    private String name;
    private double price;
    private String author;
    private BookType bookType;

    public Book(String name, double price, String author, BookType bookType) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.bookType = bookType;
    }

    public void printBookDetails() {
        System.out.println("Book Name: " + this.name);
        System.out.println("Book Price: " + this.price);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Publishers: " + this.bookType.toString());
        System.out.println("******************************");

    }
}
