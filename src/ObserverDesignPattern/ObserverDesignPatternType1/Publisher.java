package ObserverDesignPattern.ObserverDesignPatternType1;

public interface Publisher {
    public void subscribeUser(User user);
    public void unSubscribeUser(User user);
    public void sendSportsBuzzLiveUpdate(String description);
}
