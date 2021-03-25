package Robot.Hands

class ToshibaHand(private val price_param : Int) : IHand {

    var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun upHand() {
        println("Машет рука Toshiba")
    }

    override fun getHandPrice(): Int = price
}