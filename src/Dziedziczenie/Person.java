package Dziedziczenie;

public class Person {



    public String name;
    public int age;
    public Person (String name, int age){    //kontruktor dla zmiennych name, age)
        this.name = name;
        this.age = age;
    }

    public /*final*/ void eat(){
        System.out.println("I like pizza!");

    }
    public void walk(){
        System.out.println("I like walking");
    }



}
