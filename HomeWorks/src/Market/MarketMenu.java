package Market;

import Market.Exceptions.InvalidValueException;
import Market.Exceptions.MissingIdException;

import java.util.Date;
import java.util.Scanner;

public class MarketMenu {

    private boolean opened = true;
    private final Scanner inInt = new Scanner(System.in);
    private final Scanner inString = new Scanner(System.in);
    private int choice;

    public MarketMenu() {

    }

    /**
     * Method starts work of our market
     * @param market - market for work with
     */
    public void start(Market market) {
        System.out.println("Добро пожаловать в наш магазин!");
        menuCircle(market);
    }

    /**
     * Method represents menu logic
     */
    public void menuCircle(Market market) {
        if (opened) {
            menuList();
            choice = inInt.nextInt();
            switch (choice) {
                case 1:
                    sortChoice(market);
                    menuCircle(market);
                    break;
                case 2:
                    additionMenu(market);
                    menuCircle(market);
                    break;
                case 3:
                    deletionMenu(market);
                    menuCircle(market);
                    break;
                case 4:
                    editionMenu(market);
                    menuCircle(market);
                    break;
                case 5:
                    setNumber(market);
                    menuCircle(market);
                    break;
                case 6:
                        buyingDesire(market);
                        menuCircle(market);
                        break;
                case 7:
                    bookkeping(market);
                    menuCircle(market);
                    break;
                case 8:
                    opened = false;
                    System.out.println("Всего доброго! Приходите еще!");
                    break;
                default:
                    menuCircle(market);
                    break;
            }
        }
    }

