package ObserverDesignPattern.ObserverDesignPatternType1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Subscriber> subscriberList = new ArrayList<Subscriber>();
        Publisher publisher = new SportzBuzzPublisher(subscriberList);
        //System.out.println(subscriberList);
        Subscriber user1 = new User("Sunny [AP, INDIA]", publisher);
        user1.subscribe();
        //System.out.println(subscriberList.get(0));
        Commentry commentry = (Commentry) publisher;
        //commentry.comment("Crticket Match just started...");

        Subscriber user2 = new User("Gayathri [AP, INDIA]", publisher);
        user2.subscribe();
        //commentry.comment("Good Start! Unplayable delivery from Indian Bowler -> Mohammad Shami");

        Subscriber user3 = new User("Kousik [KA, India]", publisher);
        user3.subscribe();
        //commentry.comment("Good Over for India... Score update after 1 over/s (R/W): 1/0 -> Shami Replaced by Siraj");

        Subscriber user4 = new User("VenuGopal [TN, India]", publisher);
        user4.subscribe();
        commentry.comment("Boundary for Australia from David Warner 1.3 over/s (R/W): 7/0");

        user3.unSubscribe();

        commentry.comment("Good comback from Australia with another boundary from Arron Finch 2 over/s (R/W): 12/0");

    }
}
