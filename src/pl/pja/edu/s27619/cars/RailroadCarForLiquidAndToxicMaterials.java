package pl.pja.edu.s27619.cars;

public class RailroadCarForLiquidAndToxicMaterials extends RailroadCarForToxicMaterials {

    public RailroadCarForLiquidAndToxicMaterials () {
        type = Type.LiquidAndToxicMaterials;
        shipperName = "PKP Intercity";
        yearOfProduction = 2017;
        securityInformation = Level.Medium;
        netWeight = 8000;
        numOfWheelsets = 6;
        grossWeight = 16000;
        isElectricityRequired = false;
    }

    @Override
    public String toString() {
        return "RailroadCarForLiquidAndToxicMaterials [railroadCarID = " + railroadCarID +
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
