package pl.pja.edu.s27619.cars;


public class RailroadCarForRestaurant extends BasicRailroadCar {


    public RailroadCarForRestaurant() {
        type = Type.Restaurant;
        shipperName = "PKP Intercity";
        yearOfProduction = 2019;
        securityInformation = Level.Medium;
        netWeight = 1500;
        numOfWheelsets = 4;
        grossWeight = 8000;
        isElectricityRequired = true;
    }


    @Override
    public String toString() {
        return "RailroadCarForRestaurant [railroadCarID = " + railroadCarID +
                ", type = " + type +
                ", shipperName = " + shipperName +
                ", securityInformation = " + securityInformation +
                ", netWeight = " + netWeight +
                ", numOfWheelsets = " + numOfWheelsets +
                ", grossWeight = " + grossWeight +
                ", yearOfProduction = " + yearOfProduction +
                ", isElectricityRequired = " + isElectricityRequired + "]";
    }
}
