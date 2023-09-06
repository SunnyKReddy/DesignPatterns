package FlyweightDesignPattern.FlyweightDesignPatternType2;

public class BookType {
    private String publication;
    private String producer;
    private String printingPress;

    public BookType(String publication, String producer, String printingPress) {
        this.publication = publication;
        this.producer = producer;
        this.printingPress = printingPress;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "publication='" + publication + '\'' +
                ", producer='" + producer + '\'' +
                ", printingPress='" + printingPress + '\'' +
                '}';
    }

    public String getPublication() {
        return publication;
    }

    public String getProducer() {
        return producer;
    }

    public String getPrintingPress() {
        return printingPress;
    }
}
