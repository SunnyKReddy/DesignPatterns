package FlyweightDesignPattern.FlyweightDesignPatternType2;

import FlyweightDesignPattern.FlyweightDesignPatternType1.FlyweightFactory;

public class Client {
    public static void main(String[] args) {
        BookType bookType = FlyweightFactoryBook.getBook("MS Publishers", "GK productions", "GKR Press");
        Book book = new Book("Life & Death", 120.0, "Rama", bookType);
        book.printBookDetails();
        BookRepository.booksRepo.put("Life & Death", book);
        bookType = FlyweightFactoryBook.getBook("MS Publishers", "GK productions", "GKR Press");
        book = new Book("Start & Stop", 150.0, "Dhanvantri", bookType);
        book.printBookDetails();
        BookRepository.booksRepo.put("Start & Stop", book);
        bookType = FlyweightFactoryBook.getBook("VB Publishers", "Bhargav productions", "VBR Press");
        book = new Book("Money & Mind", 250.0, "VenuBhargav", bookType);
        book.printBookDetails();
        BookRepository.booksRepo.put("Money & Mind", book);
    }
}
