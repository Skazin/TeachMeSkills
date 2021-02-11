package Lesson5;

public class Military extends AirTransport {

    private boolean hasCatapult;
    private int numberOfMissiles;

    public Military (String brand, int power, int maxSpeed, int mass, int wingspan,
                     int minRunwayStripLength, int numberOfMissiles, boolean hasCatapult) {
        super(brand, power, maxSpeed, mass, wingspan, minRunwayStripLength);
        this.numberOfMissiles = numberOfMissiles;
        this.hasCatapult = hasCatapult;
    }

    public void getInfo() {
        System.out.println("Самолет модели: " + getBrand() + ".");
        System.out.println("Размах крыльев: " + getWingspan() + " м.");
        System.out.println("Масса самолета: " + getMass() + " кг.");
        System.out.println("Мощность двигателя самолета в лошадиных силах: " + getPower() + " л.с.");
        System.out.println("Мощность двигателя самолета в киловатах: " + powerConversion(getPower()) + " кВ.");
        System.out.println("Максимальная скорость самолета: " + getMaxSpeed() + " км/ч.");
        System.out.println("Минимальная длина взлетно-посадочной полосы: " + getMinRunwayStripLength() + " метров.");
        System.out.println("Число боевых ракет: " + getNumberOfMissiles() + ".");
        System.out.println("Имеется ли система катапультирования: " + hasCatapult() + ".");
    }

    public void launch() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла.");
            numberOfMissiles--;
            System.out.println("Осталось ракет: " + numberOfMissiles + ".");
        } else {
            System.out.println("Ракет нет.");
        }
    }

    public void catapult() {
        if (hasCatapult) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы. Brace for impact!");
        }
    }

    public boolean hasCatapult() {
        return hasCatapult;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setHasCatapult(boolean hasCatapult) {
        this.hasCatapult = hasCatapult;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }
}
