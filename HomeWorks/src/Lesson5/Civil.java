package Lesson5;

public class Civil extends AirTransport {

    private int maxPassengers;
    private boolean hasBusiness;

    public Civil (String brand, int power, int maxSpeed, int mass, int wingspan,
                  int minRunwayStripLength, int maxPassengers, boolean hasBusiness) {
        super(brand, power, maxSpeed, mass, wingspan, minRunwayStripLength);
        this.maxPassengers = maxPassengers;
        this.hasBusiness = hasBusiness;
    }

    public void getInfo() {
        System.out.println("Самолет модели: " + getBrand() + ".");
        System.out.println("Размах крыльев: " + getWingspan() + " м.");
        System.out.println("Масса самолета: " + getMass() + " кг.");
        System.out.println("Мощность двигателя самолета в лошадиных силах: " + getPower() + " л.с.");
        System.out.println("Мощность двигателя самолета в киловатах: " + powerConversion(getPower()) + " кВ.");
        System.out.println("Максимальная скорость самолета: " + getMaxSpeed() + " км/ч.");
        System.out.println("Минимальная длина взлетно-посадочной полосы: " + getMinRunwayStripLength() + " м.");
        System.out.println("Максимальное число пассажиров: " + getMaxPassengers() + " человек.");
        System.out.println("Имеется ли бизнес класс: " + hasBusiness() + ".");
    }

    public void boarding(int boardingPassengers) {
        if (boardingPassengers <= maxPassengers) {
            System.out.println("Расскаживаемся и полетели.");
        } else {
            System.out.println("Нам нужен самолет побольше.");
        }
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public boolean hasBusiness() {
        return hasBusiness;
    }

    public void setHasBusiness(boolean hasBusiness) {
        this.hasBusiness = hasBusiness;
    }
}
