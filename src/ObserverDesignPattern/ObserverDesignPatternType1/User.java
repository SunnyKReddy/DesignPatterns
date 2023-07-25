package ObserverDesignPattern.ObserverDesignPatternType1;

public class User implements Subscriber{
    public String userDetails;
    public Publisher publisher;

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    public User(String userDetails, Publisher publisher) {
        this.userDetails = userDetails;
        this.publisher = publisher;
        setUserDetails(this.userDetails);
    }

    @Override
    public void subscribe() {
        this.publisher.subscribeUser(this);
    }

    @Override
    public void unSubscribe() {
        this.publisher.unSubscribeUser(this);
    }

    @Override
    public void getSportzBuzzLiveUpdates(String description) {
        System.out.println("Hi, " + this.userDetails + "SportzBuzz live update: " + description);
    }
}
