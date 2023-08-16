package ObserverDesignPattern.ObserverDesignPatternType2;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    String updatedNotification;

    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribeToNotifications(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unSubscribeToNotifications(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void updateObjectStateChange(String notification){
        this.updatedNotification = notification;
        publishNotificationsToSubscribers();
    }
    public void publishNotificationsToSubscribers(){
        for(Subscriber subscriber: subscribers){
            subscriber.getUpdates(updatedNotification);
        }
    }

}
