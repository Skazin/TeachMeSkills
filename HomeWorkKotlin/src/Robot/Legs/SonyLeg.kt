package Robot.Legs

class SonyLeg(private val priceParam : Int) : ILeg {

    override var price : Int = priceParam
        set(value) {
            if(value > 0) field = value
        }

    override fun step() {
        println("Шагает нога Sony")
    }
}