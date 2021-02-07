package Lesson4;

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

        MilitaryUnit militaryUnit1 = new MilitaryUnit("№56243");
        MilitaryUnit militaryUnit2 = new MilitaryUnit("№56256");
        MilitaryUnit militaryUnit3 = new MilitaryUnit("№79243");
        MilitaryUnit militaryUnit4 = new MilitaryUnit("№56353");
        MilitaryUnit militaryUnit5 = new MilitaryUnit("№52493");
        MilitaryUnit[] militaryUnits = new MilitaryUnit[]{militaryUnit1, militaryUnit2, militaryUnit3, militaryUnit4, militaryUnit5};

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
            System.out.println("Введите город проживания:");
            String city = in1.nextLine();
            Address address = new Address(country, city);
            person.setAddress(address);
        }

        PersonRegistry registry = new PersonRegistry(people);


        RecruitingOffice office = new RecruitingOffice(registry, militaryUnits);
        Address countryForServe = new Address("Belarus", "Minsk");
        office.getFitPeopleToTheMilitaryUnit(countryForServe);

    }
}
