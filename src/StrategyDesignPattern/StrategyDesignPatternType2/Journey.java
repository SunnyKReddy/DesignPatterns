package StrategyDesignPattern.StrategyDesignPatternType2;

import java.util.Locale;

public class Journey implements JourneyI{
    String source;
    String destination;
    ModeOfTransport modeOfTransport;
    Journey(String source, String destination, ModeOfTransport modeOfTransport) {
        this.source = source;
        this.destination = destination;
        this.modeOfTransport = modeOfTransport;
        startJourney(source, destination, modeOfTransport);
    }

    @Override
    public void startJourney(String source, String destination, ModeOfTransport modeOfTransport) {
        System.out.println("Started Journey from: " + source.toUpperCase() + " to: " + destination.toUpperCase());
        ModeOfTransport mode = modeOfTransport;
        Travel travel;
        switch (mode){
            case BUS: travel = new BusTravel(); travel.travel(); break;
            case TRAIN: travel = new TrainTravel(); travel.travel(); break;
            case CAR: travel = new CarTravel(); travel.travel(); break;
            case BIKE: travel = new BikeTravel(); travel.travel(); break;
            case WALK: travel = new WalkTravel(); travel.travel(); break;
            default:
                travel = new CarTravel(); travel.travel(); break;
        }

    }
}
