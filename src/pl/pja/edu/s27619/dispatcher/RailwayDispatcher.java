package pl.pja.edu.s27619.dispatcher;


import pl.pja.edu.s27619.trainSet.TrainSet;
import pl.pja.edu.s27619.map.PartOfTheRoute;
import pl.pja.edu.s27619.map.RailwayNetwork;

import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class RailwayDispatcher implements IDispatcher {

    private RailwayNetwork railwayNetwork;
    private List<TrainSet> trainSets;
    private Thread fileDumpThread;

    private Integer trainSetsLock = 1;


    public RailwayDispatcher() {
        trainSets = new LinkedList<>();
        railwayNetwork = new RailwayNetwork();

    }

    /**
     * This interface method calculate the route for train set
     *
     * @param sourceStation      - train set source station
     * @param destinationStation - train set destination station
     * @return - the route
     */
    @Override
    public ArrayList<PartOfTheRoute> calculateRoute(String sourceStation, String destinationStation)
            throws UnsupportedRoute {
        return railwayNetwork.getRoute(sourceStation, destinationStation);
    }

    public void addSegmentToMap(String city1, String city2, double distance) {
        railwayNetwork.addSegment(city1, city2, distance);
    }

    public void printInfoAboutSegment() {
        railwayNetwork.infoOfSegment();
    }

    /**
     * This interface method shows us, can train set run in the current segment or not
     *
     * @param locomotiveId - ID of train set locomotive
     * @param segmentId    - ID of current segment
     * @return - true, if train set can run and false, if can't
     */
    @Override
    public boolean canRun(String locomotiveId, int segmentId) {

        return railwayNetwork.canTrainRun(locomotiveId, segmentId);
    }


    /**
     * This interface method says us, that current train set exempt current segment and that segment doesn't have any
     * active train sets
     *
     * @param locomotiveId - ID of train set locomotive
     * @param segmentId    - ID of current segment
     */
    public void arrived(String locomotiveId, int segmentId) {
        railwayNetwork.arrived(locomotiveId, segmentId);
    }

    /**
     * This interface method calculate the whole route of train set
     *
     * @param route - given route of train set
     * @return - the whole distance of the given route
     */
    public double calculateWholeDistance(ArrayList<PartOfTheRoute> route) {
        return railwayNetwork.wholeDistance(route);
    }

    /**
     * This interface method add all train sets into text file and update this file every 5 seconds
     */
    public void addTrainSetIntoFile() {

        while (!Thread.interrupted()) {
            //Sort train sets in descending order of route length between the start and end of the route
            synchronized (trainSetsLock) {
                trainSets.sort(Comparator.comparing(TrainSet::getWholeDistance).reversed());

                try {
                    FileWriter fileWriter = new FileWriter("Info.txt");
                    for (TrainSet trainSet : trainSets) {
                        trainSet.addTrainSetsToFile(fileWriter);
                    }
                    fileWriter.close();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        return;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);

                }


            }
        }

    }


    /**
     * This method add train set to list of all train sets
     *
     * @param trainSet - train set, which we need to add
     */
    public void addTrainSet(TrainSet trainSet) {
        synchronized (trainSetsLock) {
            trainSets.add(trainSet);
        }

    }

    /**
     * In this method we can find all information about all added train sets
     */
    public void infoAboutTrainSet() {
        //Using loop to iterate all train sets from list of all train sets
        synchronized (trainSetsLock) {
            for (TrainSet trainSet : trainSets) {
                trainSet.infOfTrainSet();
            }
        }
    }

    /**
     * This method shows us report message of needed train set
     *
     * @param locomotiveID - ID of train set locomtive
     */
    public void report(String locomotiveID) {
        synchronized (trainSetsLock) {
            for (TrainSet trainSet : trainSets) {
                if (trainSet.getLocomotive().getLocomotiveID().equals(locomotiveID)) {
                    trainSet.report();
                }
            }
        }
    }

    /**
     * In this method we start running all train sets in its own thread
     */
    public void startTrainSets() {
        //Iterate all train sets from the list of all train sets and call method start() for each train set
        synchronized (trainSetsLock) {
            for (TrainSet trainSet : trainSets) {
                trainSet.start();
            }
        }
        fileDumpThread = new Thread(this::addTrainSetIntoFile);

        fileDumpThread.start();
    }

    /**
     * This method we need to stop all train sets in their thread
     */
    public void stopTrainSets() {
        /*
         * Also iterate all train sets from the list of all train sets and for each train set call method interrupt() to
         * stop all thread correctly
         */
        synchronized (trainSetsLock) {
            for (TrainSet trainSet : trainSets) {
                trainSet.interrupt();
            }
        }
        fileDumpThread.interrupt();
    }

}






