package Robot

import Robot.Hands.SamsungHand
import Robot.Hands.SonyHand
import Robot.Hands.ToshibaHand
import Robot.Heads.SamsungHead
import Robot.Heads.SonyHead
import Robot.Heads.ToshibaHead
import Robot.Legs.SamsungLeg
import Robot.Legs.SonyLeg
import Robot.Legs.ToshibaLeg

fun main(args: Array<String>){
    val hand1 = SamsungHand(400)
    val head1 = SonyHead(500)
    val leg1 = ToshibaLeg(250)
    val robot1 = Robot(head1, hand1, leg1, "Виктор")

    val hand2 = ToshibaHand(250)
    val head2 = SamsungHead(700)
    val leg2 = SonyLeg(300)
    val robot2 = Robot(head2, hand2, leg2, "Петя")

    val hand3 = SonyHand(300)
    val head3 = ToshibaHead(300)
    val leg3 = SamsungLeg(400)
    val robot3 = Robot(head3, hand3, leg3, "Юра")

    val robots : Array<Robot> = arrayOf(robot1, robot2, robot3)

    robot1.action()
    robot2.action()
    robot3.action()

    val appraiser = Appraiser()

    appraiser.whoIsTheMostExpensive(robots)
}