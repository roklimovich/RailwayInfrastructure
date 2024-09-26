package pl.pja.edu.s27619.cars;

import pl.pja.edu.s27619.cars.BasicRailroadCar;

public class RailroadCarForPostOffice extends BasicRailroadCar {


    public RailroadCarForPostOffice () {
        type = Type.PostOffice;
        shipperName = "DHL";
        yearOfProduction = 2015;
        securityInformation = Level.Medium;
        netWeight = 6200;
        numOfWheelsets = 4;
        grossWeight = 14000;
        isElectricityRequired = true;
    }


    @Override
    public String toString() {
        return "RailroadCarForPostOffice [railroadCarID = " + railroadCarID +
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
