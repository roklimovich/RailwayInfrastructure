package pl.pja.edu.s27619.map;

import pl.pja.edu.s27619.dispatcher.UnsupportedRoute;

import java.util.*;

public class RailwayNetwork {

    private HashMap<String, ArrayList<String>> cityMap;
    private List<Segment> segments;
    private int nextSegmentId;

    public RailwayNetwork() {
        segments = new LinkedList<>();
        cityMap = new HashMap<>();
        nextSegmentId = 0;


        Segment segment = new Segment("Bialystok", "Warsaw", 180, nextSegmentId);
        segments.add(segment);
        nextSegmentId++;

        Segment segment1 = new Segment("Gdansk", "Warsaw", 210, nextSegmentId);
        segments.add(segment1);
        nextSegmentId++;

        Segment segment2 = new Segment("Warsaw", "Lodz", 176, nextSegmentId);
        segments.add(segment2);
        nextSegmentId++;

        Segment segment3 = new Segment("Lodz", "Lublin", 99, nextSegmentId);
        segments.add(segment3);
        nextSegmentId++;

        Segment segment4 = new Segment("Lodz", "Kielce", 189, nextSegmentId);
        segments.add(segment4);
        nextSegmentId++;

        Segment segment5 = new Segment("Lodz", "Poznan", 107, nextSegmentId);
        segments.add(segment5);
        nextSegmentId++;

        Segment segment6 = new Segment("Kielce", "Rzeszow", 157, nextSegmentId);
        segments.add(segment6);
        nextSegmentId++;

        Segment segment7 = new Segment("Kielce", "Krakow", 200, nextSegmentId);
        segments.add(segment7);
        nextSegmentId++;

        Segment segment8 = new Segment("Poznan", "Opole", 140, nextSegmentId);
        segments.add(segment8);
        nextSegmentId++;

        Segment segment9 = new Segment("Poznan", "Wroclaw", 168, nextSegmentId);
        segments.add(segment9);
        nextSegmentId++;

        Segment segment10 = new Segment("Grodno", "Bialystok", 200, nextSegmentId);
        segments.add(segment10);
        nextSegmentId++;

        Segment segment11 = new Segment("Litva", "Bialystok", 300, nextSegmentId);
        segments.add(segment11);
        nextSegmentId++;

        Segment segment12 = new Segment("Grodno", "Minsk", 400, nextSegmentId);
        segments.add(segment12);
        nextSegmentId++;

        Segment segment13 = new Segment("Minsk", "Vitebsk", 250, nextSegmentId);
        segments.add(segment13);
        nextSegmentId++;

        Segment segment14 = new Segment("Vitebsk", "Grodno", 300, nextSegmentId);
        segments.add(segment14);
        nextSegmentId++;

        Segment segment15 = new Segment("Grodno", "Brest", 189, nextSegmentId);
        segments.add(segment15);
        nextSegmentId++;

        Segment segment16 = new Segment("Minsk", "Brest", 170, nextSegmentId);
        segments.add(segment16);
        nextSegmentId++;

        Segment segment17 = new Segment("Brest", "Gomel", 140, nextSegmentId);
        segments.add(segment17);
        nextSegmentId++;

        Segment segment18 = new Segment("Gomel", "Minsk", 177, nextSegmentId);
        segments.add(segment18);
        nextSegmentId++;

        Segment segment19 = new Segment("Krakow", "Zakopane", 230, nextSegmentId);
        segments.add(segment19);
        nextSegmentId++;

        Segment segment20 = new Segment("Lublin", "Lviv", 145, nextSegmentId);
        segments.add(segment20);
        nextSegmentId++;

        Segment segment21 = new Segment("Lublin", "Kiev", 234, nextSegmentId);
        segments.add(segment21);
        nextSegmentId++;

        Segment segment22 = new Segment("Krakow", "Osweciem", 145, nextSegmentId);
        segments.add(segment22);
        nextSegmentId++;

        Segment segment23 = new Segment("Osweciem", "Ostrava", 160, nextSegmentId);
        segments.add(segment23);
        nextSegmentId++;

        Segment segment24 = new Segment("Ostrava", "Prague", 240, nextSegmentId);
        segments.add(segment24);
        nextSegmentId++;

        Segment segment25 = new Segment("Krakow", "Katowice", 340, nextSegmentId);
        segments.add(segment25);
        nextSegmentId++;

        Segment segment26 = new Segment("Katowice", "Wroclaw", 300, nextSegmentId);
        segments.add(segment26);
        nextSegmentId++;

        Segment segment27 = new Segment("Wroclaw", "Lichkov", 123, nextSegmentId);
        segments.add(segment27);
        nextSegmentId++;

        Segment segment28 = new Segment("Lichkov", "Prague", 340, nextSegmentId);
        segments.add(segment28);
        nextSegmentId++;

        Segment segment29 = new Segment("Wroclaw", "Gorlitz", 100, nextSegmentId);
        segments.add(segment29);
        nextSegmentId++;

        Segment segment30 = new Segment("Gorlitz", "Dresden", 145, nextSegmentId);
        segments.add(segment30);
        nextSegmentId++;

        Segment segment31 = new Segment("Wroclaw", "Rzepin", 345, nextSegmentId);
        segments.add(segment31);
        nextSegmentId++;

        Segment segment32 = new Segment("Rzepin", "Berlin", 400, nextSegmentId);
        segments.add(segment32);
        nextSegmentId++;

        Segment segment33 = new Segment("Berlin", "Dresden", 340, nextSegmentId);
        segments.add(segment33);
        nextSegmentId++;

        Segment segment34 = new Segment("Berlin", "Rostok", 250, nextSegmentId);
        segments.add(segment34);
        nextSegmentId++;

        Segment segment35 = new Segment("Rzepin", "Sczecin", 67, nextSegmentId);
        segments.add(segment35);
        nextSegmentId++;

        Segment segment36 = new Segment("Sczecin", "Rostok", 87, nextSegmentId);
        segments.add(segment36);
        nextSegmentId++;

        Segment segment37 = new Segment("Sczecin", "Swinoujscie", 89, nextSegmentId);
        segments.add(segment37);
        nextSegmentId++;

        Segment segment38 = new Segment("Swinoujscie", "Ystad", 345, nextSegmentId);
        segments.add(segment38);
        nextSegmentId++;

        Segment segment39 = new Segment("Rostok", "Ystad", 210, nextSegmentId);
        segments.add(segment39);
        nextSegmentId++;

        Segment segment40 = new Segment("Sczecin", "Gdansk", 349, nextSegmentId);
        segments.add(segment40);
        nextSegmentId++;

        Segment segment41 = new Segment("Gdansk", "Gdynia", 77, nextSegmentId);
        segments.add(segment41);
        nextSegmentId++;

        Segment segment42 = new Segment("Gdynia", "Karlskrona", 58, nextSegmentId);
        segments.add(segment42);
        nextSegmentId++;

        Segment segment43 = new Segment("Ystad", "Karlskrona", 700, nextSegmentId);
        segments.add(segment43);
        nextSegmentId++;

        Segment segment44 = new Segment("Karlskrona", "Vilnus", 150, nextSegmentId);
        segments.add(segment44);
        nextSegmentId++;

        Segment segment45 = new Segment("Vilnus", "Grodno", 905, nextSegmentId);
        segments.add(segment45);
        nextSegmentId++;

        Segment segment46 = new Segment("Lviv", "Kiev", 567, nextSegmentId);
        segments.add(segment46);
        nextSegmentId++;

        Segment segment47 = new Segment("Berlin", "Hamburg", 456, nextSegmentId);
        segments.add(segment47);
        nextSegmentId++;

        Segment segment48 = new Segment("Berlin", "Dusseldorf", 789, nextSegmentId);
        segments.add(segment48);
        nextSegmentId++;

        Segment segment49 = new Segment("Berlin", "Munich", 567, nextSegmentId);
        segments.add(segment49);
        nextSegmentId++;

        Segment segment50 = new Segment("Dusseldorf", "Amsterdam", 566, nextSegmentId);
        segments.add(segment50);
        nextSegmentId++;

        Segment segment51 = new Segment("Amsterdam", "Brussels", 986, nextSegmentId);
        segments.add(segment51);
        nextSegmentId++;

        Segment segment52 = new Segment("Brussels", "Paris", 546, nextSegmentId);
        segments.add(segment52);
        nextSegmentId++;

        Segment segment53 = new Segment("Munich", "Vienna", 345, nextSegmentId);
        segments.add(segment53);
        nextSegmentId++;

        Segment segment54 = new Segment("Vienna", "Zagreb", 457, nextSegmentId);
        segments.add(segment54);
        nextSegmentId++;

        Segment segment55 = new Segment("Zagreb", "Milan", 876, nextSegmentId);
        segments.add(segment55);
        nextSegmentId++;


        recalculateCityNeighbours();

    }

