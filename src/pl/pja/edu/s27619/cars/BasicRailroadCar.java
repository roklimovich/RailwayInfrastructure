package pl.pja.edu.s27619.cars;

import java.io.FileWriter;
import java.io.IOException;

public class BasicRailroadCar {

    enum Level {
        Low,
        Medium,
        High
    }

    enum Type {
        Mail,
        PostOffice,
        Passengers,
        Refrigerator,
        Restaurant,
        ToxicMaterials,
        GaseousMaterials,
        ExplosiveMaterials,
        BasicFreight,
        Baggage,
        HeavyFreight,
        LiquidMaterials,
        LiquidAndToxicMaterials
    }

    protected String railroadCarID;
    protected Type type;
    protected String shipperName;
    protected int yearOfProduction;
    protected Level securityInformation;
    protected int netWeight;
    protected int numOfWheelsets;
    protected int grossWeight;
    protected boolean isElectricityRequired;
    protected int currentWeight;


    public BasicRailroadCar() {
        railroadCarID = generateUniqueCarId();
        currentWeight = 0;
    }

    /**
     * Method which loading cargo into the railroad car
     *
     * @param weight - weight of cargo
     * @throws LoadingLimit - exception
     */
    public void loadingRailroadCar(int weight) throws LoadingLimit {
        /*
         * We check if the weight of cargo is grater than net weight of railroad car, we throw LoadingLimit exception,
         * if not, we add weight of cargo to current weight of railroad car
         */
        if (weight > netWeight) {
            throw new LoadingLimit("Loading limit is exceed");
        } else {
            currentWeight += weight;
        }
    }

    /**
     * This method write to text file all necessary information about each railroad car, which connected to train set
     *
     * @param fileWriter - text file writer
     * @throws IOException - necessary exception for FileWriter
     */
    public void dump(FileWriter fileWriter) throws IOException {
        fileWriter.write("Railroad car ID: " + railroadCarID + System.lineSeparator());
        fileWriter.write("Railroad car weight: " + currentWeight + System.lineSeparator());
        fileWriter.write("Shipper name: " + shipperName + System.lineSeparator());
        fileWriter.write(System.lineSeparator());
    }


    /**
     * This method generate unique railroad car ID from range 1000 and 9999
     *
     * @return - the unique ID
     */
    public String generateUniqueCarId() {
        return "PL-" + (int) (Math.random() * (9999 - 1000 + 1) + 1000);
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public String getRailroadCarID() {
        return railroadCarID;
    }

    public Type getType() {
        return type;
    }

    public String getShipperName() {
        return shipperName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Level getSecurityInformation() {
        return securityInformation;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public int getNumOfWheelsets() {
        return numOfWheelsets;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public boolean isElectricityRequired() {
        return isElectricityRequired;
    }
}
