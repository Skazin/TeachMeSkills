package Robot.Legs

import Robot.Heads.IHead

class SamsungLeg(private val price_param : Int) : ILeg {

    private var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun step() {
        println("Шагает нога Samsung")
    }

    override fun getLegPrice(): Int = price
}