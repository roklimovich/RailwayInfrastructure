package pl.pja.edu.s27619.map;

import java.util.LinkedList;
import java.util.Queue;

public class Segment {

    private String city1;
    private String city2;
    private double distance;
    private int id;
    private Queue<String> trainSetsOnSegment;
    private String activeTrain;


    public Segment(String city1, String city2, double distance, int id) {
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
        this.id = id;
        trainSetsOnSegment = new LinkedList<>();
        activeTrain = null;
    }

    /**
     * This method is using to check the active train in segment or not
     *
     * @param locomotiveId - contains locomotive ID
     */
    public synchronized boolean canRun(String locomotiveId) {
        //if we don't have active train on segment we start checking the queue of train sets on segment
        if (activeTrain == null) {
            //if queue is empty, we reassign active train to our current locomotive id and return true
            if (trainSetsOnSegment.isEmpty()) {
                activeTrain = locomotiveId;
                return true;
            } else {
                /*
                 * if we have the same train set in queue which have the same locomotive id, we remove this train set
                 * from queue of train sets on segment, and reassign active train to our locomotive ID and return true
                 */
                if (trainSetsOnSegment.peek().equals(locomotiveId)) {
                    trainSetsOnSegment.remove(locomotiveId);
                    activeTrain = locomotiveId;
                    return true;
                }
            }
        }
        //if we already haven't got current train set, we add current train set to our queue of train sets on segment
        if (!trainSetsOnSegment.contains(locomotiveId)) {
            trainSetsOnSegment.add(locomotiveId);
        }

        return false;
    }

    public synchronized void arrived() {
        activeTrain = null;
    }


    public String getCity1() {
        return city1;
    }


    public String getCity2() {
        return city2;
    }


    public double getDistance() {
        return distance;
    }

    public int getId() {
        return id;
    }


}
