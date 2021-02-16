package Lesson6.Heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead (int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
