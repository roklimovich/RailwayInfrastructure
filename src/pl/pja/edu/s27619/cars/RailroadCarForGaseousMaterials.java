package pl.pja.edu.s27619.cars;


public class RailroadCarForGaseousMaterials extends RailroadCarForBasicFreight {

    public RailroadCarForGaseousMaterials() {
        type = Type.GaseousMaterials;
        shipperName = "Rotary Gas Meter";
        securityInformation = Level.High;
        netWeight = 6000;
        grossWeight = 11800;
        numOfWheelsets = 8;

    }

    @Override
    public String toString() {
        return "RailroadCarForGaseousMaterials [railroadCarID = " + railroadCarID +
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
