package FlyweightDesignPattern.FlyweightDesignPatternType2;

import java.util.HashMap;

public class FlyweightFactoryBook {
    public static HashMap<String, BookType> books = new HashMap<>();
    public static BookType getBook(String publication, String producer, String printingPress) {
        BookType bookType = books.get(publication);
        if(bookType == null) {
            System.out.println(">>>>>>>>>>.." +"Storing new Publisher Info :" + publication + "..<<<<<<<<<<<");
            books.put(publication, new BookType(publication, producer, printingPress));
            bookType = books.get(publication);
        }
        return bookType;
    }
}