    /**
     * This method adds segments to our map
     *
     * @param city1    - name of the first city
     * @param city2    - name of the second city
     * @param distance - distance from city1 to city2
     */
    public void addSegment(String city1, String city2, double distance) {
        //Using loop check each segment of our map
        for (Segment segment : segments) {
            /*
             * Compare values which was written by user with our segments, if we have the same segment, as user wrote,
             * we don't do anything, if we don't have the same segment, as user wrote, we add his segment to our list
             * of all segments
             */
            if (!(segment.getCity1().equals(city1) && segment.getCity2().equals(city2)) ||
                    !(segment.getCity1().equals(city2) && segment.getCity2().equals(city1))) {
                Segment segment1 = new Segment(city1, city2, distance, nextSegmentId);
                segments.add(segment1);
                nextSegmentId++;
                recalculateCityNeighbours();
                break;
            }
        }
    }


    /**
     * This method recalculate all segments and add neighbours cities
     */
    public synchronized void recalculateCityNeighbours() {
        cityMap.clear();
        //Iterate all segments from the list of segments
        for (Segment segment : segments) {
            /*
             * If our Map doesn't contain the same unique key, as segment city1, we add this city like a unique key,
             * create array list for the neighbours cities of this city1
             */

            if (!cityMap.containsKey(segment.getCity1())) {
                cityMap.put(segment.getCity1(), new ArrayList<>());
            }

            /*
             * If our Map doesn't contain the same unique key, as segment city2, we add this city like a unique key,
             * create array list for the neighbours cities of this city
             */

            if (!cityMap.containsKey(segment.getCity2())) {
                cityMap.put(segment.getCity2(), new ArrayList<>());
            }
        }

        //Using the loop iterate all unique keys from our map
        for (String city : cityMap.keySet()) {
            //Using the loop iterate all segments from the list of all segments
            for (Segment segment : segments) {
                //If city equals the segment city1 we add to map neighbours city of city1
                if (city.equals(segment.getCity1())) {
                    cityMap.get(city).add(segment.getCity2());
                }
                //If city equals the segment city2 we add to map neighbours city of city2
                if (city.equals(segment.getCity2())) {
                    cityMap.get(city).add(segment.getCity1());
                }
            }
        }
    }

