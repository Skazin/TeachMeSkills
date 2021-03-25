package Robot

import Robot.Hands.IHand
import Robot.Heads.IHead
import Robot.Legs.ILeg

class Robot() : IRobot {
    private lateinit var head : IHead
    private lateinit var hand : IHand
    private lateinit var leg : ILeg
    private lateinit var name : String

    constructor(head_param : IHead, hand_param : IHand, leg_param : ILeg, name_param : String) : this() {
        head = head_param
        hand = hand_param
        leg = leg_param
        name = name_param

    }

    override fun action() {
        println("Меня зовут $name")
        head.speak()
        hand.upHand()
        leg.step()
    }

    fun getRobotName(): String = name

    override fun getRobotPrice(): Int = head.getHeadPrice() + hand.getHandPrice() + leg.getLegPrice()

}