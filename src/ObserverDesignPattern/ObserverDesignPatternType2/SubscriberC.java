package ObserverDesignPattern.ObserverDesignPatternType2;

public class SubscriberC implements Subscriber{
    @Override
    public void getUpdates(String newMessage) {
        System.out.println("Subscriber C: -> " + newMessage);
    }
}
