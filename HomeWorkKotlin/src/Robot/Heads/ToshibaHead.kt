package Robot.Heads

class ToshibaHead(private val price_param : Int) : IHead {

    private var price = price_param
        set(value) {
            if(value > 0) field = value
        }

    override fun speak() {
        println("Машет рука Toshiba")
    }

    override fun getHeadPrice() : Int = price
}