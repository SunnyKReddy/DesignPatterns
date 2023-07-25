package ObserverDesignPattern.ObserverDesignPatternType1;

import java.util.List;

public class SportzBuzzPublisher implements Commentry, Publisher{
    List<Subscriber> subscribers;
    String commentryDescription;

    //Subscriber user;

    public SportzBuzzPublisher(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void comment(String description) {
        sendSportsBuzzLiveUpdate(description);
    }

    @Override
    public void subscribeUser(User user) {
        //User user = (User) subscriber;
        System.out.println(user.getUserDetails() + " -> Subscribed to SportzBuzz for live Sports updates.");
        subscribers.add(user);
    }

    @Override
    public void unSubscribeUser(User user) {
        //User user = (User) subscriber;
        System.out.println(user.getUserDetails() + " -> UnSubscribed to SportzBuzz.");
        int index = subscribers.indexOf(user);
        subscribers.remove(index);
    }

    @Override
    public void sendSportsBuzzLiveUpdate(String description) {
        for(Subscriber user: subscribers){
            user.getSportzBuzzLiveUpdates(description);
        }
        System.out.println("----------------------------------");
    }
}
