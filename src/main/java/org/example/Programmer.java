package org.example;

public class Programmer {

    private String name;
    private int age;
    private boolean wearsGlasses;

    public Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }
    public void drinkCoffee(){
        System.out.println("Espresso is the secret!");

    }
    public void printDetails(){
        System.out.println( name + " is a " + age + "-yo programmer");
    }
    public boolean hasGlasses(){
        System.out.println("Is Mario wearing glasses?");
        return wearsGlasses;

    }
}
