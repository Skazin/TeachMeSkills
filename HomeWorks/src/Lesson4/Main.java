package Lesson4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person konstantin = new Person(30, "Konstantin", "male");
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        konstantin.setAddress(konstantinsAddress);

        Person gleb = new Person(40, "Gleb", 190, "male");
        Address glebsAddress = new Address("Belarus", "Vitebsk");
        gleb.setAddress(glebsAddress);

        Person oleg = new Person(38, "Oleg", "male");
        Address olegsAddress = new Address("Belarus", "Braslav");
        oleg.setAddress(olegsAddress);

        Person vadim = new Person(30, "Vadim", "male");
        Address vadimsAddress = new Address("Belarus", "Smorgon'");
        vadim.setAddress(vadimsAddress);

        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim});

        System.out.println(registry.countPeople(new Address("Belarus", "Vitebsk")));
        System.out.println(registry.countPeople(new Address("Belarus", "Krarow")));
        System.out.println(registry.countPeople("Belarus"));


        List<Person> personList = registry.getPeople(new Address("Belarus", "Vitebsk"));
        for (Person person : personList) {
            System.out.println(person.getName());
        }

    }
}
