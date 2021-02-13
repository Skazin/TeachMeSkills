package Lesson6;

import Lesson6.Hands.SamsungHand;
import Lesson6.Hands.SonyHand;
import Lesson6.Hands.ToshibaHand;
import Lesson6.Heads.SamsungHead;
import Lesson6.Heads.SonyHead;
import Lesson6.Heads.ToshibaHead;
import Lesson6.Legs.SamsungLeg;
import Lesson6.Legs.SonyLeg;
import Lesson6.Legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHand hand1 = new SamsungHand(400);
        SonyHead head1 = new SonyHead(500);
        ToshibaLeg leg1 = new ToshibaLeg(250);
        Robot robot1 = new Robot(head1, hand1, leg1, "Виктор");

        ToshibaHand hand2 = new ToshibaHand(250);
        SamsungHead head2 = new SamsungHead(700);
        SonyLeg leg2 = new SonyLeg(300);
        Robot robot2 = new Robot(head2, hand2, leg2, "Петя");

        SonyHand hand3 = new SonyHand(300);
        ToshibaHead head3 = new ToshibaHead(300);
        SamsungLeg leg3 = new SamsungLeg(400);
        Robot robot3 = new Robot(head3, hand3, leg3, "Юра");

        Robot[] robots = new Robot[] {robot1, robot2, robot3};

        robot1.action();
        robot2.action();
        robot3.action();

        whoIsTheMostExpensive(robots);

    }

    public static void whoIsTheMostExpensive (Robot[] robots) {
        Robot theMostExpensiveRobot = new Robot();
        int highestPrice;
        for (int i = 0; i < robots.length; i++) {
            for (int j = i + 1; j < robots.length; j++) {
                if(robots[i].getPrice() >= robots[j].getPrice()) {
                    theMostExpensiveRobot = robots[i];
                } else {theMostExpensiveRobot = robots[j];}
                highestPrice = Math.max(robots[i].getPrice(), robots[j].getPrice());
            }
        }
        System.out.println("Самый дорогой робот из представленных - " + theMostExpensiveRobot.getName()
                + ". Его стоимость равна: " + theMostExpensiveRobot.getPrice());
    }
}
