package pl.pja.edu.s27619.cars;


public class RailroadCarForBaggage extends BasicRailroadCar {
    private double volume;

    public RailroadCarForBaggage() {
        type = Type.Baggage;
        shipperName = "PKP Intercity";
        yearOfProduction = 2017;
        securityInformation = Level.Low;
        netWeight = 5200;
        numOfWheelsets = 6;
        grossWeight = 10700;
        volume = 120;
        isElectricityRequired = false;
    }


    @Override
    public String toString() {
        return "RailroadCarForBaggage [railroadCarID = " + railroadCarID +
                ", type = " + type +
                ", shipperName = " + shipperName +
                ", securityInformation = " + securityInformation +
                ", netWeight = " + netWeight +
                ", numOfWheelsets = " + numOfWheelsets +
                ", grossWeight = " + grossWeight +
                ", yearOfProduction = " + yearOfProduction +
                ", isElectricityRequired = " + isElectricityRequired +
                ", volume = " + volume + "]";
    }
}
