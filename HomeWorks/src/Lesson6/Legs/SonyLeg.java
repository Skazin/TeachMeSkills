package Lesson6.Legs;


public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg() {}

    public SonyLeg (int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
