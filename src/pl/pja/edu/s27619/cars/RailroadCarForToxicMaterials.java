package pl.pja.edu.s27619.cars;


public class RailroadCarForToxicMaterials extends RailroadCarForHeavyFreight {

    public RailroadCarForToxicMaterials() {
            type = Type.ToxicMaterials;
            shipperName = "ToxicMaterialsPL";
            securityInformation = Level.High;
            netWeight = 6000;
            grossWeight = 14800;
            numOfWheelsets = 4;
    }

    @Override
    public String toString() {
        return "RailroadCarForToxicMaterials [railroadCarID = " + railroadCarID +
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


