package pl.pja.edu.s27619.cars;

public class RailroadCarForHeavyFreight extends BasicRailroadCar {

    public RailroadCarForHeavyFreight() {
        type = Type.HeavyFreight;
        shipperName = "PKP Intercity";
        yearOfProduction = 2005;
        securityInformation = Level.High;
        netWeight = 7200;
        numOfWheelsets = 6;
        grossWeight = 15400;
        isElectricityRequired = false;
    }

    @Override
    public String toString() {
        return "RailroadCarForHeavyFreight [railroadCarID = " + railroadCarID +
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


