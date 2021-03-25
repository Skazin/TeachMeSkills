package Robot.Legs

class SonyLeg(private val price_param : Int) : ILeg {

    private var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun step() {
        println("Шагает нога Sony")
    }

    override fun getLegPrice(): Int = price
}