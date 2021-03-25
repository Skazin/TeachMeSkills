package Robot

class Appraiser {

    var theMostExpensiveRobot = Robot();

    fun whoIsTheMostExpensive (robots : Array<Robot>) {
        theMostExpensiveRobot = robots[0];
        for (item in robots) {
            if (item.price >  theMostExpensiveRobot.price) {
                theMostExpensiveRobot = item;
            }
        }
        println("Самый дорогой робот из представленных - ${theMostExpensiveRobot.robotName}. Его стоимость равна: ${theMostExpensiveRobot.price}")
    }
}


