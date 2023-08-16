package ObserverDesignPattern.ObserverDesignPatternType2;

import java.util.Scanner;

public class PublisherClient {
    CricketCommentryLive cricketCommentryLive = new CricketCommentryLive();
    boolean matchCompleted = false;

    String winner;
    PublisherClient(Publisher publisher){
        Scanner scanner = new Scanner(System.in);
        cricketCommentryLive.setInfo("Match b/w Ind & Pak started!!", publisher);
        //cricketCommentryLive.setInfo("India elected to Bat first!", publisher);
        while(!matchCompleted){
            System.out.println("Enter Match Updated Information: ");
            String info = scanner.nextLine();
            cricketCommentryLive.setInfo(info, publisher);
            System.out.println("Is there a winner (y/n or Y/N)? ");
            this.winner = scanner.nextLine();
            if(winner == "y" || winner == "Y"){
                this.matchCompleted = true;
            }
        }
    }
}
