package pl.pja.edu.s27619.dispatcher;

import pl.pja.edu.s27619.locomotive.Locomotive;
import pl.pja.edu.s27619.map.PartOfTheRoute;
import pl.pja.edu.s27619.map.Segment;

import java.util.ArrayList;

public interface IDispatcher {

    public ArrayList<PartOfTheRoute> calculateRoute(String sourceStation, String destinationStation)
            throws UnsupportedRoute;
    public boolean canRun(String locomotiveId, int segmentId);
    public void arrived (String locomotiveId, int segmentId);
    public double calculateWholeDistance(ArrayList<PartOfTheRoute> route);

}
