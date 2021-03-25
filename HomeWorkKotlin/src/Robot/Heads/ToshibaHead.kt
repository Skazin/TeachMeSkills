package Robot.Heads

class ToshibaHead(private val priceParam : Int) : IHead {

    override var price = priceParam
        set(value) {
            if(value > 0) field = value
        }

    override fun speak() {
        println("Машет рука Toshiba")
    }
}