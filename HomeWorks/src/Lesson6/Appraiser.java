package Lesson6;

public class Appraiser {

    private Robot theMostExpensiveRobot = new Robot();


    public Appraiser() {

    }

    public void whoIsTheMostExpensive (Robot[] robots) {

        Robot theMostExpensiveRobot = robots[0];
        for (Robot r : robots) {
            if (r.getPrice() >  theMostExpensiveRobot.getPrice()) {
                theMostExpensiveRobot = r;
            }
        }
        System.out.println("Самый дорогой робот из представленных - " + theMostExpensiveRobot.getName()
                + ". Его стоимость равна: " + theMostExpensiveRobot.getPrice());
    }
}
