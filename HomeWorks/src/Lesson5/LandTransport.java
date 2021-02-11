package Lesson5;

public class LandTransport extends Transport{

    private int numberOfWheels;
    private int fuelConsumption;

    public LandTransport (String brand, int power, int maxSpeed, int mass, int numberOfWheels, int fuelConsumption){
        super(brand, power, maxSpeed, mass);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
