package ObserverDesignPattern.ObserverDesignPatternType2;

public class SubscriberA implements Subscriber{
    @Override
    public void getUpdates(String newMessage) {
        System.out.println("Subscriber A: -> " + newMessage);
    }
}
