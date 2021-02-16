package Lesson6.Heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead (int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
