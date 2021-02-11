package Lesson5;

public class Transport {

    private int power;
    private int maxSpeed;
    private int mass;
    private final String brand;

    public Transport (String brand, int power, int maxSpeed, int mass){
        this.brand = brand;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
    }

    public double powerConversion(int power){
        return (double) (power * 0.74);
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