    public void printHashMap() {
        if (!cityMap.isEmpty()) {
            System.out.println(cityMap);
        }
    }

    /**
     * This method shows information about all segments in our application
     */
    public void infoOfSegment() {
        //Iterate all segments of the list to get all necessary information
        for (Segment segment : segments) {
            System.out.println("City1: " + segment.getCity1() + ", City2: " + segment.getCity2() + ", Distance: " +
                    segment.getDistance() + ", SegmentID: " + segment.getId());
        }
    }

    /**
     * This method calculate the route for our train set
     *
     * @param sourceStation      - source station of train set
     * @param destinationStation - destination station of train set
     * @throws UnsupportedRoute - exception
     */
    public synchronized ArrayList<PartOfTheRoute> getRoute(String sourceStation, String destinationStation)
            throws UnsupportedRoute {
        ArrayList<String> route; //local variable which contains route
        route = DFS(new ArrayList<>() {{
            add(sourceStation);
        }}, destinationStation, new ArrayList<>());

        if (route == null) {
            throw new UnsupportedRoute("Unsupported route: " + destinationStation);
        } else {
            ArrayList<PartOfTheRoute> result = new ArrayList<>();
            /*
             * We should go throw all segments of our route and add them in special form
             */
            for (int i = 0; i < route.size() - 1; i++) {
                //Iterate all segments of the list of segments
                for (Segment segment : segments) {
                    /*
                     * If segment city1 equals the current route get city and the next route get city equals segment
                     * city2, or if segment city2 equals the current route get city and the next route get city equals
                     * segment city1, we add result in array list of part of the route in such way, segment distance,
                     * the next route city, and segment ID
                     */
                    if ((segment.getCity1().equals(route.get(i)) && segment.getCity2().equals(route.get(i + 1))) ||
                            (segment.getCity2().equals(route.get(i)) && segment.getCity1().equals(route.get(i + 1)))) {
                        PartOfTheRoute partOfTheRoute = new PartOfTheRoute(segment.getDistance(), route.get(i + 1),
                                segment.getId());
                        result.add(partOfTheRoute);
                    }

                }
            }
            return result;
        }

    }


