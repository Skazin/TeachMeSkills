package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int resource;

    {
        cpu = "Intel Pentium IV";
        ram = "HyperX 512MB";
        hdd = "SSD 512GB";
        resource = 100;
    }

    public Computer(){}

    public Computer(String cpu, String ram, String hdd, int resource){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void info(){
        System.out.println("Информация о компьютере: ");
        System.out.println("Процессор: " + cpu);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Жесткий диск: " + hdd);
        System.out.println("Ресурс полных циклов работы (включений/выключений): " + resource);
    }

    public void on(){
        if(resource > 0){
        Scanner in = new Scanner(System.in);
        System.out.println("Для включения компьютера выберите 0 или 1: ");
        int operatorChoice = in.nextInt();
        Random random = new Random();
        int compChoice = random.nextInt(2);
            if (operatorChoice == compChoice){
                System.out.println("Вы включили компьютер");
                resource--;
            } else {
               resource = 0;
                System.out.println("Компьютер не включен, возможны сбои в дальнейшей работе.");
            }
        } else {
            System.out.println("Материнская плата сгорела, обратитесь в сервисный центр.");
        }
    }

    public void off(){
        if(resource > 0){
        Scanner in = new Scanner(System.in);
        System.out.println("Для выключения компьютера выберите 0 или 1: ");
        int operatorChoice = in.nextInt();
        Random random = new Random();
        int compChoice = random.nextInt(2);
            if (operatorChoice == compChoice){
                System.out.println("Вы выключили компьютер");
                resource--;
            } else {
                resource = 0;
                System.out.println("Компьютер не выключен, возможны сбои в дальнейшей работе.");
            }
        } else {
            System.out.println("Материнская плата сгорела, обратитесь в сервисный центр.");
        }
    }
}
