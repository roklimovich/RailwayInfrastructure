package pl.pja.edu.s27619.cars;

import pl.pja.edu.s27619.cars.BasicRailroadCar;

public class RailroadCarForPassengers extends BasicRailroadCar {

    private int numberOfSeats;
    private int numberOfSeatsWithTables;
    private int currentWeightOfPeople;


    public RailroadCarForPassengers () {
        type = Type.Passengers;
        shipperName = "PKP Intercity";
        yearOfProduction = 2017;
        securityInformation = Level.High;
        netWeight = 7000;
        numOfWheelsets = 4;
        grossWeight = 14700;
        numberOfSeats = 80;
        numberOfSeatsWithTables = 20;
        isElectricityRequired = true;
    }

    /**
     * This method loading people into railroad car for passengers
     * @param people - number of people loaded
     * @throws LoadingLimit - necessary exception
     */
    public void loadingPeople(int people) throws LoadingLimit {
        /*
         * If number of people is grater than number of seats in railroad car, we throw exception. If not we calculate
         * the current weight of loaded people and add this weight to current weight of railroad car
         */
        if (people > numberOfSeats) {
            throw new LoadingLimit("Loading limit is exceed");
        } else {
            currentWeightOfPeople = people * 80;
            currentWeight += currentWeightOfPeople;

        }
    }

    @Override
    public String toString() {
        return "RailroadCarForPassengers [railroadCarID = " + railroadCarID +
                ", type = " + type +
                ", shipperName = " + shipperName +
                ", securityInformation = " + securityInformation +
                ", netWeight = " + netWeight +
                ", numOfWheelsets = " + numOfWheelsets +
                ", grossWeight = " + grossWeight +
                ", yearOfProduction = " + yearOfProduction +
                ", isElectricityRequired = " + isElectricityRequired +
                ", numberOfSeats = " + numberOfSeats +
                ", numberOfSeats = " + numberOfSeatsWithTables + "]";
    }

    public int getCurrentWeightOfPeople() {
        return currentWeightOfPeople;
    }
}
