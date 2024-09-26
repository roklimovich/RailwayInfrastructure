package pl.pja.edu.s27619.trainSet;

import pl.pja.edu.s27619.cars.BasicRailroadCar;
import pl.pja.edu.s27619.cars.RailroadCarForPassengers;
import pl.pja.edu.s27619.dispatcher.IDispatcher;
import pl.pja.edu.s27619.dispatcher.UnsupportedRoute;
import pl.pja.edu.s27619.locomotive.Locomotive;
import pl.pja.edu.s27619.locomotive.RailroadHazard;
import pl.pja.edu.s27619.map.PartOfTheRoute;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TrainSet extends Thread {

    private Locomotive locomotive;
    private List<BasicRailroadCar> railroadCars;
    private IDispatcher dispatcher;
    private double wholeDistance;
    private double segmentDistance;
    private double traveledDistance;
    private double currentDistanceOnSegment;
    private int currentNumOfRailroadCars;
    private int currentNumRailroadCarsWithElectricity;
    private int currentWeightOfTrainSet;


    public TrainSet(Locomotive locomotive, IDispatcher dispatcher) {
        this.locomotive = locomotive;
        railroadCars = new LinkedList<>();
        this.dispatcher = dispatcher;
        currentDistanceOnSegment = 0;
        currentNumOfRailroadCars = 0;
        currentNumRailroadCarsWithElectricity = 0;
        currentWeightOfTrainSet = 0;
        wholeDistance = 0;

    }

    /**
     * This method check and connect railroad car to train set
     *
     * @param railroadCar - railroad car which we need to connect
     * @throws ConnectImpossible - exception
     */
    public void connectRailroadCar(BasicRailroadCar railroadCar) throws ConnectImpossible {
        /*
         * If current number of railroad cars + the next one is grater than maximum of railroad cars which can
         * get locomotive, we throw exception
         */
        if (currentNumOfRailroadCars + 1 > locomotive.getMaxNumOfRailroadCars()) {
            throw new ConnectImpossible("Max num of railroad cars is exceed.");
        }

        /*
         * If current number of railroad cars + next one railroad car with electricity grid is grater than maximum of
         * railroad cars which can get locomotive with electricity grid, we throw exception, too
         */
        if (currentNumRailroadCarsWithElectricity + 1 > locomotive.getMaxNumOfRailroadCarsWithElectricityGrid()) {
            throw new ConnectImpossible("Max num of railroad cars with electricity grid is exceed.");
        }

        /*
         * If current weight of train set + next railroad car weight, is grater than maximum weight of locomotive,
         * we throw exception
         */
        if (currentWeightOfTrainSet + railroadCar.getCurrentWeight() > locomotive.getMaxWeight()) {
            throw new ConnectImpossible("Max weight of train set is exceed.");
        }


        currentNumOfRailroadCars++; //counter for connected railroad cars to train set

        /*
         * If railroad car need electricity, we also make addition counter for railroad cars which need electricity grid
         */
        if (railroadCar.isElectricityRequired()) {
            currentNumRailroadCarsWithElectricity++;
        }

        currentWeightOfTrainSet += railroadCar.getCurrentWeight(); //counter for current weight of train set

        railroadCars.add(railroadCar); //connect railroad car to train set

    }

    /**
     * This method remove railroad cars from train set
     *
     * @param railroadCarID - unique railroad car ID
     */
    public void removeRailroadCar(String railroadCarID) {
        /*
         * Using the for-each loop we iterate all railroad cars from train set
         */
        for (BasicRailroadCar basicRailroadCar : railroadCars) {
            /*
             * If we find railroad car which have the same id as in parameter, we remove railroad car from list
             * of railroad cars which take our train set
             */
            if (basicRailroadCar.getRailroadCarID().equals(railroadCarID)) {
                railroadCars.remove(basicRailroadCar);
                currentNumOfRailroadCars--; // remove this railroad car from our counter
                /*
                 * If railroad car used electricity grid, we also remove this railroad car from counter railroad cars
                 * with electricity grid
                 */
                if (basicRailroadCar.isElectricityRequired()) {
                    currentNumRailroadCarsWithElectricity--;
                }

                /*
                 * Subtract the weight of removed railroad car from current weight of train set
                 */
                currentWeightOfTrainSet -= basicRailroadCar.getCurrentWeight();
                break;
            }
        }
    }

    /**
     * This method starts running our train set on the required route.
     */
    @Override
    public void run() {
        ArrayList<PartOfTheRoute> route; //local variable which contain rhe route of train set
        //variable which contains information about source station of the train set
        String sourceStation = locomotive.getSourceStation();
        //variable which contains information about destination station of the train set
        String destinationStation = locomotive.getDestinationStation();
        //variable which shows in which way train set is going, if true - forward, if false - backward
        boolean isDirect = true;

        while (true) {

            /*
             * Firstly, we need to calculate the route of train set and check in which way train set going.
             * If true, calculate the forward route, if false, calculate the backward route.
             */

            try {
                if (isDirect) {
                    route = dispatcher.calculateRoute(sourceStation,
                            destinationStation);
                } else {
                    route = dispatcher.calculateRoute(destinationStation,
                            sourceStation);
                }

            } catch (UnsupportedRoute e) {
                System.out.println(e.getMessage());
                break;
            }

            //variable which contains whole distance from source station and destination station
            wholeDistance = dispatcher.calculateWholeDistance(route);

            //Using the loop we iterate all segment of the given route
            for (int i = 0; i < route.size(); i++) {

                //Check if thread is interrupted, we stop our train set, if not continue
                if (isInterrupted()) {
                    return;
                }

                //Calculate segment distance of the route
                segmentDistance = route.get(i).getDistance();

                //Variable which contains information about can train set run on the segment or not.
                boolean canRun;

                //Using this loop we check can train set run or not
                do {
                    canRun = dispatcher.canRun(locomotive.getLocomotiveID(), route.get(i).getSegmentId());

                    /*
                     * If canRun equals false we wait 10 seconds and after this 10 seconds we try again,
                     * until canRun will be true
                     */
                    if (!canRun) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                } while (!canRun && !isInterrupted());

                //Variable which contains information about started time of the train
                long startTime = System.currentTimeMillis();

                /*
                 * Using loop we check if the current distance on segment is grater the distance of route segment
                 * or not. If true, we break our loop, if false we continue our loop until train set has passed the
                 * distance of current segment
                 */
                while (currentDistanceOnSegment < route.get(i).getDistance() && !isInterrupted()) {

                    //Wait one second to recalculate all necessary information
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }

                    //Variable which contains information about current time
                    long currentTime = System.currentTimeMillis();
                    //Variable which contains the differences between current time and start time in hours
                    double hours = (currentTime - startTime) / 3600000.0;
                    //Recalculate the current distance of train set on segment using new values
                    currentDistanceOnSegment += locomotive.getSpeed() * hours;
                    //Recalculate traveled distance of the train set
                    traveledDistance += locomotive.getSpeed() * hours;
                    //Reassign start time of train set with the current time
                    startTime = currentTime;

                    //Change speed of the train set
                    try {
                        locomotive.changeSpeed();
                    } catch (RailroadHazard e) {
                        System.out.println("Warning! " + e.getMessage());
                        System.out.println(" Train set ID: " + locomotive.getLocomotiveID() + "Train set name: " +
                                locomotive.getName() + " Current num of railroad cars:" +
                                currentNumOfRailroadCars);
                    }


                }

                /*
                 * When train set arrived of the current segment, he gives to dispatcher special signal, that this
                 * segment is empty and another train set can run on this segment without any problems
                 */
                dispatcher.arrived(locomotive.getLocomotiveID(), route.get(i).getSegmentId());

                /*
                 * The next current distance of train set on segment will be zero, because train set only starting to
                 * ride on the next segment
                 */
                currentDistanceOnSegment = 0;
                /*
                 * We check if our train set ride to destination station or not, if yes, we break the loop and
                 * start another action. If not we continue.
                 */
                if (route.get(i).getEndStation().equals(destinationStation)) {
                    break;
                }

                /*
                 * If not, we wait 2 seconds on the current station and start ride to another station
                 */
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    return;
                }
            }

            /*
             * If we reached our destination station we wait 30 seconds and start our trip in backward way
             */
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                return;
            }


            isDirect = !isDirect;
        }
    }

    /**
     * This method can show all basic information about train set.
     */
    public void infOfTrainSet() {

        System.out.println("Locomotive ID: " + locomotive.getLocomotiveID() + " Locomotive name: " +
                locomotive.getName() + " \n Home Station: " + locomotive.getHomeRailwayStation() +
                "\n Source Station: " + locomotive.getSourceStation() + " \n Destination Station: " +
                locomotive.getDestinationStation());
        /*
         * Using the loop we iterate each railroad car which was connected to train set and print basic information
         * about them.
         */
        for (BasicRailroadCar railroadCar : railroadCars) {
            System.out.println("Railroad car ID: " + railroadCar.getRailroadCarID() + " Railroad car type: " +
                    railroadCar.getType());
        }

        System.out.println("Current num of railroad cars: " + currentNumOfRailroadCars);
        System.out.println("Current num of railroad cars with electricity gird: " +
                currentNumRailroadCarsWithElectricity);
        System.out.println("Current weight of train set: " + currentWeightOfTrainSet);
    }

    /**
     * This method make a report of necessary train
     *
     */
    public void report() {
        System.out.println("Locomotive ID: " + locomotive.getLocomotiveID() +
                ", Locomotive name: " + locomotive.getName() + ", Current num of railroad cars: " +
                currentNumOfRailroadCars + ", Current num of railroad cars with electricity gird: " +
                currentNumRailroadCarsWithElectricity);

        //Using the loop we iterate all railroad cars of train set
        for (BasicRailroadCar basicRailroadCar : railroadCars) {
            /*
             * Then we check, if basic railroad car has type of railroad car of passengers, we calculate the number of
             * people based on the transported goods, if not, we print basic information about railroad cars.
             */
            if (basicRailroadCar instanceof RailroadCarForPassengers) {
                int numOfPeopleBasedOnTheGoods =
                        ((RailroadCarForPassengers) basicRailroadCar).getCurrentWeightOfPeople() / 80;

                System.out.println("Railroad car ID: " + basicRailroadCar.getRailroadCarID() + ", Railroad car type: " +
                        basicRailroadCar.getType() + ", Shipper name: " + basicRailroadCar.getShipperName() + ", " +
                        "Number of people based on transported goods: " + numOfPeopleBasedOnTheGoods);
            } else {
                System.out.println("Railroad car ID: " + basicRailroadCar.getRailroadCarID() + ", Railroad car type: " +
                        basicRailroadCar.getType() + ", Shipper name: " + basicRailroadCar.getShipperName() +
                        ", Current weight of railroad car: " + basicRailroadCar.getCurrentWeight());
            }

        }
        //Calculate the percent of total distance
        int percentOfTotalDistance = (int) (traveledDistance / wholeDistance * 100);
        System.out.println("Percent of total distance: " + percentOfTotalDistance + "%");

        //Calculate the percent of the nearest station distance
        int percentOfNearestStationDistance = (int)
                (traveledDistance / segmentDistance * 100);
        System.out.println("Percent of the nearest station: " + percentOfNearestStationDistance + "%");

    }

    /**
     * This method write all exciting train sets in text file
     *
     * @param fileWriter - text file writer
     * @throws IOException - necessary exception for FileWriter
     */
    public void addTrainSetsToFile(FileWriter fileWriter) throws IOException {
        fileWriter.write("Train ID: " + locomotive.getLocomotiveID() + " Train set name: " +
                locomotive.getName() + System.lineSeparator() + "Whole distance: " +
                getWholeDistance() + System.lineSeparator() +
                "Source station: " + locomotive.getSourceStation() + " Destination station: " +
                locomotive.getDestinationStation() + System.lineSeparator());

        //Sort railroad cars by weight from the highest to the lowest one
        railroadCars.sort(Comparator.comparing(BasicRailroadCar::getCurrentWeight).reversed());

        //Using the loop call for each railroad car special method dump
        for (BasicRailroadCar railroadCar : railroadCars) {
            railroadCar.dump(fileWriter);

        }

    }



    public double getWholeDistance() {
        return wholeDistance;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

}