    /**
     * This is our recursive method to get the route
     *
     * @param neighboursCities   - Array List of all neighbours cities
     * @param destinationStation - destination station of train set
     * @param visited            - Array List of visited cities
     */
    private ArrayList<String> DFS(ArrayList<String> neighboursCities, String destinationStation,
                                  ArrayList<String> visited) throws UnsupportedRoute {
        if (neighboursCities == null) {
            throw new UnsupportedRoute("Unsupported route: " + destinationStation);
        } else {
            //Iterate all neighbours cities
            for (String neighbourCity : neighboursCities) {

                //if we don't have neighbour city in visited cities, we add this city to visited and go ahead
                if (!visited.contains(neighbourCity)) {
                    visited.add(neighbourCity);
                    //if neighbour city equals our destination station, we add this neighbour city in new array list
                    if (neighbourCity.equals(destinationStation)) {
                        return new ArrayList<>() {{
                            add(neighbourCity);
                        }};
                    }

                    //call recursively method DFS, while we don't get the destination station
                    ArrayList<String> route = DFS(cityMap.get(neighbourCity), destinationStation, visited);
                    //check if route is null or not
                    if (route != null) {
                        route.add(0, neighbourCity);
                        return route;
                    }

                }
            }
        }
        return null;
    }

    /**
     * This method shows us, can train run in the current segment or not
     *
     * @param locomotiveId - locomotive ID of train set
     * @param segmentId    - segment ID
     */
    public synchronized boolean canTrainRun(String locomotiveId, int segmentId) {
        //Get the current segment of the route
        Segment currentSegment = segments.get(segmentId);

        return currentSegment.canRun(locomotiveId);
    }

    /**
     * This method remove active train from the current segment and makes this segment empty and next train from the
     * queue can go on that segment
     *
     * @param locomotiveId - locomotive ID
     * @param segmentId    - segment ID
     */
    public synchronized void arrived(String locomotiveId, int segmentId) {
        Segment currentSegment = segments.get(segmentId);
        currentSegment.arrived();

    }


    /**
     * Calculate the whole distance of the given route
     *
     * @param route - given route of train set
     */
    public double wholeDistance(ArrayList<PartOfTheRoute> route) {
        double wholeDistance = 0;
        for (int i = 0; i < route.size(); i++) {
            wholeDistance += route.get(i).getDistance();
        }
        return wholeDistance;
    }

}