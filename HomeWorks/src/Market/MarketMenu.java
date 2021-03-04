package Market;

import Market.Exceptions.MissingIdException;

import java.util.Date;
import java.util.Scanner;

public class MarketMenu {

    private boolean opened = true;
    private final Scanner in = new Scanner(System.in);
    private int choice;

    public MarketMenu() {

    }

    public void start(Market market) {
        System.out.println("Добро пожаловать в наш магазин!");
        menuCircle(market);
    }

    public void menuList() {
        System.out.println("Выберите действие (укажите номер действия):");
        System.out.println("1. Список товаров.");
        System.out.println("2. Добавить новый товар.");
        System.out.println("3. Удалить существующий товар.");
        System.out.println("4. Изменить существующий товар по ID.");
        System.out.println("5. Изменить количество существующего товара по ID.");
        System.out.println("6. Купить товар по ID.");
        System.out.println("7. Бухгалтерия.");
        System.out.println("8. Выход.");
    }

    public void menuCircle(Market market) {
        if (opened) {
            menuList();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    sortChoice(market);
                    menuCircle(market);
                    break;
                case 2:
                    market.addProduct(additionMenu());
                    menuCircle(market);
                    break;
                case 3:
                    market.deleteProduct(deletionMenu());
                    menuCircle(market);
                    break;
                case 4:
                    try {
                        market.editProduct(editionMenu());
                        menuCircle(market);
                        break;
                    } catch (MissingIdException e) {
                        System.out.println("Товара с ID - " + editionMenu().getId() + " нет в списке товаров, попробуйде добавить такой товар.");
                    }
                case 5:
                    setNumber(market);
                    menuCircle(market);
                    break;
                case 6:
                    buyingDesire(market);
                    menuCircle(market);
                    break;
                case 7:
                    buh(market);
                    menuCircle(market);
                    break;
                case 8:
                    opened = false;
                    System.out.println("Всего доброго! Приходите еще!");
                    break;
            }
        }
    }

    public void sortChoice(Market market) {
        System.out.println("Введите желаемую сортировку (номер сортировки):");
        System.out.println("1. Сортировка по цене товаров.");
        System.out.println("2. Сортировка по приходу товаров в магазин (начиная с новых товаров).");
        System.out.println("3. Вернуться в меню.");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                market.priceSort();
                sortChoice(market);
            }
            case 2 -> {
                market.orderOfAdditionSort();
                sortChoice(market);
            }
            case 3 -> menuCircle(market);
        }
    }

    public Product additionMenu() {
        System.out.println("Введите критерии для нового товара1:");
        System.out.println("Введите ID товара:");
        int id = in.nextInt();
        System.out.println("Введите наименование товара:");
        String name = in.nextLine();
        System.out.println("Введите товарную группу:");
        String type = in.nextLine();
        System.out.println("Введите цену товара:");
        int price = in.nextInt();
        System.out.println("Введите количество товара:");
        int numberOfProducts = in.nextInt();
        return new Product(id,name, type, price, numberOfProducts);
    }

    public int deletionMenu() {
        System.out.println("Введите ID товара, который Вы собираетесь удалить:");
        return in.nextInt();
    }

    public Product editionMenu() {
        System.out.println("Введите критерии для нового товара:");
        System.out.println("Введите ID товара:");
        int id = in.nextInt();
        System.out.println("Введите наименование товара:");
        String name = in.nextLine();
        System.out.println("Введите товарную группу:");
        String type = in.nextLine();
        System.out.println("Введите цену товара:");
        int price = in.nextInt();
        System.out.println("Введите количество товара:");
        int numberOfProducts = in.nextInt();
        return new Product(id,name, type, price, numberOfProducts);
    }

    public void setNumber(Market market) {
        System.out.println("Введите ID существующего товара:");
        int id = in.nextInt();
        System.out.println("Введите новое количество товара:");
        int numberOfProducts = in.nextInt();
        try {
            market.editNumber(id, numberOfProducts);
        } catch (MissingIdException e) {
            System.out.println("Товара с ID - " + id + " нет в списке товаров, попробуйде добавить такой товар.");
        }
    }

    public void buyingDesire(Market market) {
        System.out.println("Введите ID товара, который Вы собираетесь купить:");
        int id = in.nextInt();
        System.out.println("Введите новое количество товара, которое Вы собираетесь купить:");
        int numberOfProducts = in.nextInt();
        try {
            for (Product product : market.listOfProducts()) {
                if (product.getId() == id)
                    if (product.getNumberOfThis() >= numberOfProducts) {
                    payment(market, product, id, numberOfProducts);
                    } else {
                        System.out.println("Товара " + product.getName() + " не достаточно, чтобы удовлетворить ваш запрос (в данный момент его " + product.getNumberOfThis() + "шт). " +
                                "Выберите действие:");
                        System.out.println("1. Купить весь товар в наличии.");
                        System.out.println("2. Отменить чек и вернуться в меню.");
                        choice = in.nextInt();
                        switch (choice) {
                            case 1 -> payment(market, product, id, product.getNumberOfThis());
                            case 2 -> menuCircle(market);
                        }
                    }
            }
        } catch (MissingIdException e) {
            System.out.println("Товара с ID - " + id + " нет в списке товаров, попробуйде добавить такой товар.");
        }
    }

    public void buh(Market market) {
        System.out.println("Выберите действие (укажите номер действия):");
        System.out.println("1. Количество товарных групп.");
        System.out.println("2. Общее количество товаров.");
        System.out.println("3. Средняя стоимость всех товаров в магазине.");
        System.out.println("4. Средняя стоимость всех товаров по товарным группам.");
        System.out.println("5. Вернуться в меню.");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                market.numberOfTypes();
                buh(market);
            }
            case 2 -> {
                market.numberOfProducts();
                buh(market);
            }
            case 3 -> {
                market.averagePrice();
                buh(market);
            }
            case 4 -> {
                market.averageTypePrice();
                buh(market);
            }
            case 5 -> menuCircle(market);
        }
    }

    private void payment(Market market, Product product, int id, int number) throws MissingIdException {
        int sum = product.getPrice() * number;
        market.editNumber(id, product.getNumberOfThis() - number);
        System.out.println("Товарный чек (" + new Date().toString() + "):");
        System.out.println("Товар: " + product.getName());
        System.out.println("ID: " + product.getId());
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Количество: " + number);
        System.out.println("Сумма по чеку:" + sum);
    }
}
