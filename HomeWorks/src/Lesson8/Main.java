package Lesson8;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Customer customer1 = new Customer("Иван", "Валерианы настойка");
        Customer customer2 = new Customer("Петр", "Лирика");
        Customer customer3 = new Customer("Сергей", "Постинор");
        Customer customer4 = new Customer("Виктор", "Парацетамол, Витамин Д, Витамин С, Цинк");
        Customer customer5 = new Customer("Евгений", "Азитромицин, Бронхолитин, Линекс");
        Customer customer6 = new Customer("Сергей", "Постинор");
        Customer customer7 = new Customer("Виктор", "Парацетамол, Витамин Д, Витамин С, Цинк");
        Customer customer8 = new Customer("Евгений", "Азитромицин, Бронхолитин, Линекс");
        Customer customer9 = new Customer("Сергей", "Постинор");
        Customer customer10 = new Customer("Виктор", "Парацетамол, Витамин Д, Витамин С, Цинк");
        Customer customer11 = new Customer("Евгений", "Азитромицин, Бронхолитин, Линекс");

        Customer[] customers = new Customer[] {customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10, customer11};

        for (Customer customer : customers) {
            new Thread(customer).start();
            Thread.sleep(400);
        }
    }
}
