package Lesson5;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 234, 250, 2000,
                4, 12, "universal", 5);

        Truck truck1 = new Truck("Mersedes-Benz", 150, 120, 3000,
                4, 15, 5);
        Truck truck2 = new Truck("Renault", 120, 120, 2000,
                4, 10, 2);

        Civil plane1 = new Civil("Boeing 737-900", 90000, 852, 85000, 34,
                5000, 215, true);
        Civil plane2 = new Civil("Cessna", 20000, 745, 6700, 16,
                2000, 7, true);

        Military warPlane1 = new Military("SU-47", 30000, 2200, 26700, 17,
                2000, 8, true);
        Military warPlane2 = new Military("IL-2", 1665, 411, 6000, 15,
                2000, 0, false);

//        car.getInfo();
//        car.journeyInfo(3);
//        truck1.getInfo();
//        truck1.shipment(2);
//        truck2.getInfo();
//        truck2.shipment(3);
//        plane1.getInfo();
//        plane1.boarding(200);
//        plane2.getInfo();
//        plane2.boarding(9);
//        warPlane1.getInfo();
//        warPlane1.launch();
//        warPlane1.catapult();
        warPlane2.getInfo();
        warPlane2.launch();
        warPlane2.catapult();
    }
}
