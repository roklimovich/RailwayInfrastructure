package pl.pja.edu.s27619.cars;

public class RailroadCarForExplosiveMaterials extends RailroadCarForHeavyFreight {

    public RailroadCarForExplosiveMaterials() {
        type = Type.ExplosiveMaterials;
        shipperName = "ExplosivePL";
        securityInformation = Level.Medium;
        netWeight = 6000;
        grossWeight = 14800;
        numOfWheelsets = 4;

    }

    @Override
    public String toString() {
        return "RailroadCarForExplosiveMaterials [railroadCarID = " + railroadCarID +
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
