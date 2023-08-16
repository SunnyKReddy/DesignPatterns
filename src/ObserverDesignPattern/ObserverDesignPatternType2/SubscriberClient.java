package ObserverDesignPattern.ObserverDesignPatternType2;

public class SubscriberClient {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriberA = new SubscriberA();
        Subscriber subscriberB = new SubscriberB();
        Subscriber subscriberC = new SubscriberC();
        publisher.subscribeToNotifications(subscriberA);
        publisher.subscribeToNotifications(subscriberB);
        publisher.subscribeToNotifications(subscriberC);

        PublisherClient publisherClient = new PublisherClient(publisher);

        publisher.unSubscribeToNotifications(subscriberC);
        publisherClient = new PublisherClient(publisher);

    }
}
