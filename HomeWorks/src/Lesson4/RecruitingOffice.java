package Lesson4;

import java.util.LinkedList;
import java.util.List;

public class RecruitingOffice {

    private final PersonRegistry registry;

    public RecruitingOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List<Person> getFitPeople(Address address) {
        List<Person> peopleFromRegistry = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleFromRegistry) {
            int age = person.getAge();
            if (person.getSex().equals("male") && age >= 18 && age <= 27) {
                fitPeople.add(person);
            }
        }
        return fitPeople;
    }
}
