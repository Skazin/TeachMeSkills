package Market;

import Market.Exceptions.MissingIdException;
import java.util.*;

public class Market {

    private Set<Product> productList = new LinkedHashSet<>();
    private Comparator<Product> c = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() - o2.getPrice() >= 0) return 1;
            else return -1;
        }
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
        boolean found = false;
        for (Product product : productList) {
            if (product.equals(editedProduct)) {
                found = true;
                product.setName(editedProduct.getName());
                product.setType(editedProduct.getType());
                product.setPrice(editedProduct.getPrice());
            }
        }
        if (!found) throw new MissingIdException();
    }

    public List<String> priceSort() {
        Set<Product> setOfProducts= new TreeSet<>(c);
        setOfProducts.addAll(listOfProducts());
        List<String> stringList = new LinkedList<>();
        for (Product product : setOfProducts) {
            stringList.add(product.getName());
        }
        return stringList;
    }

    public String orderOfAdditionSort() {
        StringBuilder builder = new StringBuilder();
        String[] arr = new String[productList.size()];
        List<String> products = new LinkedList<>();
        for (Product product : productList) {
            products.add(product.getName());
        }
        arr = products.toArray(new String[productList.size()]);
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
