package Lesson4;


import Lesson4.exeptions.SexException;
import Lesson4.exeptions.ValueException;

import java.util.LinkedList;
import java.util.List;

public class MilitaryUnit {

    private final String name;
    private int maxValue;
    private final List<Person> recruits = new LinkedList<>();
    private boolean isRecruited;


    public MilitaryUnit(String name, int maxValue) {
        this.name = name;
        this.maxValue = maxValue;
    }

    public void recruit(Person rookie) throws ValueException {
        isRecruited = false;
        if (maxValue == 0) throw new  ValueException("Воинская часть: " + name + " - заполнена целиком.");
            for (Person man : recruits) {
                if ((rookie.getAge() == man.getAge()) && rookie.getName().equals(man.getName()) && (rookie.getHeight() == man.getHeight())) {
                        System.out.println("Призывник " + rookie.getName() + " уже приписан к воинской части " + name + ".");
                        isRecruited = true;
                        break;
                }
            }
            if (!isRecruited) {
                recruits.add(rookie);
                maxValue--;
                }

    }

    public void getInfo() {
        System.out.println("Воинская часть: " + name);
        if(maxValue == 0) {
            System.out.println("Воинская часть заполнена целиком.");
        } else {
            System.out.println("Количество служащих на данный момент : " + (100 - maxValue) + ".");
            System.out.println("Количество свободных мест на данный момент : " + maxValue + ".");
        }
    }

    public int getDraftValue(){
        return maxValue;
    }

    public void getRecruitsList(){
        System.out.println("Список служащих в воинской части " + name +":");
        for (Person rookie : recruits) {
            System.out.println(rookie.getName() + ", " + rookie.getAge() + " лет.");
        }
    }

    public boolean recruited(){
        return isRecruited;
    }

}