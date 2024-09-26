package pl.pja.edu.s27619.locomotive;

public class Locomotive {

    private String locomotiveID;
    private String name;
    private String homeRailwayStation;
    private String sourceStation;
    private String destinationStation;
    private int maxNumOfRailroadCars;
    private int maxWeight;
    private int maxNumOfRailroadCarsWithElectricityGrid;
    private int speed;


    public Locomotive(String homeRailwayStation, String sourceStation, String destinationStation) {
        locomotiveID = generateUniqueLocomotiveId();
        name = "PJATK railways";
        this.homeRailwayStation = homeRailwayStation;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        maxNumOfRailroadCars = 10;
        maxWeight = 500000;
        maxNumOfRailroadCarsWithElectricityGrid = 7;
        speed = 100;
    }

    /**
     * Method to change speed of locomotive
     * @throws RailroadHazard - necessary exception
     */
    public void changeSpeed() throws RailroadHazard {
        //Variable changeSpeed contains information about speed which increases or decreases by 3% every second
        double changeSpeed = speed * 0.03;

        /*
         * Using Math.class we generate random values, if this value is less than < 0.5 we subtract from current
         * locomotive speed the changed speed by 3%, if grater we add to current locomotive speed the changed
         * speed by 3%
         */
        if (Math.random() < 0.5) {
            speed -= changeSpeed;
        } else {
            speed += changeSpeed;
        }

        //if current speed grater than 200 km/h we throw necessary exception
        if (speed >= 200) {
            throw new RailroadHazard("Speed limit exceed!");
        }

    }

    /**
     * This method generate unique locomotive ID from range 1000 and 9999
     * @return - the unique ID
     */
    public String generateUniqueLocomotiveId() {

        return "PL-" + (int) (Math.random() * (9999 - 1000 + 1) + 1000);
    }

    public String getLocomotiveID() {
        return locomotiveID;
    }

    public String getName() {
        return name;
    }

    public String getHomeRailwayStation() {
        return homeRailwayStation;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public int getMaxNumOfRailroadCars() {
        return maxNumOfRailroadCars;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxNumOfRailroadCarsWithElectricityGrid() {
        return maxNumOfRailroadCarsWithElectricityGrid;
    }

    public int getSpeed() {
        return speed;
    }
}


