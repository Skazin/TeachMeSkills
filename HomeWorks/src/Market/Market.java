package Market;

import Market.Exceptions.MissingIdException;
import java.util.*;

public class Market {

    private final Set<Product> productList = new LinkedHashSet<>();
    private final Comparator<Product> increase = (o1, o2) -> {
        if (o1.getPrice() - o2.getPrice() >= 0) return 1;
        else return -1;
    };
    private final Comparator<Product> decrease = (o1, o2) -> {
        if (o1.getPrice() - o2.getPrice() <= 0) return 1;
        else return -1;
    };

    public Market() {

    }

    public void addProduct(Product product) {
        if (productList.contains(product)) {
            System.out.println("Попытка добавить товар с уже существующим ID " + "(" + product.getName() + ", id " + product.getId() + "), товар не добавлен");
        } else {
            productList.add(product);
        }
    }

    public List<Product> listOfProducts() {
        return new LinkedList<>(productList);
    }

    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    public void editProduct(Product editedProduct) throws MissingIdException {
        boolean found = false;
        for (Product product : productList) {
            if (product.equals(editedProduct)) {
                found = true;
                product.setName(editedProduct.getName());
                product.setType(editedProduct.getType());
                product.setPrice(editedProduct.getPrice());
                product.setNumberOfThis(editedProduct.getNumberOfThis());
            }
        }
        if (!found) throw new MissingIdException("Товара с ID - " + editedProduct.getId() + " нет в списке товаров, попробуйте добавить такой товар.");
    }

    public void editNumber(int id, int number) throws MissingIdException {
        boolean found = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                found = true;
                product.setNumberOfThis(number);
            }
        }
        if (!found) throw new MissingIdException("Товара с ID - " + id + " нет в списке товаров, попробуйте добавить такой товар.");
    }

    public void priceSortIncrease() {
        Set<Product> setOfProducts= new TreeSet<>(increase);
        setOfProducts.addAll(listOfProducts());
        for (Product product : setOfProducts) {
            System.out.println("Товар: " + product.getName() + ", ID: " + product.getId() +
                    ", товарная группа: " + product.getType() + ", цена: " + product.getPrice() + ", количество на складе: " + product.getNumberOfThis() + ".");
        }
    }

    public void priceSortDecrease() {
        Set<Product> setOfProducts= new TreeSet<>(decrease);
        setOfProducts.addAll(listOfProducts());
        for (Product product : setOfProducts) {
            System.out.println("Товар: " + product.getName() + ", ID: " + product.getId() +
                    ", товарная группа: " + product.getType() + ", цена: " + product.getPrice() + ", количество на складе: " + product.getNumberOfThis() + ".");
        }
    }

    public void orderOfAdditionSort() {
        Product[] arr;
        List<Product> products = new LinkedList<>(productList);
        arr = products.toArray(new Product[productList.size()]);
        for (int i = arr.length -1; i >= 0 ; i--) {
            System.out.println("Товар: " + arr[i].getName() + ", ID: " + arr[i].getId() +
                    ", товарная группа: " + arr[i].getType() + ", цена: " + arr[i].getPrice() + ", количество на складе: " + arr[i].getNumberOfThis() + ".");
        }
    }


}
