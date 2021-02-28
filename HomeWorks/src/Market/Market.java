package Market;

import Market.Exceptions.MissingIdException;
import java.util.*;

public class Market {

    private Set<Product> productList = new LinkedHashSet<>();
    private Map<Integer, Product> mapList = new LinkedHashMap<>();

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
        List<Product> products = new LinkedList<>();
        for (Product product : productList) {
            products.add(product);
        }
        return products;
    }

    public List<String> listToString() {
        List<String> products = new LinkedList<>();
        for (Product product : productList) {
            products.add(product.getName());
        }
        return products;
    }

    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    public void editProduct(Product editedProduct) throws MissingIdException {
        for (Product product : productList) {
            mapList.put(product.getId(), product);
        }
        if (mapList.containsKey(editedProduct.getId())) {
            mapList.replace(editedProduct.getId(), editedProduct);
        } else {
            throw new MissingIdException();
        }
        productList.clear();
        productList.addAll(mapList.values());
    }
}