    /**
     * Method visualizes menu
     */
    private void menuList() {
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

    /**
     * Method chooses which kind of sort u need
     * @param market - market we work with
     */
    private void sortChoice(Market market) {
        System.out.println("Введите желаемую сортировку (номер сортировки):");
        System.out.println("1. Сортировка по возрастанию цены товара.");
        System.out.println("2. Сортировка по убыванию цены товара.");
        System.out.println("3. Сортировка по приходу товаров в магазин (начиная с новых товаров).");
        System.out.println("4. Вернуться в меню.");
        choice = inInt.nextInt();
        switch (choice) {
            case 1 -> {
                market.priceSortIncrease();
                sortChoice(market);
            }
            case 2 -> {
                market.priceSortDecrease();
                sortChoice(market);
            }
            case 3 -> {
                market.orderOfAdditionSort();
                sortChoice(market);
            }
            case 4 -> menuCircle(market);
        }
    }

    /**
     * Method adds new product to our market
     * @param market - market we work with
     */
    private void additionMenu(Market market) {
        System.out.println("Введите критерии для нового товара:");
        System.out.println("Введите ID товара:");
        int id = inInt.nextInt();
        System.out.println("Введите наименование товара:");
        String name = inString.nextLine();
        System.out.println("Введите товарную группу:");
        String type = inString.nextLine();
        System.out.println("Введите цену товара:");
        int price = inInt.nextInt();
        System.out.println("Введите количество товара:");
        int numberOfProducts = inInt.nextInt();
        try {
            Product product = new Product(id,name, type, price, numberOfProducts);
            market.addProduct(product);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
            System.out.println("Выберите действие:");
            System.out.println("1. Попробовать добавить товар снова.");
            System.out.println("2. Вернуться в меню");
            choice = inInt.nextInt();
            switch (choice) {
                case 1 -> additionMenu(market);
                case 2 -> menuCircle(market);
            }

        }

    }

    /**
     * Method deletes product in our market
     * @param market - market we work with
     */
    private void deletionMenu(Market market) {
        System.out.println("Введите ID товара, который Вы собираетесь удалить:");
        int id = inInt.nextInt();
        market.deleteProduct(id);
    }

    /**
     * Method edits product in our market
     * @param market - market we work with
     */
    private void editionMenu(Market market) {
        System.out.println("Введите критерии для нового товара:");
        System.out.println("Введите ID товара:");
        int id = inInt.nextInt();
        System.out.println("Введите наименование товара:");
        String name = inString.nextLine();
        System.out.println("Введите товарную группу:");
        String type = inString.nextLine();
        System.out.println("Введите цену товара:");
        int price = inInt.nextInt();
        System.out.println("Введите количество товара:");
        int numberOfProducts = inInt.nextInt();
        try {
            Product product = new Product(id,name, type, price, numberOfProducts);
            market.editProduct(product);
        } catch (MissingIdException e) {
            System.out.println(e.getMessage());
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
            System.out.println("Выберите действие:");
            System.out.println("1. Попробовать изменить товар снова.");
            System.out.println("2. Вернуться в меню");
            choice = inInt.nextInt();
            switch (choice) {
                case 1 -> editionMenu(market);
                case 2 -> menuCircle(market);
            }
        }
    }

    /**
     * Method sets number of specific product in our market
     * @param market - market we work with
     */
    private void setNumber(Market market) {
        System.out.println("Введите ID существующего товара:");
        int id = inInt.nextInt();
        System.out.println("Введите новое количество товара:");
        int numberOfProducts = inInt.nextInt();
        try {
            market.editNumber(id, numberOfProducts);
        } catch (MissingIdException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method shows that we want to buy smth
     * @param market - market we work with
     */
    private void buyingDesire(Market market) {
        System.out.println("Введите ID товара, который Вы собираетесь купить:");
        int id = inInt.nextInt();
        System.out.println("Введите количество товара, которое Вы собираетесь купить:");
        int numberOfProducts = inInt.nextInt();
        for (Product product : market.listOfProducts()) {
            if (product.getId() == id) {
                if (product.getNumberOfThis() >= numberOfProducts) {
                    payment(market, product, id, numberOfProducts);
                } else {
                    System.out.println("Товара " + product.getName() + " не достаточно, чтобы удовлетворить ваш запрос (в данный момент его " + product.getNumberOfThis() + "шт). " +
                            "Выберите действие:");
                    System.out.println("1. Купить весь товар в наличии.");
                    System.out.println("2. Отменить чек и вернуться в меню.");
                    choice = inInt.nextInt();
                    switch (choice) {
                        case 1 -> payment(market, product, id, product.getNumberOfThis());
                        case 2 -> menuCircle(market);
                    }
                }
            }
        }
    }

    /**
     * Method makes final settlement of our purchase
     * @param market - market we work with
     * @param product - specific product that we want to buy
     * @param id - id of this product
     * @param number - quantity of buyable product
     */
    private void payment(Market market, Product product, int id, int number) {
        int sum = product.getPrice() * number;
        try {
            market.editNumber(id, product.getNumberOfThis() - number);
        } catch (MissingIdException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Товарный чек (" + new Date().toString() + "):");
        System.out.println("Товар: " + product.getName());
        System.out.println("ID: " + product.getId());
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Количество: " + number);
        System.out.println("Сумма по чеку:" + sum);
    }

    /**
     * Method allows to work with market's bookkeping
     * @param market - market we work with
     */
    private void bookkeping(Market market) {
        Bookkeping bookkeping = new Bookkeping(market);
        System.out.println("Выберите действие (укажите номер действия):");
        System.out.println("1. Количество товарных групп.");
        System.out.println("2. Общее количество товаров.");
        System.out.println("3. Средняя стоимость всех товаров в магазине.");
        System.out.println("4. Средняя стоимость всех товаров по товарным группам.");
        System.out.println("5. Вернуться в меню.");
        choice = inInt.nextInt();
        switch (choice) {
            case 1 -> {
                bookkeping.numberOfTypes();
                bookkeping(market);
            }
            case 2 -> {
                bookkeping.numberOfProducts();
                bookkeping(market);
            }
            case 3 -> {
                bookkeping.averagePrice();
                bookkeping(market);
            }
            case 4 -> {
                bookkeping.averageTypePrice();
                bookkeping(market);
            }
            case 5 -> menuCircle(market);
        }
    }
}
