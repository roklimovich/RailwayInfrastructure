package pl.pja.edu.s27619.map;

public class PartOfTheRoute {

    private double distance;
    private String endStation;
    private int segmentId;

    public PartOfTheRoute(double distance, String endStation, int segmentId) {
        this.distance = distance;
        this.endStation = endStation;
        this.segmentId = segmentId;
    }

    @Override
    public String toString() {
        return "Distance: " + distance + " EndStation: " + endStation + " SegmentId: " + segmentId;
    }

    public double getDistance() {
        return distance;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getSegmentId() {
        return segmentId;
    }


}
