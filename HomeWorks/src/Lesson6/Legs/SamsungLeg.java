package Lesson6.Legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg() {}

    public SamsungLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
