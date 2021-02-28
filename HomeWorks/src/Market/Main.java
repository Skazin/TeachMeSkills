package Market;

import Market.Exceptions.AlreadyAddedException;
import Market.Exceptions.MissingIdException;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        Product product1 = new Product(1, "Апельсин", "фрукты", 5);
        Product product11 = new Product(1, "Пиво", "фрукты", 10);
        Product product2 = new Product(2, "Яблоко", "фрукты", 3);
        Product product3 = new Product(3, "Картошка", "овощи", 1);
        Product product4 = new Product(4, "Томат", "овощи", 4);
        Product product5 = new Product(5, "Банан", "фрукты", 5);
        Product product6 = new Product(6, "Ананас", "фрукты", 10);


        market.addProduct(product1);
        market.addProduct(product2);
        market.addProduct(product3);
        market.addProduct(product4);
        market.addProduct(product5);
        market.addProduct(product6);

        System.out.println(market.listToString());

        System.out.println((priceSort(market.listOfProducts()))); // список товаров, отсортированных по цене по возрастанию

        market.deleteProduct(6);

        System.out.println(orderOfAdditionSort(market.listOfProducts())); // список товаров, отсортированных по порядку добавления(последние добавленные в начале)

        try{
            market.editProduct(product11);
        } catch (MissingIdException e) {
            System.out.println("Бла бла");
        }

        System.out.println(market.listToString());
    }

    public static List<String> priceSort(List<Product> list) {
        Comparator<Product> c = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() - o2.getPrice() >= 0) return 1;
                else return -1;
            }
        };
        Set<Product> listA = new TreeSet<>(c);

        listA.addAll(list);
        List<String> stringList = new LinkedList<>();
        for (Product product : listA) {
            stringList.add(product.getName());
        }
        return stringList;
    }

    public static String orderOfAdditionSort(List<Product> list) {
        StringBuilder builder = new StringBuilder();
        String[] arr = new String[list.size()];
        List<String> products = new LinkedList<>();
        for (Product product : list) {
            products.add(product.getName());
        }
        arr = products.toArray(new String[list.size()]);
        for (int i = arr.length -1; i >= 0 ; i--) {
            if (i != 0) {
                builder.append(arr[i]);
                builder.append(", ");
            } else {
                builder.append(arr[i]);
            }
        }
        return builder.toString();
    }

}
