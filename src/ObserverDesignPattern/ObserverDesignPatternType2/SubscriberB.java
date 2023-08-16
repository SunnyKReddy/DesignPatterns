package ObserverDesignPattern.ObserverDesignPatternType2;

public class SubscriberB implements Subscriber{
    @Override
    public void getUpdates(String newMessage) {
        System.out.println("Subscriber B: -> " + newMessage);
    }
}
