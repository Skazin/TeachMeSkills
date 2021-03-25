package Robot

class Appraiser {

    var theMostExpensiveRobot = Robot();

    fun whoIsTheMostExpensive (robots : Array<Robot>) {
        theMostExpensiveRobot = robots[0];
        for (item in robots) {
            if (item.getRobotPrice() >  theMostExpensiveRobot.getRobotPrice()) {
                theMostExpensiveRobot = item;
            }
        }
        println("Самый дорогой робот из представленных - ${theMostExpensiveRobot.getRobotName()}. Его стоимость равна: ${theMostExpensiveRobot.getRobotPrice()}")
    }
}


