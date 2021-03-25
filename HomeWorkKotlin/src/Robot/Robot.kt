package Robot

import Robot.Hands.IHand
import Robot.Heads.IHead
import Robot.Legs.ILeg

class Robot() : IRobot {
    private lateinit var head : IHead
    private lateinit var hand : IHand
    private lateinit var leg : ILeg
    private lateinit var name : String

    constructor(headParam : IHead, handParam : IHand, legParam : ILeg, nameParam : String) : this() {
        head = headParam
        hand = handParam
        leg = legParam
        name = nameParam

    }

    override var price : Int = head.price + hand.price + leg.price
    override var robotName : String = name

    override fun action() {
        println("Меня зовут $name")
        head.speak()
        hand.upHand()
        leg.step()
    }
}