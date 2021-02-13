package Lesson6.Hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand() {}

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Машет рука Samsung");
    }


    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
