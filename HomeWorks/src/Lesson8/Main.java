package Lesson8;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Customer customer1 = new Customer("Иван", "Валерианы настойка");
        Customer customer2 = new Customer("Петр", "Лирика");
        Customer customer3 = new Customer("Сергей", "Постинор");
        Customer customer4 = new Customer("Виктор", "Парацетамол, Витамин Д, Витамин С, Цинк");
        Customer customer5 = new Customer("Евгений", "Азитромицин, Бронхолитин, Линекс");

        Customer[] customers = new Customer[] {customer1, customer2, customer3, customer4, customer5};

        for (Customer customer : customers) {
            new Thread(customer).start();
            Thread.sleep(400);
        }
    }
}
