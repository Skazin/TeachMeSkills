package Robot.Hands

class SamsungHand(private val price_param : Int) : IHand {

    private var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun upHand() {
        println("Машет рука Samsung")
    }

    override fun getHandPrice(): Int = price
}