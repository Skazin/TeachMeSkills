package Lesson5;

public class Truck extends LandTransport {

    private double carryingCapacity;

    public Truck (String brand, int power, int maxSpeed, int mass,
                  int numberOfWheels, int fuelConsumption, double carryingCapacity) {
        super(brand, power, maxSpeed, mass, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void getInfo() {
        System.out.println("Автомобиль модели: " + getBrand() + ".");
        System.out.println("Масса автомобиля: " + getMass() + " кг.");
        System.out.println("Грузоподъемность автомобиля: " + getCarryingCapacity() + " тонн.");
        System.out.println("Количество колес у автомобиля: " + getNumberOfWheels() + ".");
        System.out.println("Мощность двигателя автомобиля в лошадиных силах: " + getPower() + " л.с.");
        System.out.println("Мощность двигателя автомобиля в киловатах: " + powerConversion(getPower()) + " кВ.");
        System.out.println("Максимальная скорость автомобиля " + getMaxSpeed() + " км/ч.");
        System.out.println("Расход топлива: " + getFuelConsumption() + " литров/100 км.");
    }

    public void shipment(double cargoWeight) {
        if(cargoWeight <= carryingCapacity) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }


}
