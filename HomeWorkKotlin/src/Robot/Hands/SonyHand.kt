package Robot.Hands

class SonyHand(private val price_param : Int) : IHand {

    var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun upHand() {
        println("Машет рука Sony")
    }

    override fun getHandPrice(): Int = price
}