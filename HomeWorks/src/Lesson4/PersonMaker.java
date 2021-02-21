package Lesson4;

import Lesson4.exeptions.InvalidNamingException;

import java.util.Locale;
import java.util.Scanner;

public class PersonMaker {

    private int numberOfPersons;

    public PersonMaker() {

    }

    public PersonMaker(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public Person makePerson() {
        Person person = new Person();
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите пол: \"male\" или \"female\":");
        String sex = in.nextLine();
        person.setSex(sex);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        try {
            person.setName(editString(name));
        } catch (InvalidNamingException e) {
            System.out.println("Неверно указано имя");
        }
        System.out.println("Введите фамилию:");
        String surname = in.nextLine();
        try {
            person.setSurname(editString(surname));
        } catch (InvalidNamingException e) {
            System.out.println("Неверно указана фамилия");
        }
        System.out.println("Введите возраст:");
        int age = in1.nextInt();
        person.setAge(age);
        System.out.println("Введите страну проживания:");
        String country = in1.nextLine();
        System.out.println("Введите город проживания:");
        String city = in1.nextLine();
        Address address = new Address(country, city);
        person.setAddress(address);
        return person;
    }

    public Person[] makeNPersons(int numberOfPersons) {
        Person[] persons = new Person[numberOfPersons];
        for (Person people: persons) {
            makePerson();
        }
        return persons;
    }

    private String editString(String word) throws InvalidNamingException {
        word = word.trim();
        if(word.contains(" ")) throw new InvalidNamingException();
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(Locale.ROOT);
    }
}
