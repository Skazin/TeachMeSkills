package Lesson4;

import Lesson4.exeptions.InvalidNamingException;

import java.util.Locale;
import java.util.Random;

public class Person {
    private Address address;
    private int age;
    private String name;
    private String surname;
    private int height;
    private String sex;

    public Person() {
    }

    public Person( String name, String surname, int age, int height, String sex) {
        this.age = age;
        try{
            name = editString(name);
            this.name = name;
        } catch (InvalidNamingException e) {
            System.out.println("При создании человека было неверно указано имя");
        }
        try{
            surname = editString(surname);
            this.surname = surname;
        } catch (InvalidNamingException e) {
            System.out.println("При создании человека была неверно указана фамилия");
        }
        this.height = height;
        this.sex = sex;
    }


    public void info() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    private String editString(String word) throws InvalidNamingException {
        word = word.trim();
        if(word.contains(" ")) throw new InvalidNamingException();
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(Locale.ROOT);
    }
}
