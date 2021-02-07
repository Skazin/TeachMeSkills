package Lesson4;

import java.util.LinkedList;
import java.util.List;

public class RecruitingOffice {

    private final PersonRegistry registry;
    private MilitaryUnit[] militaryUnits;
    private int draftValue;

    public RecruitingOffice(PersonRegistry registry, MilitaryUnit[] militaryUnits) {
        this.registry = registry;
        this.militaryUnits = militaryUnits;
    }

    public void getFitPeopleToTheMilitaryUnit(Address address) {
        List<Person> peopleFromRegistry = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleFromRegistry) {
            int age = person.getAge();
            if (person.getSex().equals("male") && age >= 18 && age <= 27) {
                fitPeople.add(person);
            }
        }
        for (Person rookie : fitPeople) {
            for (MilitaryUnit militaryUnit : militaryUnits) {
                    militaryUnit.recruit(rookie);
                    if (militaryUnit.isRecruited()) {
                        break;
                    }
            }
        }
    }

    public void getDraftValue(){
        draftValue = 0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            draftValue += militaryUnit.getDraftValue();
        }
        System.out.println("В данный призывной период необходимо собрать - " + draftValue + " призывников.");
    }
}
