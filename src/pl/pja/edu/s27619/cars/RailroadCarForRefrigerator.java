package pl.pja.edu.s27619.cars;


public class RailroadCarForRefrigerator extends RailroadCarForBasicFreight {

    private double averageTemperatureOfRefrigerator;
    private double volumeOfRefrigerator;
    public RailroadCarForRefrigerator() {
        type = Type.Refrigerator;
        yearOfProduction = 2019;
        securityInformation = Level.High;
        netWeight = 7000;
        numOfWheelsets = 4;
        grossWeight = 15000;
        averageTemperatureOfRefrigerator = 5;
        volumeOfRefrigerator = 120;
        isElectricityRequired = true;
    }


    @Override
    public String toString() {
        return "RailroadCarForRefrigerator [railroadCarID = " + railroadCarID +
                ", type = " + type +
                ", shipperName = " + shipperName +
                ", securityInformation = " + securityInformation +
                ", netWeight = " + netWeight +
                ", numOfWheelsets = " + numOfWheelsets +
                ", grossWeight = " + grossWeight +
                ", yearOfProduction = " + yearOfProduction +
                ", isElectricityRequired = " + isElectricityRequired +
                ", volumeOfRefrigerator = " + volumeOfRefrigerator +
                ", averageTemperatureOfRefrigerator = " + averageTemperatureOfRefrigerator + "]";
    }
}



