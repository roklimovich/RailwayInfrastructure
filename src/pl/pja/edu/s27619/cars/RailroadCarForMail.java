package pl.pja.edu.s27619.cars;

import pl.pja.edu.s27619.cars.BasicRailroadCar;

public class RailroadCarForMail extends BasicRailroadCar {
    private int volume;

    public RailroadCarForMail () {
        type = Type.Mail;
        shipperName = "DHL";
        yearOfProduction = 2016;
        securityInformation = Level.Low;
        netWeight = 2800;
        numOfWheelsets = 6;
        grossWeight = 8000;
        volume = 110;
        isElectricityRequired = false;
    }


    @Override
    public String toString() {
        return "RailroadCarForMail [railroadCarID = " + railroadCarID +
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
