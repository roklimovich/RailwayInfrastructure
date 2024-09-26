package pl.pja.edu.s27619.cars;

import pl.pja.edu.s27619.cars.RailroadCarForBasicFreight;

public class RailroadCarForLiquidMaterials extends RailroadCarForBasicFreight {

    public RailroadCarForLiquidMaterials() {
        type = Type.LiquidMaterials;
        yearOfProduction = 2011;
        shipperName = "Vita Polymers Poland";
        securityInformation = Level.High;
        netWeight = 6200;
        grossWeight = 14400;
        numOfWheelsets = 6;

    }

    @Override
    public String toString() {
        return "RailroadCarForLiquidMaterials [railroadCarID = " + railroadCarID +
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
