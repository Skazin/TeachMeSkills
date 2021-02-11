package Lesson5;

public class Car extends LandTransport{

    private String bodyType;
    private int maxPassengers;

    public Car (String brand, int power, int maxSpeed, int mass, int numberOfWheels,
                int fuelConsumption, String bodyType, int maxPassengers){
        super(brand, power, maxSpeed, mass, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.maxPassengers = maxPassengers;
    }

    public void getInfo(){
        System.out.println("Автомобиль модели: " + getBrand() + ".");
        System.out.println("Типо кузова автомобиля: " + getBodyType() + ".");
        System.out.println("Масса автомобиля: " + getMass() + " кг.");
        System.out.println("Количество колес у автомобиля: " + getNumberOfWheels() + ".");
        System.out.println("Мощность двигателя автомобиля в лошадиных силах: " + getPower() + " л.с.");
        System.out.println("Мощность двигателя автомобиля в киловатах: " + powerConversion(getPower()) + " кВ.");
        System.out.println("Максимальная скорость автомобиля " + getMaxSpeed() + " км/ч.");
        System.out.println("Расход топлива: " + getFuelConsumption() + " литров/100 км.");
        System.out.println("Максимальное число пассажиров: " + getMaxPassengers() + " человек.");
    }

    public void journeyInfo(double time){
        if(time > 0) {
            System.out.println("За " + time + " ч., автомобиль " + getBrand() + " ,двигаясь с максимальной скоростью " +
                    getMaxSpeed() + " км/ч, проедет " + (getMaxSpeed() * time) + " км и израсходует " +
                    fuelValue(getMaxSpeed() * time) + " литров топлива.");
        } else {
            System.out.println("Указан неверный формат времени.");
        }
    }


    private double fuelValue(double distance){
        return distance / getFuelConsumption();
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
