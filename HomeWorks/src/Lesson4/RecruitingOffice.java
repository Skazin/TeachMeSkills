package Lesson4;

import java.util.LinkedList;
import java.util.List;

public class RecruitingOffice {
    private PersonRegistry registry;

    public RecruitingOffice(PersonRegistry registry){
        this.registry = registry;
    }

    public List<Person> getFitPeople(Address address) {
        return registry.getFitPeople(address);
    }
}
