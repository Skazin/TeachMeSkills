package Robot.Hands

class ToshibaHand(private val priceParam : Int) : IHand {

    override var price = priceParam
        set(value) {
            if(value > 0) field = value
        }

    override fun upHand() {
        println("Машет рука Toshiba")
    }
}