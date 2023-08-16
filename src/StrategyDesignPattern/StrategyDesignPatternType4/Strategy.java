package StrategyDesignPattern.StrategyDesignPatternType4;

public class Strategy {
    Travel travel;
    Strategy(Travel travel){
        this.travel = travel;
    }

    public void findBestRouteStrategy(String source, String destination){
        travel.startJourney(source, destination);
    }
}
