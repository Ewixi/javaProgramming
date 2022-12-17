package Dziedziczenie;

public class MathTeacher extends Person {
    public String school;
    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void TeachMath(){


        eat();
        walk();
        System.out.println("I am teaching math");
    }
    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am "+ age);
    }
}
