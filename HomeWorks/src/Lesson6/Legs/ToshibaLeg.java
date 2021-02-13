package Lesson6.Legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg() {}

    public ToshibaLeg (int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Toshiba");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
