package pl.pja.edu.s27619.cars;

import pl.pja.edu.s27619.cars.BasicRailroadCar;

public class RailroadCarForBasicFreight extends BasicRailroadCar {


    public RailroadCarForBasicFreight() {
        type = Type.BasicFreight;
        shipperName = "PKP Intercity";
        yearOfProduction = 2005;
        securityInformation = Level.Medium;
        netWeight = 7000;
        numOfWheelsets = 6;
        grossWeight = 13800;
        isElectricityRequired = false;
    }

    

    @Override
    public String toString() {
        return "RailroadCarForBasicFreight [railroadCarID = " + railroadCarID +
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
