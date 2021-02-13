package Lesson6.Hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand() {}

    public SonyHand (int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Машет рука Sony");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
