package Market;

import Market.Exceptions.InvalidValueException;

public class Product {

    private int id;
    private String name;
    private String type;
    private int price;
    private int numberOfThis;

    public Product(int id, String name, String type, int price, int numberOfIt) throws InvalidValueException {
        if (price < 0) throw new InvalidValueException("Вы ввели неверное значение. Цена товара не может быть ниже нуля.");
        if (numberOfIt < 0) throw new InvalidValueException("Вы ввели неверное значение. Количество товара не может быть меньше нуля.");
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.numberOfThis = numberOfIt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Product product) {
        return this.id == product.id;
    }

    public int getNumberOfThis() {
        return numberOfThis;
    }

    public void setNumberOfThis(int numberOfThis) {
        this.numberOfThis = numberOfThis;
    }
}
