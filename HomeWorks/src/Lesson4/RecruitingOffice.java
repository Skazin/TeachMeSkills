package Lesson4;

import Lesson4.exeptions.AgeException;
import Lesson4.exeptions.SexException;

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

    public void getFitPeopleToTheMilitaryUnit(Address address) throws SexException, AgeException {
        List<Person> peopleFromRegistry = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleFromRegistry) {
            int age = person.getAge();
            if(!person.getSex().equals("male")) throw new SexException ("Девушки в армии не служат.");
            if (age < 18 || age > 27) throw new AgeException ("Призывной возраст: 18 - 27 лет.");
            fitPeople.add(person);

        }
        for (Person rookie : fitPeople) {
            for (MilitaryUnit militaryUnit : militaryUnits) {
                    militaryUnit.recruit(rookie);
                    if (militaryUnit.recruited()) {
                        break;
                    }
            }
        }
    }

    public void getDraftValue() {
        draftValue = 0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            draftValue += militaryUnit.getDraftValue();
        }
        System.out.println("В данный призывной период необходимо собрать - " + draftValue + " призывников.");
    }
}
