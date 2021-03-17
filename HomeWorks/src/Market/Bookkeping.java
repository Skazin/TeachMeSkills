package Market;

import java.util.HashSet;
import java.util.Set;

public class Bookkeping {

    private Market market;
    private int priceCounter = 0;
    private int productsCounter = 0;
    private double averagePrice = 0;

     public Bookkeping(Market market) {
         this.market = market;
     }

    public void numberOfTypes() {
        Set<String> setOfTypes = new HashSet<>();
        for (Product product : market.listOfProducts()) {
            setOfTypes.add(product.getType());
        }
        System.out.println("Список товарных групп:");
        int counter = 0;
        for (String type : setOfTypes) {
            System.out.println(type);
            counter++;
        }
        System.out.println("Общее количество товарных групп: " + counter + ".");
    }

    public void numberOfProducts() {
        int namesCounter = 0;
        int productsCounter = 0;
        for (Product product : market.listOfProducts()) {
            productsCounter += product.getNumberOfThis();
            namesCounter++;
        }
        System.out.println("Общее количество наименований: " + namesCounter + ".");
        System.out.println("Всего товаров в магазине: " + productsCounter + ".");
    }

    public void averagePrice() {
        priceCounter = 0;
        productsCounter = 0;
        for (Product product : market.listOfProducts()) {
            priceCounter += product.getNumberOfThis() * product.getPrice();
            productsCounter += product.getNumberOfThis();
        }
        averagePrice = (double) priceCounter / productsCounter;
        System.out.println("Средняя стоимость всех товаров в магазине: " + averagePrice + ".");
    }

    public void averageTypePrice() {
        Set<String> setOfTypes = new HashSet<>();
        for (Product product : market.listOfProducts()) {
            setOfTypes.add(product.getType());
        }
        for (String type : setOfTypes) {
            priceCounter = 0;
            productsCounter = 0;
            for (Product product : market.listOfProducts()) {
                if (type.equals(product.getType())) {
                    priceCounter += product.getNumberOfThis() * product.getPrice();
                    productsCounter += product.getNumberOfThis();
                }
            }
            averagePrice = (double) priceCounter / productsCounter;
            System.out.println("Средняя стоимость всех товаров в товарной группе (" + type + "): " + averagePrice + ".");
            priceCounter = 0;
            productsCounter = 0;
            averagePrice = 0;
        }
    }

}
