package Lesson4;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class HomeWork4Main {
    public static void main(String[] args) {



        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person[] people = new Person[]{person1, person2, person3, person4, person5};

        System.out.println("Создайте 5 граждан");
        for (Person person : people) {
            Scanner in = new Scanner(System.in);
            Scanner in1 = new Scanner(System.in);
            System.out.println("Введите пол: \"male\" или \"female\":");
            String sex = in.nextLine();
            person.setSex(sex);
            System.out.println("Введите имя:");
            String name = in.nextLine();
            person.setName(name);
            System.out.println("Введите возраст:");
            int age = in.nextInt();
            person.setAge(age);
            System.out.println("Введите страну проживания:");
            String country = in1.nextLine();
            Address address = new Address(country);
            person.setAddress(address);
        }

        PersonRegistry registry = new PersonRegistry(people);


        RecruitingOffice office = new RecruitingOffice(registry);
        Address countryForServe = new Address("Belarus");
        List<Person> fitPersons = office.getFitPeople(countryForServe);
        System.out.println("Список граждан годных к службе в стране " + countryForServe.toString() + ": ");
        for (Person person : fitPersons) {
            System.out.println(person.getName() + " " + person.getAge() + " лет.");

        }
    }
}
