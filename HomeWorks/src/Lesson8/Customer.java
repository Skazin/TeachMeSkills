package Lesson8;

import java.util.concurrent.Semaphore;


public class Customer implements Runnable{

    private String name;
    private String productList;
    public int cashierNumber = 0;
    private static final boolean[] customerAllowed = new boolean[2]; //"Покупательское" место занято - true, свободно - false
    private static final Semaphore security = new Semaphore(2, true);


    public Customer(String name, String productList) {
        this.name = name;
        this.productList = productList;
    }

    @Override
    public void run() {
        try {
            System.out.println("Покупатель " + name + " зашел в аптеку.");
            //acquire() запрашивает доступ к следующему за вызовом этого метода блоку кода,
            //если доступ не разрешен, поток вызвавший этот метод блокируется до тех пор,
            //пока семафор не разрешит доступ
            security.acquire();

            //Покупатель смотрит есть ли свободные кассы

            for (int i = 0; i < 2; i++)
                if (!customerAllowed[i]) {      //Если есть касса,
                    customerAllowed[i] = true;  //подходим
                    cashierNumber = i + 1;
                    System.out.println("Покупатель " + name + " подходит к кассе №" + cashierNumber);
                    break;
                }

            Thread.sleep(3000);       //Рассчитываемся
            System.out.println("Покупатель " + name + " приобрел все товары из своего списка: " + productList);

            customerAllowed[cashierNumber] = false; //Выходим из аптеки

            security.release(); //release(), освобождает ресурс
            System.out.println("Покупатель " + name + " покинул аптеку.");
        } catch (InterruptedException e) {
            System.out.println("Покупателю " + name + " стало плохо...");
        }
    }
}
