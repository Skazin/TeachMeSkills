package Robot.Heads

class SonyHead(private val priceParam : Int) : IHead {

    override var price = priceParam
        set(value) {
            if(value > 0) field = value
        }

    override fun speak() {
        println("Машет рука Sony")
    }
}