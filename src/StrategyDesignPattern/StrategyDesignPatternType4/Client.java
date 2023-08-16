package StrategyDesignPattern.StrategyDesignPatternType4;

import FactoryDesignPattern.factorydesignpattern1.Bike;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new Strategy(new BikeTravel());
        strategy.findBestRouteStrategy("Hyderabed", "Bangalore");
        strategy = new Strategy(new CarTravel());
        strategy.findBestRouteStrategy("Hyderabed", "Bangalore");
        strategy = new Strategy(new PublicTransportTravel());
        strategy.findBestRouteStrategy("Hyderabed", "Bangalore");

    }
}
