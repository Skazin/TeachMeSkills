package Lesson6.Hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand() {}

    public ToshibaHand (int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Машет рука Toshiba");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
