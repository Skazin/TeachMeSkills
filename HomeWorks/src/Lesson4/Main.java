package Lesson4;

import Lesson4.exeptions.AgeException;
import Lesson4.exeptions.SexException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person konstantin = new Person(19, "Konstantin", 185, "male");
        Address konstantinsAddress = new Address("Belarus", "Minsk");
        konstantin.setAddress(konstantinsAddress);

        Person konstantin2 = new Person(19, "Konstantin", 185, "male");
        Address konstantins2Address = new Address("Belarus", "Minsk");
        konstantin2.setAddress(konstantins2Address);

        Person gleb = new Person(25, "Gleb", 190, "male");
        Address glebsAddress = new Address("Belarus", "Minsk");
        gleb.setAddress(glebsAddress);

        Person oleg = new Person(21, "Oleg", 190, "male");
        Address olegsAddress = new Address("Belarus", "Minsk");
        oleg.setAddress(olegsAddress);

        Person vadim = new Person(22, "Vadim", 167, "male");
        Address vadimsAddress = new Address("Belarus", "Minsk");
        vadim.setAddress(vadimsAddress);

        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, konstantin2, oleg, vadim});

        MilitaryUnit militaryUnit1 = new MilitaryUnit("№56243", 100);
        MilitaryUnit militaryUnit2 = new MilitaryUnit("№56256", 100);
        MilitaryUnit militaryUnit3 = new MilitaryUnit("№79243", 100);
        MilitaryUnit militaryUnit4 = new MilitaryUnit("№56353", 100);
        MilitaryUnit militaryUnit5 = new MilitaryUnit("№52493", 100);
        MilitaryUnit[] militaryUnits = new MilitaryUnit[]{militaryUnit1, militaryUnit2, militaryUnit3, militaryUnit4, militaryUnit5};

        RecruitingOffice office = new RecruitingOffice(registry, militaryUnits);
        Address countryForServe = new Address("Belarus", "Minsk");
        try {
            office.getFitPeopleToTheMilitaryUnit(countryForServe);
        } catch (SexException e) {
            e.getMessage();
        } catch (AgeException e) {
            e.getMessage();
        }
        militaryUnit1.getInfo();
        militaryUnit1.getRecruitsList();
        militaryUnit2.getInfo();
        militaryUnit3.getInfo();
        militaryUnit4.getInfo();
        militaryUnit5.getInfo();
    }
}
