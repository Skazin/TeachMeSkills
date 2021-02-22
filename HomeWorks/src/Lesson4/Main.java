package Lesson4;

import Lesson4.exeptions.InvalidNamingException;

public class Main {
    public static void main(String[] args) {
        try {
            Person konstantin = new Person("Konstantin", "Pupa", 19, 185, "male");
            Address konstantinsAddress = new Address("Belarus", "Minsk");
            konstantin.setAddress(konstantinsAddress);

            Person konstantin2 = new Person("Konstantin", "Lupa", 19, 185, "male");
            Address konstantins2Address = new Address("Belarus", "Minsk");
            konstantin2.setAddress(konstantins2Address);

            Person gleb = new Person("Gleb", "A", 25, 190, "male");
            Address glebsAddress = new Address("Belarus", "Minsk");
            gleb.setAddress(glebsAddress);

            Person oleg = new Person("Oleg", "B", 21, 190, "male");
            Address olegsAddress = new Address("Belarus", "Minsk");
            oleg.setAddress(olegsAddress);

            Person vadim = new Person("Vadim", "C", 22, 167, "male");
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
            office.getFitPeopleToTheMilitaryUnit(countryForServe);

            militaryUnit1.getInfo();
            militaryUnit1.getRecruitsList();
            militaryUnit1.getEditedRecruitsList();

            Person personA = new Person("Miha ", " naME ", 25, 457, "male");
            System.out.println(personA.getName());
            System.out.println(personA.getSurname());
        } catch (InvalidNamingException e) {
            System.out.println("При создании человека были указаны неверно имя и/или фамилия.");
        }




    }
}
