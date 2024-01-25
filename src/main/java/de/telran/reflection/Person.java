package de.telran.reflection;

public class Person {

    @MyFirstAnnotation(value = "name")
    private String name;
    private String surname;
    private String city;

    public void die() {
        System.out.println("Я умер");
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCity() {
        return city;
    }
}
