package Dziedziczenie;

public class Footballer extends Person{   //extends Person - dziedziczenie po Person
    public String footballClub;
    public Footballer(String name, int age,String footballClub){
        super(name, age);
        this.footballClub = footballClub;
    }
    public void eat(){  // dodanie słowa final
    }
    public void playFootball(){
        eat();
        walk();
        System.out.println("I play football" + name);
    }

}
