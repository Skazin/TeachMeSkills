package Lesson4;

import java.util.LinkedList;
import java.util.List;

public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public int countPeople(Address address) {
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                count++;
            }
        }
        return count;
    }

    public int countPeople(String country) {
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(country)) {
                count++;
            }
        }
        return count;
    }

    public List<Person> getPeople(Address address) {
        List<Person> people = new LinkedList<>();
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        return people;
    }
    public List<Person> getFitPeople(Address address) {
        List<Person> people = new LinkedList<>();
        for (Person person : citizens) {
            if (person.getSex().equals("male")) {
                Address personsAddress = person.getAddress();
                int age = person.getAge();
                if (personsAddress.getCountry().equals(address.getCountry()) && age >= 18 && age <= 27) {
                    people.add(person);
                }
            }
        }
        return people;
    }

}
