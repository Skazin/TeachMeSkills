package Market;

public class Main {
    public static void main(String[] args) {

        MarketMenu menu = new MarketMenu();
        Market market = new Market();
//        Product product1 = new Product(1, "Апельсин", "фрукты", 5, 6);
//        Product product2 = new Product(2, "Яблоко", "фрукты", 3,9);
//        Product product3 = new Product(3, "Картошка", "овощи", 1, 45);
//        Product product4 = new Product(4, "Томат", "овощи", 4, 7);
//        Product product5 = new Product(5, "Банан", "фрукты", 5, 14);
//        Product product6 = new Product(6, "Ананас", "фрукты", 10, 47);
//
//
//        market.addProduct(product1);
//        market.addProduct(product2);
//        market.addProduct(product3);
//        market.addProduct(product4);
//        market.addProduct(product5);
//        market.addProduct(product6);

        menu.start(market);
    }



}
