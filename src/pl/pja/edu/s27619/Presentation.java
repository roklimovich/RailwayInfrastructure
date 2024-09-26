package pl.pja.edu.s27619;

import pl.pja.edu.s27619.cars.*;
import pl.pja.edu.s27619.dispatcher.RailwayDispatcher;

import pl.pja.edu.s27619.locomotive.Locomotive;

import pl.pja.edu.s27619.trainSet.ConnectImpossible;
import pl.pja.edu.s27619.trainSet.TrainSet;


import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {

        //generate Railroad car for baggage
        RailroadCarForBaggage railroadCarForBaggage = new RailroadCarForBaggage();
        System.out.println(railroadCarForBaggage);
        Scanner scanner = new Scanner(System.in);

        //generate Railroad car for passengers
        RailroadCarForPassengers railroadCarForPassengers = new RailroadCarForPassengers();
        System.out.println(railroadCarForPassengers);


        //create locomotive
        Locomotive locomotive = new Locomotive("Test0",
                "Gomel", "Test2");

        //create railway dispatcher
        RailwayDispatcher railwayDispatcher = new RailwayDispatcher();

        railwayDispatcher.addSegmentToMap("Gomel", "Test2", 10);

        //create train set
        TrainSet trainSet = new TrainSet(locomotive, railwayDispatcher);

        //connect basic railroad car and load railroad car
        try {

            try {
                railroadCarForBaggage.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Warning! Connect is impossible, because " + e.getMessage());
            }

            trainSet.connectRailroadCar(railroadCarForBaggage);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }

        //connect and load railroad car for passengers
        try {
            try {
                railroadCarForPassengers.loadingPeople(50);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Warning! Connect is impossible, because " + e.getMessage());
            }
            trainSet.connectRailroadCar(railroadCarForPassengers);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        //add train set in list of all train sets
        railwayDispatcher.addTrainSet(trainSet);

        //get info about train set
        railwayDispatcher.infoAboutTrainSet();

        //remove railroad car from train set
        trainSet.removeRailroadCar(railroadCarForBaggage.getRailroadCarID());

        //get info about train set
        railwayDispatcher.infoAboutTrainSet();


        Locomotive locomotive1 = new Locomotive("Test2", "Test2", "Gomel");
        TrainSet trainSet1 = new TrainSet(locomotive1, railwayDispatcher);
        railwayDispatcher.addTrainSet(trainSet1);

        railwayDispatcher.startTrainSets();

        int sc = scanner.nextInt();

        while (sc != 1) {
            railwayDispatcher.report(trainSet.getLocomotive().getLocomotiveID());
            railwayDispatcher.report(trainSet1.getLocomotive().getLocomotiveID());
            sc = scanner.nextInt();

        }

        railwayDispatcher.stopTrainSets();

    }
}